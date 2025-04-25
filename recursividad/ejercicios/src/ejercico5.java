public class ejercico5 {

    //  invertir una cadena de texto
    public static String invertirCadena(String texto) {
        if (texto.length() <= 1) {
            return texto;
        }
        // Tomar el último carácter y lo colocamos al principio de la llamada recursiva con el resto
        return texto.charAt(texto.length() - 1) + invertirCadena(texto.substring(0, texto.length() - 1));
    }

    public static void main(String[] args) {
        String palabra = "hola";
        // Llamamos la función para invertir la cadena
        String resultado = invertirCadena(palabra);

        System.out.println(resultado); 
    }
}
