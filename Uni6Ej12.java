package Uni6;

public class Uni6Ej12 {
    public static final int MAXCOLUM = 20;
    public static final int MAXFILAS = 4;
    public static final char SEP = ' ';

    public static void main(String[] args) {
        char[][] matriz = {
            {' ', 'a', 'b', 'c', ' ', 'd', 'e', 'f', 'g', ' ', ' ', 'h', 'i', ' ', ' ', 'd', ' ', ' ', 's', ' '},
            {' ', 'j', 'k', ' ', 'l', 'm', 'n', ' ', 'o', ' ', 'p', ' ', 'a', 'q', 'r', 'r', ' ', 'j', 'l', ' '},
            {' ', 's', 't', 'u', ' ', 'v', 'w', 'x', ' ', 'y', 'z', ' ', 'a', ' ', 'g', 'j', 'g', ' ', 'h', ' '},
            {' ', 'b', ' ', 'c', 'd', ' ', 'e', 'f', ' ', 'g', 'h', 'i', 'j', ' ', 'l', 'm', ' ', 'k', 'b', ' '}
        };

        recorrerFilas(matriz);
    }

    public static void recorrerFilas(char[][] matriz) {
        for (int i = 0; i < MAXFILAS; i++) {
            recorrerColumnas(matriz[i]);
        }
    }

    public static void imprimirMatriz(char[] arr) {
        for (int columna = 0; columna < MAXCOLUM; columna++) {
            System.out.print("[" + arr[columna] + "]");
        }
        System.out.println();
    }

    public static void imprimirPosiciones(int posIni, int posFin) {
        System.out.println("Posicion inicial: " + posIni + ". Posicion final: " + posFin);
    }

    public static void recorrerColumnas(char[] arr) {
        imprimirMatriz(arr);
        int posFin = obtenerPosFinAnteUltSec(arr);
        int posIni = obtenerPosIni(arr, posFin);
        imprimirPosiciones(posIni, posFin);
    }

    public static int obtenerPosFinAnteUltSec(char[] arr) {
        int posFin = MAXCOLUM - 1;
        int posIni = 0;
        posFin = obtenerFin(arr, posFin);
        posIni = obtenerPosIni(arr, posFin);
        posFin = obtenerFin(arr, posIni - 1);
        return posFin;
    }

    public static int obtenerFin(char[] arr, int pos) {
        while (pos > 0 && arr[pos] == SEP) {
            pos--;
        }
        return pos;
    }

    public static int obtenerPosIni(char[] arr, int pos) {
        while (pos > 0 && arr[pos] != SEP) {
            pos--;
        }
        return pos + 1;
    }
}
