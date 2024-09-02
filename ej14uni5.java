public class ej14uni5 {
public static final int max = 10;
public static void main(String[] args) {
        int[] arreglo = { 18, 17, 16, 15, 14, 13, 6, 5, 4, 1 };
        int i = 0;
        while (i < max) {
            int m2 = arreglo[i] % 2;
            if (m2 == 0) {
                corrimientoIzq(arreglo, i);
            } else {
                i++;
            }
        }
        imprimirArreglo(arreglo);
    }

    public static void corrimientoIzq(int[] arreglo, int inicio) {
        for (int i = inicio; i < max - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < max; i++) {
            System.out.print(arreglo[i] + " ");
        }
       
    }
}
