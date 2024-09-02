package Uni6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Uni6ej4 {

	public static final int MAXCOLUM = 10, MAXFILAS = 5;

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 10, 9, 8, 7, 6},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una fila:");
            int fila = Integer.valueOf(input.readLine());
            System.out.println("Ingrese un num");
            int num= Integer.valueOf(input.readLine());
            System.out.println("Ingrese una columna:");
            int columna = Integer.valueOf(input.readLine());
            corrimientoDcha(matriz, fila, columna, num);
            imprimirMatriz(matriz);
        } catch (Exception e) {
            System.out.println(e);
        }
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
