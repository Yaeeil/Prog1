package Uni6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uni6Ej13 {
    public static final int MAXCOLUMNAS = 20;
    public static final int MAXFILAS = 4;

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 2, 3, 0, 4, 5, 6, 7, 0, 0, 8, 9, 0, 0, 1, 10, 0, 8, 0},
            {0, 1, 2, 0, 3, 4, 5, 0, 6, 0, 7, 0, 0, 8, 0, 9, 0, 6, 0, 0},
            {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 0, 9, 0, 7, 7, 0, 8, 9, 0},
            {0, 1, 0, 2, 3, 0, 4, 5, 0, 6, 7, 8, 9, 0, 4, 6, 7, 9, 0, 0}
        };
        try {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese un tamaño: ");
        int tam = Integer.valueOf(input.readLine());
        recorrerFilas(matriz, tam);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void recorrerFilas(int[][] matriz,int tam) {
        for (int i = 0; i < MAXFILAS; i++) {
            recorrerColumnas(matriz[i],tam);
        }
    }

    public static void recorrerColumnas(int[] arr, int tam) {
       
            eliminarSecuenciaTam(arr, tam);
            imprimirArreglo(arr);
       
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAXCOLUMNAS; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }

    public static void eliminarSecuenciaTam(int[] arr, int tam) {
        int ini = 0;
        int fin = -1;
        while (ini < MAXCOLUMNAS) {
            ini = buscarInicio(arr, fin + 1);
            
            	if (ini < MAXCOLUMNAS) {
                fin = buscarFin(arr, ini);
                int tamanio = fin - ini + 1;
                if (tamanio == tam) {
                    eliminarSec(arr, ini, fin);
                }
                fin = ini;
            }
        }
    }

    public static int buscarInicio(int[] arr, int pos) {
        while (pos < MAXCOLUMNAS && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAXCOLUMNAS && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void correrIzquierda(int[] arr, int pos) {
        for (int i = pos; i < MAXCOLUMNAS - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
    }

    public static void eliminarSec(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            correrIzquierda(arr, ini);
        }
    }
}
