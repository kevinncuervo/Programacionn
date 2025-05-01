import java.util.Scanner;

public class Invertir {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Cantidad de números en el array: ");
        int numero = in.nextInt();
        in.nextLine(); 

        String[] original = new String[numero];
        for (int i = 0; i < numero; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            original[i] = in.nextLine();
        }

        String[] invertido = invertir(original);

        System.out.print("Original: ");
        mostrar(original);

        System.out.print("Invertido: ");
        mostrar(invertido);
    }

    public static String[] invertir(String[] arr) {
        int n = arr.length;
        String[] resultado = new String[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arr[n - 1 - i];
        }
        return resultado;
    }

    public static void mostrar(String[] arr) {
        System.out.print("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + "");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("");
    }
}

