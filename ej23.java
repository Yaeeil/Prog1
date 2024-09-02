public class ej23 {
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 0, 5, 6, 7, 0};
        System.out.println("Original:");
        imprimirArreglo(arr);

        invertir_Ult_Secuencia(arr);

        System.out.println("");
        System.out.println("Modificado:");
        imprimirArreglo(arr);
    }

    public static void invertir_Ult_Secuencia(int[] arr) {
    	int posFin = MAX-1;
		int posIni = 0;
		posFin = obtenerFin(arr, posFin);
		posIni = obtenerPosIni(arr, posFin);
        invertirSecuencia(arr, posIni, posFin);
        System.out.println("inicio: " + posIni + " fin: " + posFin);
    }

	public static int obtenerFin(int[] arr, int pos) {//aranca de atras para adelante
		while(pos > 0 && arr[pos] == 0) {
			pos--;
		}
		return pos;
	}
	
	public static int obtenerPosIni(int[] arr, int pos) {//aranca de atras para adelante
		while(pos > 0 && arr[pos] != 0) {
			pos--;
		}
		return pos+1;
	}

    public static void invertirSecuencia(int[] arr, int ini, int fin) {
        int valor;
        int j = fin;
        for (int i = ini; i < (fin + ini + 1) / 2; i++) {
            valor = arr[i];
            arr[i] = arr[j];
            arr[j] = valor;
            j--;
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
