package Uni6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uni6Ej9 {

    public static final int MAXCOLUM = 5, MAXFILAS = 4;

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 7, 5, 9, 6},
            {1, 8, 6, 2, 10},
            {9, 2, 7, 0, 10},
            {5, 2, 3, 10, 7}
        };

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un num:");
            int num1 = Integer.valueOf(input.readLine());
            System.out.println("Ingrese un num:");
            int num2 = Integer.valueOf(input.readLine());
            System.out.println("Ingrese una fila:");
            int fila = Integer.valueOf(input.readLine());
            ordenarCrec(matriz[fila], num1, num2);
            imprimirMatriz(matriz);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ordenarCrec(int[] arreglo, int num, int num2) {
        int aux;
        for (int i = num; i < num2 - 1; i++) {
            for (int j = num; j < num2 - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
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
