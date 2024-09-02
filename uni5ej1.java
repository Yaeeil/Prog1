import java.io.BufferedReader;
import java.io.InputStreamReader;

public class uni5ej1 {
    public static int max = 15;
    public static int[] arreglos = new int[max];

    public static void mostrarArreglo() {
        for (int i = 0; i < max; i++) {
            System.out.println("arreglos[" + i + "] -> " + arreglos[i]); //asi se muestra la posicion de cada arreglo y su valor 
        }
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < max; i++) {
                System.out.println("Ingrese un número entre 1 y 12");
                arreglos[i] = Integer.valueOf(input.readLine());
            }

            mostrarArreglo();
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
