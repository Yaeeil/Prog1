package Uni6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Uni6Ej5 {
    public static final int MAXFILA= 5, MAXCOLUMNA= 10;
    public static void main(String[]args){
        int[][] matriz = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        { 11, 12, 12, 14, 15, 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
        { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 },
        { 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 } };
        int numero = obtenerNumero ();
        imprimir_matriz(matriz, numero);
    }
    public static void imprimir_matriz (int[][]matriz, int numero){
        for(int fila=0;fila<MAXFILA;fila++){
            proceso_ejercicio (matriz[fila], numero);
        }
    }
    public static void proceso_ejercicio (int[]matriz, int numero){
    compararNumConEle (matriz, numero);
    imprimirMatriz(matriz);
}
    public static int obtenerNumero (){
        BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));
        int nro=0;
         try{
            System.out.print ("Ingrese un número: ");
            nro = Integer.valueOf(entrada.readLine());
        }
        catch (Exception exc){
            System.out.println (exc);
        }
        return nro;
    }
    public static void compararNumConEle (int[]matriz, int numero){
        for(int columna = 0; columna < MAXCOLUMNA; columna++){
            if(matriz[columna]==numero){
                eliminarNumero(matriz, columna);
            }
        }
    }
    public static void eliminarNumero (int[]matriz, int columna){
        for(int pos= columna;pos<9; pos++){
            matriz[pos]= matriz[pos+1];
        }
    }
    public static void imprimirMatriz (int[]matriz){
        for(int columna = 0; columna < MAXCOLUMNA; columna++){
            System.out.print (matriz[columna] + " ");
        }
        System.out.println ();
    }
}