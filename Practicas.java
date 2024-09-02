package Uni6;

public class Practicas {
    
    public static final int MAXFIL = 3;
    public static final int MAXCOL = 20;
    public static final int SEPARADOR = 0;

    public static void main(String[] args) {
        int[][] matriz = {
            {0,-8,67,0,14,0,-4,33,0,5,98,0,0,0,0,0,0,0,0,0},
            {0,0,25,25,0,-5,3,0,25,44,44,0,-4,1,0,0,0,0,0,0},
            {0,44,44,44,0,-7,15,0,-4,9,0,12,0,0,0,0,0,0,0,0}
        };
        recorrerFilas(matriz);
        
    }

    public static void recorrerFilas(int[][] matriz) {
        for (int i = 0; i < MAXFIL; i++) {
            recorrerColumnas(matriz[i]);
        }
    }

    public static void recorrerColumnas(int[] arr) {
    	  descompresion(arr);
    	  imprimirMatriz(arr);
    }
    	  public static void imprimirMatriz(int[] arr) {
    		    for (int i = 0; i < MAXCOL; i++) {
    		        System.out.print("[" + arr[i] + "]");
    		    }
    		    System.out.println();
    		} 



    public static void descompresion(int[] arr) {
        int ini = 0, fin = -1, valor = 0;
        while (ini < MAXCOL) {
            ini = obtenerInicio(arr, fin + 1);

            if (ini < MAXCOL) {
                fin = obtenerFin(arr, ini);

                if (arr[ini] < SEPARADOR) {
                    valor = arr[ini] * -1;
                    agrandarSec(arr, ini, fin, valor - 2);
                    ini = obtenerInicio(arr, fin + (valor - 2));
                }
            }
        }
    }

    public static void agrandarSec(int[] arr, int ini, int fin, int valor) {
        int num = arr[fin];
        for (int i = 0; i < valor; i++) {
            corrimientoDer(arr, ini + 1);
            arr[ini] = num;
            ini++;
        }
    }

    public static void corrimientoDer(int[] arr, int cantidad) {
        for (int i = MAXCOL - 1; i > cantidad; i--) {
            arr[i] = arr[i - 1];
        }
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAXCOL && arr[pos] == SEPARADOR) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAXCOL && arr[pos] != SEPARADOR) {
            pos++;
        }
        return pos - 1;
    }
    
   
}
