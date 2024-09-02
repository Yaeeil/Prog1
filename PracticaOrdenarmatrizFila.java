package Uni6;

public class PracticaOrdenarmatrizFila {
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

    public static void burbujeo(int[][] matSec) {
    	for(int i=0; i<MAXF*MAXC; i++) {
            for (int fila = 0; fila < MAXF; fila++) {
                for (int col = 0; col < MAXC-1; col++) {
                    if ( matSec[fila][col] > matSec[fila][col+1]) {
                        int temp = matSec[fila][col];
                        matSec[fila][col] = matSec[fila][col+1];
                        matSec[fila][col+1] = temp;
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