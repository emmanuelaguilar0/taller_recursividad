public class ejercicio6 {

    //contar cuántas veces aparece un carácter específico en una cadena
    public static int contarCaracter(String texto, char caracter) {
        //si la cadena está vacía, no hay coincidencias
        if (texto.isEmpty()) {
            return 0;
        }
        // Comprobar si el primer carácter de la cadena es el mismo que el buscado
        int coincidencia = (texto.charAt(0) == caracter) ? 1 : 0;

        // Llamamos recursivamente con el resto de la cadena (sin el primer carácter)
        return coincidencia + contarCaracter(texto.substring(1), caracter);
    }

    public static void main(String[] args) {
        String palabra = "programacion";
        char letra = 'o';

        // Llamamos a la función para contar las veces que aparece el carácter 'o'
        int resultado = contarCaracter(palabra, letra);

        System.out.println(resultado);
    }
}
