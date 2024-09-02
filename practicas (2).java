public class practicas {
    public static final int MAX = 20;
    public static final int N = 3;
    public static final int SEPARADOR = 255;

    public static void main(String[] args) {
        int[] arr = { 255, 67, 67, 67, 67, 67, 67, 67, 67, 255, 14, 255, 33, 33, 33, 33, 255, 5, 98, 255 };
        mostrarArreglo(arr);
        eliminarsectamanio(arr);
        mostrarArreglo(arr);
    }

    public static void eliminarsectamanio(int[] arr) {
        int ini = 0;
        int fin = -1;
        ini = obtenerPosIni(arr, fin + 1);
        while (ini < MAX) {
            fin = obtenerFin(arr, ini);
            int repetidos = contarrepetidos(arr, ini, fin);
            if (repetidos > N) {
                arr[ini] = -1 * (repetidos);
                eliminarSecuencia(arr, ini, fin);
                ini = obtenerPosIni(arr, ini + 2);
            } else {
                ini = obtenerPosIni(arr, fin + 1);
            }
        }
    }

    public static int contarrepetidos(int[] arr, int ini, int fin) {
        int contador = 0;
        while (ini < fin && arr[ini] == arr[ini + 1]) {
            contador++;
            ini++;
        }
        return contador;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos > 0 && arr[pos] == 0) {
            pos--;
        }
        return pos;
    }

    public static int obtenerPosIni(int[] arr, int pos) {
        while (pos > 0 && arr[pos] != 0) {
            pos--;
        }
        return pos + 1;
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimientoIzquierda(arr, i);
        }
    }


    public static void corrimientoIzquierda(int[] arr, int posIni) {
        for (int i = posIni; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
