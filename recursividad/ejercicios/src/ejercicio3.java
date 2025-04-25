public class ejercicio3 {

    // calcular la suma de los dígitos de un número
    public static int sumaDigitos(int numero) { 
        if (numero < 10) {
            return numero;
        }

        // Obtenemos el último dígito con % 10 y sumamos la llamada recursiva con el número sin ese dígito
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public static void main(String[] args) {
        int numero = 1234;

        // Llamamos a la función y guardamos el resultado
        int resultado = sumaDigitos(numero);

        System.out.println(resultado); 
    }
}
