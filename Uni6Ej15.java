package Uni6;

public class Uni6Ej15 {
	 public static final int MAXCOLUMNA = 20;
	    public static final int MAXFILAS = 4;

	    public static void main(String[] args) {
	        int[][] matriz = {
	            {0, 1, 2, 3, 0, 7, 6, 5, 4, 0, 0, 8, 9, 0, 0, 0, 10, 9, 8, 0},
	            {0, 2, 1, 0, 3, 4, 5, 0, 6, 5, 4, 0, 0, 8, 5, 9, 7, 6, 0, 0},
	            {0, 1, 2, 3, 0, 5, 4, 2, 0, 7, 8, 9, 0, 0, 0, 7, 8, 9, 0, 0},
	            {0, 1, 2, 2, 3, 0, 4, 5, 0, 6, 0, 8, 9, 0, 7, 8, 9, 10, 1, 0}
	        };
	        recorrerFilas(matriz);
	        
	    }

	    public static void recorrerFilas(int[][] matriz) {
	        for (int i = 0; i < MAXFILAS; i++) {
	            recorrerColumnas(matriz[i]);
	        }
	    }

	    public static void recorrerColumnas(int[] arrM) {
	    		eliminarSecOrDes(arrM);
	    	   imprimirArreglo(arrM);
	    	
	    	
	       
	    }
	    public static boolean esDecrec(int []arrM, int ini, int fin) {
	    	while(ini<fin && arrM[ini]>arrM[ini+1]) {
	    		ini++;
	    	}
	    	return ini==fin;
	    }
	    public static void eliminarSecOrDes(int []arrM) {
	    	int ini=0;
	    	int fin=-1;
	    	while(ini<MAXCOLUMNA) {
	    		ini=buscarInicio(arrM, fin+1);
	    		if(ini<MAXCOLUMNA) {
	    			fin=buscarFin(arrM, ini);
	    			if(esDecrec(arrM, ini, fin)) {
	    				eliminarSec(arrM, ini, fin);
	    				fin=ini;
	    			}
	    		}
	    	}
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
}
