//Hacer un programa que dada la matriz de secuencias de
//enteros definida y precargada, permita obtener a través de
//métodos la posición de inicio y la posición de fin de la secuencia
//ubicada a partir de una posición entera y una fila, ambas
//ingresadas por el usuario. Finalmente, si existen imprima por
//pantalla ambas posiciones obtenidas.
package Uni6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uni6Ej10{
	public static final int MAXCOLUMNA = 20;
	public static final int MAXFILA = 4;
	public static void main(String[] args) {
		int [][] matriz = {
				{0, 2,3 ,1 ,2, 0,1,2,3,4,0,5,4,3,2,0,1,2,4,0},
				{0, 2,3 ,1 ,2, 0,1,2,3,3,0,5,4,3,2,0,1,2,4,0},
				{0, 2,3 ,1 ,2, 0,1,2,3,4,0,5,4,3,2,0,1,2,4,0},
				{0, 2,3 ,1 ,2, 0,8,2,3,4,0,5,4,3,2,0,2,3,4,0}	
		};	
		  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            System.out.println("Ingrese un num:");
	            int num = Integer.valueOf(input.readLine());
	            System.out.println("Ingrese una fila:");
	            int fila = Integer.valueOf(input.readLine());
	            int ini=inicio(matriz[fila], num);
	            int fin=fin(matriz[fila], ini);
	            System.out.println("ini: " + ini + "fin: " + fin);
	        }
	        catch(Exception exc) {
	        	
	        }
	}
	
    public static int inicio(int [] arr, int pos){
        while(pos < MAXCOLUMNA && arr[pos] == 0){
            pos++;
        }
        return pos;
    }
    
    public static int fin(int [] arr, int pos){
        while(pos < MAXCOLUMNA && arr[pos] != 0){
            pos++;
        }
        return pos -1;
    }
    
 

	

}
