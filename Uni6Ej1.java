package Uni6;

public final class Uni6Ej1 {
    public static final int MAXCOLUM = 10, MAXFILAS = 5;

    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 } };
        invertirFilasMatriz(matriz);
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < MAXFILAS; i++) {
            for (int j = 0; j < MAXCOLUM; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void invertirFilasMatriz(int[][] matriz) {
        // Recorrer filas 
        for (int i = 0; i < MAXFILAS; i++) {
            int j = 0; 
            int k = MAXCOLUM - 1; 

            // Intercambiamos los elementos 
            while (j < k) {
                int temp = matriz[i][j]; // Guardamos el elemento actual en una variable temporal
                matriz[i][j] = matriz[i][k]; // Sobreescribimos el elemento actual con el elemento del final de la fila
                matriz[i][k] = temp; // Sobreescribimos el elemento del final de la fila con el elemento original

                j++; // Avanzamos al siguiente elemento desde el inicio de la fila
                k--; // Retrocedemos al siguiente elemento desde el final de la fila
            }
        }
    }

}
