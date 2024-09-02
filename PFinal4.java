package Uni6;
public class PFinal4 {
    public static final int MAXF = 3, MAXC = 15, MAXA = 3, SEP = 0;

    public static void main(String[] args) {
        int[][] matSec = {
            {0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0},
            {0, 150, 105, 265, 845, 215, 0, 150, 200, 165, 0, 741, 125, 541, 0},
            {0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 0, 150, 200, 165, 0}
        };
        int[] modelo = {150, 200, 165};
       //int[] reemplazo = {1, 2, 3, 4};
        int[] reemplazo = {1, 2}; 
        
        imprimirM(matSec);
        System.out.println("------------");
        
        for (int i = 0; i < MAXF; i++) {
            recorrerM(matSec[i], modelo, reemplazo);
        }
        
        imprimirM(matSec);
    }

    public static void recorrerM(int[] arr, int[] modelo, int[] reemplazo) {
        int ini = 0;
        int fin = -1;
        
        while (ini < MAXC) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXC) {
                fin = buscarFin(arr, ini);
                if (comparar(arr, modelo, ini, fin)) {
                    ajustarLongitud(arr, modelo.length, reemplazo.length, ini, fin);
                    reemplazar(arr, reemplazo, ini, ini + reemplazo.length - 1);
                }
            }
        }
    }

    public static void ajustarLongitud(int[] arr, int longitudModelo, int longitudReemplazo, int ini, int fin) {
        int diferenciaLongitud = longitudReemplazo - longitudModelo;

        if (diferenciaLongitud > 0) {
            desplazarDerecha(arr, fin + 1, diferenciaLongitud);
        } else if (diferenciaLongitud < 0) {
            desplazarIzquierda(arr, ini, -diferenciaLongitud);
            fin = fin + diferenciaLongitud;  //ajuste de 'fin'
        }
    }

    public static void desplazarDerecha(int[] arr, int pos, int cantidad) {
        for (int i = MAXC - 1; i >= pos + cantidad; i--) {
            arr[i] = arr[i - cantidad];
        }
    }

    public static void desplazarIzquierda(int[] arr, int pos, int cantidad) {
        for (int i = pos; i < MAXC - cantidad; i++) {
            arr[i] = arr[i + cantidad];
        }
        for (int i = MAXC - cantidad; i < MAXC; i++) {
            arr[i] = SEP;
        }
    }

    public static boolean comparar(int[] arr, int[] modelo, int ini, int fin) {
        int j = 0;
        while (ini <= fin && j < MAXA && arr[ini] == modelo[j]) {
            j++;
            ini++;
        }
        return j == MAXA;
    }

    public static void reemplazar(int[] arr, int[] reemplazo, int ini, int fin) {
        int index = 0;
        for (int i = ini; i <= fin; i++) {
            arr[i] = reemplazo[index];
            index = (index + 1) % reemplazo.length;
        }
    }

    public static void imprimirM(int[][] arr) {
        for (int i = 0; i < MAXF; i++) {
            for (int j = 0; j < MAXC; j++) {
                System.out.print("'" + arr[i][j] + "'");
            }
            System.out.println();
        }
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXC && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAXC && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }
}
