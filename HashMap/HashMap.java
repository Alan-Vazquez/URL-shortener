/**
 * Clase que modela una tabla hash para almacenar URLs
 * @author José María Hernández Pérez y Alan Vazquez Serralta
 * @version 1.0 
 * @date 15-may-2025
 */
public class HashMap {
    /**
     * El tamaño de la tabla. Se puede modificar para escalar el tamaño al requerido.
     */
    public static final int SIZE = 65536;
    /**
     * Listas de enlaces que servirán para manejar las colisiones.
     */
    private Lista<Link>[] cols;

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
     */
    public String add(Link link) throws Exception {
        int index = link.toHashCode() % SIZE; 
        if (index < 0) index += SIZE; 
        cols[index].add(cols[index].size(), link);
        return shorten(link.getLink());
    }

    /**
     * Convierte una cadena a link, y posteriormente la inserta en la cola de la lista correspondiente según su hashcode.
     * @param url Cadena del enlace a insertar
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
     * Regresa el nombre acortado de un link almacenado en la tabla hash en el formato HHHHID
     * HHHH: Los primeros 4 dígitos son su índice en hexadecimal: 0000 es 0, y FFFF es 65535.
     * ID: Todos los dígitos posteriores al cuarto son su índice en la lista contenida en ese índice, en hexadecimal. De modo que FFFF10 será la posición 16 de la lista contenida en el índice 65535.
     * @param l La cadena a buscar
     * @return El identiicador del enlace en la tabla hash.
     * @throws Exception Si la cadena no se encontró en el hash.
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
     */
    public boolean contains(String url) throws Exception {
        Link link = new Link(url);
        int index = link.toHashCode() % SIZE;
        if (index < 0 || index >= SIZE) return false;
        return cols[index].contains(link);
    }

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
}
