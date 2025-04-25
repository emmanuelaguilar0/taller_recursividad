public class ejercicio1 {

    public static void numeros(int num) {
        // si el número es menor que 1, paramos la recursión
        if (num < 1) {
            return;
        }

        // imprimir el número actual
        System.out.println(num);

        // Luego llamamos recursivamente con el siguiente número menor
        numeros(num - 1);
    }

    public static void main(String[] args) {
        //  inicial con el número 100
        numeros(100);
    }
}
