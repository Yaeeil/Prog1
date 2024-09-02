package Uni6;

public class Uni6Ej11 {
    public static final int MAX_COLUMNAS = 20;
    public static final int MAX_FILAS = 4;

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 3, 0, 4, 5, 6, 7, 0, 0, 8, 9, 0, 0, 1, 10, 0, 8, 0},
            {0, 1, 2, 0, 3, 4, 5, 0, 6, 0, 7, 0, 0, 8, 0, 9, 0, 6, 0, 0},
            {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 0, 9, 0, 7, 7, 0, 8, 9, 0},
            {0, 1, 0, 2, 3, 0, 4, 5, 0, 6, 7, 8, 9, 0, 4, 6, 7, 9, 0, 0}
        };
        recorrerFilas(matriz);
    }

    public static void recorrerFilas(int[][] matriz) {
        for (int i = 0; i < MAX_FILAS; i++) {
            recorrerColumnas(matriz[i]);
        }
    }

    public static void recorrerColumnas(int[] arr) {
        compararSumaSecuencias(arr);
    }

    public static int sumarSecuencias(int[] arr, int ini, int fin) {
        int suma = 0;
        while (ini <= fin) {
            suma += arr[ini];
            ini++;
        }
        return suma;
    }

    public static void compararSumaSecuencias(int[] arr) {
        int suma = 0, sumaM = 0, fin = -1, ini = 0, finM = -1, iniM = 0;

        if (ini < MAX_COLUMNAS) {
            ini = inicio(arr, fin + 1);
            while (ini < MAX_COLUMNAS) {
                fin = fin(arr, ini);
                suma = sumarSecuencias(arr, ini, fin);
                if (suma > sumaM) {
                    sumaM = suma;
                    finM = fin;
                    iniM = ini;
                }
                ini = inicio(arr, fin + 1);
            }
            System.out.println("ini: " + iniM + " fin: " + finM + " sumaM: " + sumaM);
        }
    }

    public static int inicio(int[] arr, int pos) {
        while (pos < MAX_COLUMNAS && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int fin(int[] arr, int pos) {
        while (pos < MAX_COLUMNAS && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
}
