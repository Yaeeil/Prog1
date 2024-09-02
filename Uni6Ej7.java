package Uni6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uni6Ej7 {
	public static final int MAXCOLUM = 5, MAXFILAS = 4;

    public static void main(String[] args) {
        int[][] matriz = {
                {0, 1, 3, 5, 7},
                {2,4,6,8,10 },
                {1, 2, 4,6 , 7},
                {1, 2, 3, 4, 5}
        };

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un num:");
            int num = Integer.valueOf(input.readLine());
            System.out.println("Ingrese una fila:");
            int fila = Integer.valueOf(input.readLine());
            insertarNum(matriz, fila, num);
            imprimirMatriz(matriz);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void insertarNum(int[][]matriz, int fila, int num) {
    	int j=encontrarPos(matriz, fila, num);
    	corrimientoDcha(matriz, fila, j, num);
    	
    }
    public static int  encontrarPos(int[][]matriz, int fila, int num) {
    	int j=0;
    	while(matriz[fila][j]<num && j<MAXCOLUM) {
    	j++;
    }
    	return j;
    }
    public static void corrimientoDcha(int[][] matriz, int fila, int columna, int numero) {
        for (int i = MAXCOLUM-1; i >columna; i--) {
            matriz[fila][i] = matriz[fila][i-1];
        }
        matriz[fila][columna]=numero;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < MAXFILAS; i++) {
            for (int j = 0; j < MAXCOLUM; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
