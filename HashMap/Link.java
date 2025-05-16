/**
 * Clase tipo envoltura que adapta un String para que se pueda tratar como URL
 * @author José María Hernández Pérez y Alan Vazquez Serralta
 * @version 1.0 
 * @date 15-may-2025
 */
public class Link {
    /**
     * Cadena a envolver
     */
    private String link;

    /**
     * Constructor parametrizado. Recibe una cadena que convertirá a URL
     * @param l La cadena a envolver
     * @throws Exception Se acompaña de un código de error. Referir a isValid(String).
     */
    public Link(String l) throws Exception {
        if (l.startsWith("http://")) {
            l = l.substring(7);
        } else if (l.startsWith("https://")) {
            l = l.substring(8);
        }

        if (l.endsWith("/") && l.length() > 1) {
            l = l.substring(0, l.length() - 1);
        }

        if (isValid(l) != 0) throw new Exception("No es un link valido: " + isValid(l));
        link = l;
    }  

    /**
     * @return String - La cadena envuelta.
     */
    public String getLink(){ return link; }

    /**
     * Convierte caracteres a enteros respecto a su índice en el alfabeto de caracteres permitidos, para el cálculo de la función de dispersión.
     * @param c El caracter a convertir.
     * @return int - Un entero que representa al caracter.
     * @throws Exception
     */
    private static int toNumber(char c) throws Exception{
        String alfabeto = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$-_.+!*|(),;/?:@=&#~%[]\\";
        if (!alfabeto.contains(c+"")) throw new Exception("Caracter invalido: " +c);
        return alfabeto.indexOf(c)+1;
    }

    /**
     * Calcula el HashCode del link polinomialmente mediante potencias de 13 y el toNumber() para cada caracter.
     * @return int - El HashCode del enlace.
     * @throws Exception - Si uno de los caracteres es inválido
     */
    public int toHashCode() throws Exception {
        int base = 13; 
        int hash = 0;
        for (int i = 0; i < link.length(); i++) {
            hash = hash * base + toNumber(link.charAt(i));
        }
        return Math.abs(hash); 
    }

    /**
     * Verifica la validez del enlace a envolver.
     * @param l La cadena que se desea envolver.
     * @return 0. Si la cadena es válida
     * 1. Si la cadena está vacía.
     * 2. Si la longitud de la cadena excede 1024 caracteres.
     * 3. Si la cadena contiene un espacio.
     * 4. Si la cadena no contiene un ".".
     * 5. Si la cadena empieza o termina con un ".".
     * 6. Si (a excepción de protocolos http:// y https://) una diagonal precede a un punto.
     * 7. Si alguno de los subdominios (separados por ".") está vacío.
     * 8. Si la longitud de algún subdominio excede 64 caracteres.
     * 9. Si alguno de los subdominios empieza o termina por "-".
     * 10. Si el TLD (el último subdomino, por ejemplo .com) tiene una longitud menor a 11.
     */
    private static int isValid(String l) {
        l = l.trim();
        if (l == null || l.isEmpty()) return 1;
        if (l.length() > 1024) return 2;
        if (l.contains(" ")) return 3;
        if (!l.contains(".")) return 4;
        if (l.startsWith(".") || l.endsWith(".")) return 5;
        if (!l.startsWith("https://") && !l.startsWith("http://")) if (l.indexOf('/') < l.indexOf('.') && l.indexOf('/') != -1) return 6;
        String dom = (l.indexOf('/') == -1) ? l : l.substring(0, l.indexOf('/'));
        String[] subdoms = dom.split("\\.");
        for (int i = 0; i < subdoms.length; i++) {
            String s = subdoms[i];
            if (s.isEmpty()) return 7;
            if (s.length() >= 64) return 8;
            if (s.startsWith("-") || s.endsWith("-")) return 9;
        }
        String tld = subdoms[subdoms.length - 1];
        if (tld.length() < 2) return 10;
        return 0;
    }

    /**
     * Verifica que dos links sean iguales
     * @return boolean - El valor de verdad de la comparación. 
     * @param o - El Object a comparar
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return link.link.equals(this.link);
    }
}
