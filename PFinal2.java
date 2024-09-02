package Uni6;

public class PFinal2 {
    public static final int N = 20, SEP = 0;

    public static void main(String[] args) {
        int[] ARR = {0, 1, 3, 0, 4, 5, 6, 7, 8, 0, 6, 5, 4, 3, 0, 1, 2, 3, 0, 0};
        int[] PAR = new int[N];
        secuenciasPares(ARR, PAR);
        imprimirArreglo(ARR);
        imprimirArreglo(PAR);
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void secuenciasPares(int[] ARR, int[] PAR) {
        int ini = 0;
        int fin = -1;
        int index = 0; // Índice para recorrer el arreglo PAR

        while (ini < N) {
            ini = buscarIni(ARR, fin + 1);
            if (ini < N) {
                fin = buscarFin(ARR, ini);
                if (fin < N) {
                    if (contador(ARR, ini, fin)) {
                        index = copiar(ARR, ini, fin, PAR, index);
                        // Añadir un cero después de cada secuencia copiada
                        if (index < N) {
                            PAR[index] = 0;
                            index++;
                        }

                    }
                }
            }
        }
    }

    public static int copiar(int[] ARR, int ini, int fin, int[] PAR, int index) {
        while (ini <= fin && index < N) {
            PAR[index] = ARR[ini];
            ini++;
            index++;
        }
        return index;
    }

    public static boolean contador(int[] ARR, int ini, int fin) {
        int contador = 0;
        for (int i = ini; i <= fin; i++) {
            if (ARR[i] % 2 == 0) {
                contador++;
            }
        }
        return contador % 2 == 0;
    }

    public static int buscarIni(int[] ARR, int pos) {
        while (pos < N && ARR[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] ARR, int pos) {
        while (pos < N && ARR[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
}
