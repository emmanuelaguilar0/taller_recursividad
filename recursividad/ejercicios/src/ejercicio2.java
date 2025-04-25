public class ejercicio2 {
        // Función principal que recibe una palabra y verifica si es un palíndromo
    public static boolean Palindromo(String palabra) {
         // Convertimos la palabra a minúsculas para que la comparación no sea sensible a mayúsculas
        palabra = palabra.toLowerCase();
        // Llamamos a la función recursiva auxiliar pasando los índices de inicio y fin
        return PalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }
                // Función recursiva que compara los caracteres desde los extremos hacia el centro
    private static boolean PalindromoRecursivo(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }

        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
            // Llamada recursiva: avanzar hacia el centro
        return PalindromoRecursivo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        boolean resultado = Palindromo("reconocer");

        // Imprimir "verdadero" o "falso"
        if (resultado) {
            System.out.println("verdadero");
        } else {
            System.out.println("falso");
        }
    }
}
