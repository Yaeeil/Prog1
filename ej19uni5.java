import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Hacer un programa que dado un número N ingresado por el
 * usuario, elimine las secuencias de tamaño N de números distintos
 * de cero.
 * 
 * Declarar constante MAX = 20;
 * Declarar arreglo tamaño(MAX);
 * Cargar arreglo(arr);
 * Imprimir arreglo(arr);
 * N = Solicitar numero entero correspondiente a tamaño de secuencia;
 * Eliminar secuencias tamaño N;
 * Imprimir arreglo;
 * 
 * Corrimiento izquierda;
 * 
 */

public class ej19uni5 {
	
	public static final int MAX = 20;
	public static final double PROB = 0.4;
	
	public static void main(String[] args) {
		int[] arr = new int[MAX];
		cargarArreglo(arr);
		imprimirArreglo(arr);
		int tamanio = solicitarNumero("Ingresar numero de 1 a 5");
		eliminarSecuenciasDeTamanio(arr, tamanio);
		imprimirArreglo(arr);
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
	
	public static int solicitarNumero(String mensaje) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int entero = 0;
		try {
			System.out.println(mensaje);
			entero = Integer.valueOf(entrada.readLine());
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		return entero;
	}
	
	public static void eliminarSecuenciasDeTamanio(int[] arr, int tamanio) {
		int posIni = 0;
		int posFin = 0;
		int largoSec = 0;
		while(posIni < MAX-1) {
			posIni = obtenerPosIni(arr, posFin+1);
			posFin = obtenerPosFin(arr, posIni);
			largoSec = posFin - posIni + 1;
			if(largoSec == tamanio) {
				eliminarSecuencia(arr, posIni, largoSec);
				posFin = posIni-1;
			}
		}
	}
	
	public static int obtenerPosIni(int[]arr, int pos) {
		while(pos < MAX-1 && arr[pos] == 0) {
			pos++;
		}
		return pos;
	}
	
	public static int obtenerPosFin(int[]arr, int pos) {
		while(pos < MAX-1 && arr[pos] != 0) {
			pos++;
		}
		return pos-1;
	}
	
	public static void eliminarSecuencia(int[]arr, int posIni, int largoSec) {
		while(largoSec > 0) {
			corrimientoIzquierda(arr, posIni);
			largoSec--;
		}
	}
	
	public static void corrimientoIzquierda(int[]arr, int posIni) {
		for(int i = posIni; i < MAX-1; i++) {
			arr[i] = arr[i+1];
		}
	}
}