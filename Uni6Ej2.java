package Uni6;

public class Uni6Ej2 {
	 public static final int MAXCOLUM = 10, MAXFILAS = 5;
	 public static void main(String[] args) {
	        int[][] matriz = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
	                { 1, 2, 3, 4, 5, 10, 9, 8, 7, 6 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 } };
	        int contador=obtenerPares(matriz);
	        System.out.println("contador" + contador);
	        imprimirMatriz(matriz);
	    }
	 public static int obtenerPares(int [][]matriz) {
		 int contador=0;
		 for (int i=0; i<MAXFILAS; i++) {
			 for(int j=0;j<MAXCOLUM; j++) {
				 if(matriz[i][j]%2==0) {
					 contador++;
				 }
			 }
		 }
	return contador;
}
	    public static void imprimirMatriz(int[][] matriz) {
	        for (int i = 0; i < MAXFILAS; i++) {
	            for (int j = 0; j < MAXCOLUM; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }

}
