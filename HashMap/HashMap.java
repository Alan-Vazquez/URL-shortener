import java.io.Serializable;

/**
 * Clase que modela una tabla hash para almacenar URLs
 * @author José María Hernández Pérez y Alan Vazquez Serralta
 * @version 1.0 
 * @date 15-may-2025
 */
public class HashMap implements Serializable {
    /**
     * El tamaño de la tabla. Se puede modificar para escalar el tamaño al requerido.
     */
    public static final int SIZE = 65536;
    /**
     * Listas de enlaces que servirán para manejar las colisiones.
     */
    private Lista<Link>[] cols;

    /**
     * Constructor por omisión. Inicializa la tabla hash con listas vacías.
     */
    @SuppressWarnings("unchecked")
    public HashMap() {
        cols = (Lista<Link>[]) new Lista[SIZE];
        for (int i = 0; i < SIZE; i++) {
            cols[i] = new Lista<>();
        }
    }

    /**
     * Inserta un Link en la cola de la lista correspondiente según su hashcode.
     * @param link El objeto Link a agregar.
     * @return El identificador acortado del enlace.
     * @throws Exception Si ocurre un error al calcular el hash del link.
     */
    public String add(Link link) throws Exception {
        int index = link.toHashCode() % SIZE; 
        if (index < 0) index += SIZE; 
        cols[index].add(cols[index].size(), link);
        return shorten(link.getLink());
    }

    /**
     * Convierte una cadena a link, y posteriormente la inserta en la cola de la lista correspondiente según su hashcode.
     * @param url Cadena del enlace a insertar.
     * @return El identificador acortado del enlace.
     * @throws Exception Si la URL es inválida o ocurre un error al insertar.
     */
    public String put(String url) throws Exception {
        Link link = new Link(url);
        return add(link);
    }

    /**
     * Regresa la lista en cierto indice de la tabla.
     * @param index La posición en la que se busca.
     * @return la Lista de Link en ese índice.
     * @throws IndexOutOfBoundsException Si el índice está fuera del rango.
     */
    public Lista<Link> getCol(int index) {
        if (index < 0 || index >= SIZE) 
            throw new IndexOutOfBoundsException("Indice de colision invalido");
        return cols[index];
    }

    /**
     * Elimina un enlace del hash si se encuentra
     * @param url La cadena del enlace a eliminar
     * @throws Exception Si la URL es inválida o ocurre un error al procesarla
     */
    public void remove(String url) throws Exception {
        Link link = new Link(url);
        int index = link.toHashCode() % SIZE;
    
        Lista<Link> lista = cols[index];
        if (lista == null || lista.isEmpty()) return;
    
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(link)) {
                lista.remove(i);
                return;
            }
        }
    }
    
    /**
     * Regresa el nombre acortado de un link almacenado en la tabla hash en el formato HHHHID
     * HHHH: Los primeros 4 dígitos son su índice en hexadecimal: 0000 es 0, y FFFF es 65535.
     * ID: Todos los dígitos posteriores al cuarto son su índice en la lista contenida en ese índice, en hexadecimal. De modo que FFFF10 será la posición 16 de la lista contenida en el índice 65535.
     * @param l La cadena a buscar
     * @return El identiicador del enlace en la tabla hash
     * @throws Exception Si la cadena no se encontró en el hash
     */
    public String shorten(String l) throws Exception {
        Link link = new Link(l);
        if (contains(l)) {
            int hash = link.toHashCode();
            int index = hash % SIZE;
            int pos = cols[index].lookUp(link);
            String iHex = String.format("%04x", hash & 0xFFFF); 
            String idHex = Integer.toHexString(pos);
            return iHex + idHex;
        }
        throw new Exception("No se encontro el link");
    }

    /**
     * Verifica si la URL ya está almacenada.
     * @param url cadena del enlace a buscar
     * @return true si existe en la tabla, false en caso contrario
     * @throws Exception Si la URL es inválida
     */
    public boolean contains(String url) throws Exception {
        Link link = new Link(url);
        int index = link.toHashCode() % SIZE;
        if (index < 0 || index >= SIZE) return false;
        return cols[index].contains(link);
    }


    /**
     * Obtiene el objeto Link correspondiente a su nombre acortado.
     * @param shortened El identificador acortado del enlace.
     * @return El objeto Link original si existe; null en caso contrario.
     * @throws Exception Si el identificador es inválido o no se encuentra.
     */
    public Link getLink(String shortened) throws Exception{
        if (shortened.length() < 5) throw new Exception("El enlace es invalido");
        String indiceHex = shortened.substring(0, 4);
        String idHex = shortened.substring(4);
        int indiceHash = aDecimal(indiceHex);
        int id = aDecimal(idHex);
        if (indiceHash < 0 || indiceHash >= cols.length) throw new Exception("El enlace es invalido");
        Lista<Link> indice = cols[indiceHash];
        if (indice == null || id < 0 || id >= indice.size()) return null;
        try {
            return indice.get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("El enlace es invalido");
        }
    }

    /**
     * Convierte una cadena hexadecimal en su valor decimal.
     * @param s La cadena en hexadecimal.
     * @return El valor decimal equivalente.
     */
    public static int aDecimal(String s) {
        String alfabeto = "0123456789abcdef";
        s = s.toLowerCase();
        int valor = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = alfabeto.indexOf(c);
            valor = 16*valor + d;
        }
        return valor;
    }

    /**
     * Calcula el histograma de distribución de los enlaces en la tabla hash
     * @param bins Número de divisiones para agrupar las posiciones de la tabla
     * @return Un arreglo donde cada posición representa la cantidad de elementos en ese bin
     */
    public int[] histograma(int bins) {
        int[] hist = new int[bins];
        int rango = SIZE / bins;

        for (int i = 0; i < SIZE; i++) {
            int count = cols[i].size();
            int binIndex = i / rango;
            if (binIndex >= bins) binIndex = bins - 1; 
            hist[binIndex] += count;
        }

        return hist;
    }

    
}