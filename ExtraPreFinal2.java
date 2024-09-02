package Uni6;

public class ExtraPreFinal2 {
    public static final int N = 5;
    public static final int M = 20;
    public static final int K = 2;
    public static final int P = 2;
    public static final char L = 'F';
    public static final char SEP = ' ';

    public static void main(String[] args) {
        char[][] matriz = {
                {' ', '1', '2', 'G', 'H', ' ', '2', 'A', '3', ' ', '3', 'R', 'B', 'J', ' ', '6', '5', 'K', ' ', ' '},
                {' ', ' ', '2', '1', '4', '5', ' ', 'R', 'P', ' ', 'D', '3', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' '},
                {' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', '4', '1', ' ', ' ', ' '},
                {' ', ' ', ' ', '5', 'T', 'T', 'M', ' ', 'X', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' '},
                {' ', '6', '4', '5', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', '7', 'H', '2', '1', '8', ' '}
        };
        int señales=0;
        for (int i = 0; i < N; i++) {
           if( analizar(matriz[i])) {
        	   señales++;
           }if(señales==P) {
        	   System.out.println("señal captada");
        	   señales=0;
           }
        }
    }


    public static boolean analizar(char[] arr) {
        int ini = 0;
        int fin = -1;
        int contadorFilas = 0; // Contador de filas consecutivas 

        while (ini < M - 1 && contadorFilas < P) {
            ini = buscarIni(arr, fin + 1);
            if (ini < M - 1) {
                fin = buscarFin(arr, ini);
                if (fin < M - 1) {
                    if (buscarSeñalE(arr, ini, fin)) {
                        contadorFilas++;
                        return true;
                   
                }
            }
        }

       
        }
       	 return false;
    }

    public static boolean buscarSeñalE(char[] arr, int ini, int fin) {
        int contador = 0;
        while (ini <= fin && contador < K) {
            if (arr[ini] > L) {
                contador++;
            }
            ini++;
        }
        return contador >= K;
    }

    public static int buscarIni(char[] arreglo, int pos) {
        while (pos < M - 1 && arreglo[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arreglo, int pos) {
        while (pos < M - 1 && arreglo[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
  
}
