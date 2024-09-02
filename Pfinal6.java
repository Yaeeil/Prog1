package Uni6;

public class Pfinal6 {
	public static final int MAXF=3, MAXC=4;
    public static void main(String[] args) {
        int[][] matSec = {
            {12, 2, 1, 6},
            {9, 4, 7, 5},
            {1, 3, 2, 8}
        };

        System.out.println("Matriz original:");
        imprimirM(matSec);
        burbujeo(matSec);
        System.out.println("\nMatriz ordenada:");
        imprimirM(matSec);
    }
//hay otra manera?
    public static void burbujeo(int[][] matSec) {
        // Número total de iteraciones para ordenar la matriz (MAXF * MAXC) veces
        for (int i = 0; i < MAXF * MAXC; i++) {
            // Recorremos la matriz fila por fila
            for (int fila = 0; fila < MAXF; fila++) {
                // Recorremos la matriz columna por columna
                for (int col = 0; col < MAXC; col++) {
                    // Índices para el elemento actual y el siguiente (derecha y abajo)
                    int siguienteFila = fila + (col + 1) / MAXC;
                    int siguienteCol = (col + 1) % MAXC;

                    // Comparamos el elemento actual con el siguiente y los intercambiamos si es necesario
                    if (siguienteFila < MAXF && matSec[fila][col] > matSec[siguienteFila][siguienteCol]) {
                        int temp = matSec[fila][col];
                        matSec[fila][col] = matSec[siguienteFila][siguienteCol];
                        matSec[siguienteFila][siguienteCol] = temp;
                    }
                }
            }
        }
    }

    public static void imprimirM(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
