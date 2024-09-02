import java.util.Random;

/*
 * Hacer un programa que devuelva la posición de inicio y fin de la
 * anteúltima secuencia de números distintos de ceros.
 * 
 * Declaro constante MAX=20;
 * Declaro arreglo tamaño(MAX);
 * Cargar arreglo (arreglo);
 * Imprimir arreglo (arreglo);
 * Buscar posicion fin anteultima secuencia(arreglo);
 * Buscar posicion inicial (arreglo, pos final);
 * Imprimir posiciones(pos inicial, pos final);
 * 
 */
public class ej17uni5 {
	
	public static final int MAX = 20;
	public static final double PROB = 0.4;//para que de todos los valores salga el 0.4 de ceros
	
	public static void main(String[] args) {
		
		int[] arr = new int[MAX];
		cargarArreglo(arr);
		imprimirArreglo(arr);
		int posFin = obtenerPosFinAnteUltSec(arr);
		int posIni = obtenerPosIni(arr, posFin);
		imprimirPosiciones(posIni, posFin);
		
	}
	
	public static void cargarArreglo(int[] arr) {
		Random r = new Random();
		for(int i = 1; i < MAX-1; i++) {
			if(r.nextDouble() > PROB) {
				arr[i] = (r.nextInt(9) + 1);
			}
		}
	}
	
	public static void imprimirArreglo(int[] arr) {
		for(int i = 0; i < MAX; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	
	public static int obtenerPosFinAnteUltSec(int[] arr) {
		int posFin = MAX-1;
		int posIni = 0;
		posFin = obtenerFin(arr, posFin);
		posIni = obtenerPosIni(arr, posFin);
		posFin = obtenerFin(arr, posIni-1);
		return posFin;
	}
	
	public static int obtenerFin(int[] arr, int pos) {
		while(pos > 0 && arr[pos] == 0) {
			pos--;
		}
		return pos;
	}
	
	public static int obtenerPosIni(int[] arr, int pos) {
		while(pos > 0 && arr[pos] != 0) {
			pos--;
		}
		return pos+1;
	}
	
	public static void imprimirPosiciones(int posIni, int posFin) {
		System.out.println("Posicion inicial: " + posIni + ". Posicion final: " + posFin);
	}
}