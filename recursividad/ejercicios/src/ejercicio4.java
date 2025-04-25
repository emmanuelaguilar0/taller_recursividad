public class ejercicio4 {

    //retornar el enésimo término de la serie de Fibonacci
    public static int fibonacci(int n) {
        // fibonacci(0) = 0
        if (n == 0) {
            return 0;
        }
        // fibonacci(1) = 1
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int resultado = fibonacci(n);
        System.out.println(resultado); 
    }
}
