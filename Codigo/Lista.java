
import java.io.Serializable;

public class Lista<T extends Serializable> implements Serializable {
    
    // Clase Nodo no estática para acceder al genérico T
    private class Nodo implements Serializable{
        public T elemento;
        public Nodo siguiente;
        
        public Nodo(T elemento){
            this.elemento = elemento;
        }
    }


    /**Nodo inicial de la lisa */
    private Nodo cabeza;

    /**Nodo ltimo de la lista */
    private Nodo cola;

    /**Cantidad de elementos ne la lsita */
    private int longitud;

    /**
     * Insertar un nuevo elemento  en la posición i
     * 
     * @param i la posición donde vamos a insertar el elemento
     * @param e el elemento que se va a insertar 
     * @throws IndexOutOfBoundsException si el indice esta fuera del rago 
     */
    public void add(int i, T e)throws IndexOutOfBoundsException{
        if(i < 0 || i > longitud){
            throw new IndexOutOfBoundsException("EL indice no esta en el rango");
        }
        Nodo nuevo = new Nodo(e);

        //Caso lista vacia
        if (cabeza == null){
            cabeza= nuevo;
            cola = nuevo;
            longitud ++;
            return;
        }

        //Agregar en la posición 0
        if(i == 0){
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            longitud ++;
            return;
        } 

        //Agregar al final
        if(i == longitud){
            cola.siguiente = nuevo;
            cola = nuevo;
            longitud++;
            return;
        }

        //Agregarlo en cualquier otra posicion
        //Crear un iterador en la cabeza
        Nodo iterador = cabeza;
        for(int j = 0; j<i-1; j++){
            iterador = iterador.siguiente;
        }
        nuevo.siguiente = iterador.siguiente;
        iterador.siguiente = nuevo;
        longitud++;
    }

    /** 
     * Elimina un elemento en la posición i, y te regresa el elemento que se esta eliminando
     * 
     * @param i indice del elemento que se va a eliminar
     * @throws IndexOutOfBoundsException si el indice esta fuera del rango
     */
    public T remove(int i) throws IndexOutOfBoundsException{
        if(i < 0 || i>=longitud){
            throw new IndexOutOfBoundsException("El indice no esta en el rango");
        }
        T eliminado = null;

        //eliminar el unico elemento
        if(longitud == 1){
            eliminado = cabeza.elemento;
            clear();
            return eliminado;
        } 
        //Elemeno por eliminar es el primero
        if(i == 0){
            eliminado = cabeza.elemento;
            cabeza = cabeza.siguiente;
            longitud--;
            return eliminado;
        }
        else if (i == longitud-1){
            eliminado = cola.elemento;
            Nodo iterador = cabeza;
            for (int j = 0; j<longitud-2; j++){
                iterador = iterador.siguiente;
            }
            cola = iterador;
            cola.siguiente = null;
            longitud--;
            return eliminado;
        }

        Nodo iterador = cabeza;
        for (int j = 0; j<longitud-2; j++){
            iterador = iterador.siguiente;
        }
        eliminado= iterador.siguiente.elemento;
        iterador.siguiente = iterador.siguiente.siguiente;
        longitud--;
        return eliminado;
    }

    /** 
      * Elimina todos los elementos de una lista
      */
      public void clear(){
        cabeza= null;
        cola = null;
        longitud = 0;
   }

    /**
     * Obtener un elemento en una posición especifica
     * 
     * @param i indice del elemento en la posición i
     * @throws IndexOutOfBoundsException;
     */
    public T get(int i) throws IndexOutOfBoundsException{
        if(i < 0 || i>=longitud){
            throw new IndexOutOfBoundsException("El indice no esta en el rango");
        }
        if (isEmpty()){
            throw new IndexOutOfBoundsException("La lista esta vacia");
        }
        if(i == 0){
            return cabeza.elemento;
        }
        Nodo iterador = cabeza;
        for(int j=0; j<i; j++){
            iterador =iterador.siguiente;
        }
        return iterador.elemento;
    }

    /**
     * Método para verificar si un elemento esta en la lista
     * 
     * @param e Elemento que se va a buscar
    */
    public boolean contains(T e){
        if(isEmpty()){
            return false;
        }
        if(longitud==1){
            return e.equals(cabeza.elemento);
        }
        Nodo iterador = cabeza;
        for(int i =0; i< longitud; i++){
            if (e.equals(iterador.elemento)){
                return true;
            }
            iterador = iterador.siguiente;
        }
        return false;
    }
    
    /**
     * Método que regresa el índice del elemento en la lista
     * 
     * @param e Elemento a buscar el indice
     * @return Indice del elemento
     */
    public int lookUp(T e){
        if(!contains(e)) return -1;
        Nodo iterador = cabeza;
        for(int i = 0; i < longitud; i++){
            if (e.equals(iterador.elemento)){
                return i;
            }
            iterador = iterador.siguiente;
        }
        return -1;
    }

    /**
     * Varifica si la lista esta vacia
     */
    public boolean isEmpty(){
        return longitud == 0;
    }

    public int size(){
        return longitud;
    }
}