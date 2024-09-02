package Uni6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PFinal9 {
    public static final int NFIL = 2, NCOL = 9, SEP = 0;

    public static void main(String[] args) {
        int[][] MAT = new int[NFIL][NCOL];
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < NFIL; i++) {
                for (int j = 0; j < NCOL; j++) {
                    System.out.println("Ingrese valores entre 4 y 9 inclusive y ponga los 0 necesarios:");
                    int ins = Integer.parseInt(input.readLine());

                    if (ins == 0 || (ins >= 4 && ins <= 9)) {
                        MAT[i][j] = ins;
                    } else {
                        System.out.println("Ingrese de nuevo el valor, valor inválido.");
                        j--;
                    }
                }
            }

            System.out.println("Ingrese la cantidad de secuencias a invertir:");
            int cant = Integer.parseInt(input.readLine());
            imprimirM(MAT);
            if (cant > 0) {
                invertirUltCantSec(MAT, cant);
            }

            imprimirM(MAT);

        } catch (Exception exc) {
            System.out.println("ERROR");
        }
    }

    public static void invertirUltCantSec(int[][] MAT, int cant) {
    	int contador = 0;
        int ini = 0;
        int fin = NCOL - 1;
        for (int i = NFIL - 1; i >= 0; i--) {
        	 while (contador < cant && fin >= 0) {
                fin = UltSecFin(MAT[i], fin);
                if (fin >= 0) {
                    ini = UltSecIni(MAT[i], fin);
                    invertirSecuencia(MAT[i], ini, fin);
                    contador++;
                    fin=UltSecFin(MAT[i], ini-1);
                    System.out.println(ini + ":" + fin + ": :" + i);
                   
                   
                  
                }
            }
        }
    }

    public static void invertirSecuencia(int[] arr, int ini, int fin) {
        System.out.println("entra a invertir");
        int valor;
        int j = fin;
        for (int i = ini; i < (fin + ini + 1) / 2; i++) {
            valor = arr[i];
            arr[i] = arr[j];
            arr[j] = valor;
            j--;
        }
    }

    public static int UltSecIni(int[] arr, int pos) {
        while (pos > 0 && arr[pos] != SEP) {
            pos--;
        }
        return pos + 1;
    }

    public static int UltSecFin(int[] arr, int pos) {
        while (pos > 0 && arr[pos] == SEP) {
            pos--;
        }
        return pos;
    }

    public static void imprimirM(int[][] arr) {
        System.out.println("Matriz:");
        for (int i = 0; i < NFIL; i++) {
            for (int j = 0; j < NCOL; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
