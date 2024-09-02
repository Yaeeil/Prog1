package Uni6;

public class Uni6Ej14 {
    public static final int MAXCOLUMNA = 20;
    public static final int MAXFILAS = 4;

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 3, 0, 4, 5, 6, 7, 0, 0, 8, 9, 0, 0, 1, 10, 0, 8, 0},
            {0, 1, 2, 0, 3, 4, 5, 0, 6, 0, 7, 0, 0, 8, 0, 9, 0, 6, 0, 0},
            {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 0, 9, 0, 0, 7, 8, 9, 0, 0},
            {0, 1, 0, 2, 3, 0, 4, 5, 0, 6, 0, 8, 9, 0, 7, 8, 9, 0, 1, 0}
        };
        int[] arrP = {0,0,0,0,0,0,0,0,0,0,1,2,3,0,0,0,0,0,0,0};
        
        recorrerFilas(matriz, arrP);
     
    }

    public static void recorrerFilas(int[][] matriz, int[] arrP) {
        for (int i = 0; i < MAXFILAS; i++) {
            recorrerColumnas(matriz[i], arrP);
        }
    }

    public static void recorrerColumnas(int[] arrM, int[] arrP) {
    	
    	eliminarSecIgual(arrM, arrP);
    	   imprimirArreglo(arrM);
    	
    	
       
    }

    public static void eliminarSecIgual(int[] arrM, int[] arrP) {
        int fin = -1;
        int ini = 0;
        int iniP = 0;
        int finP = -1;
        while (ini < MAXCOLUMNA) {
            ini = buscarInicio(arrM, fin + 1);
            if (ini < MAXCOLUMNA) {
                fin = buscarFin(arrM, ini);
                iniP = buscarInicio(arrP, finP + 1);
                finP = buscarFin(arrP, iniP);
                int tam = fin - ini + 1;
              int tamP=finP-iniP+1;
                if (tam == tamP && sonIguales(arrM, arrP, ini, fin, iniP, finP)) {
                    eliminarSec(arrM, ini, fin);
                    fin = ini;
                }
                
            }
        }
    }

    public static boolean sonIguales(int[] arr, int[] arrP, int ini, int fin, int iniP, int finP) {
        int j = iniP;
        while (ini <= fin && arr[ini] == arrP[j] && j<=finP) {
                ini++;
                j++;
         
        }
        return ini>fin;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAXCOLUMNA; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNA && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void correrIzquierda(int[] arr, int pos) {
        for (int i = pos; i < MAXCOLUMNA - 1; i++) {
            arr[i] = arr[i + 1];
        }
       
    }

    public static void eliminarSec(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            correrIzquierda(arr, ini);
        }
    }
}
