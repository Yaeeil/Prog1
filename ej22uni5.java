public class ej22uni5 {
	/*
	 * Hacer un programa que reemplace de un arreglo A todas las ocurrencias de una
	 * secuencia patrón dada en un arreglo P, por la secuencia contenida en el
	 * arreglo R de igual tamaño.
	 * 
	 * Hacer un arreglo A (metodo) Hacer un patron secuencia fijo --arreglo P hacer
	 * secuencia arreglo r igual al tamaño de P verificar que el arreglo P esta en
	 * el arreglo A buscar posicion de Inicio y posicion de final Si lo esta
	 * reemplazar esos valores por los del Arreglo R imprimir arreglo
	 */
	public static final int MAX = 15;
	public static final int AUX = 3;

	public static void main(String[] args) {
		int[] arrA = { 0, 2, 3, 0, 2, 3, 4, 0, 3, 1, 0, 4, 0, 1, 0 };
		int[] arrP = { 2, 3, 4 };
		int[] arrR = { 7, 8, 9 };
		encontrarSecuencia(arrA, arrP, arrR);
		imprimirArreglo(arrA);

	}

	public static int obtenerPosIni(int[] arr, int pos) {
		while (pos < MAX - 1 && arr[pos] == 0) {
			pos++;
		}
		return pos;
	}

	public static int obtenerPosFin(int[] arr, int pos) {
		while (pos < MAX - 1 && arr[pos] != 0) {
			pos++;
		}
		return pos - 1;
	}

	public static void encontrarSecuencia(int[] arrA, int[] arrP, int[] arrR) {
		
		int inicio = 0;
		int fin = 0;
		int largosec = 0;
		
		while(inicio < MAX-1) {
			inicio = obtenerPosIni(arrA, fin+1);
			fin = obtenerPosFin(arrA, inicio);
			largosec = fin - inicio + 1;
			if (largosec == AUX) {
				boolean esIgual = true;
				int j = inicio;
				int x = 0;
				while(j <= fin && x < AUX && esIgual == true) {
					if(arrA[j] != arrP[x]) {
						esIgual = false;
					}
					j++;
					x++;
				}
				if(esIgual == true) {
					reemplazarSecuencia(arrA, arrR, inicio, fin);
				}
				
			}
		}
	}

	public static void reemplazarSecuencia(int[] arrA, int[] arrR, int inicio, int fin) {
		int j = 0;
		for(int i = inicio; i <= fin; i++) {
			arrA[i] = arrR[j];
			j++;
		}
	}

	public static void imprimirArreglo(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
}