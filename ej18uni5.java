import java.util.Random;

public class ej18uni5 {
    public static final int MAX = 20;
    public static final double PROB = 0.4;

    public static void main(String[] args) {
        int arr[] = new int[MAX];
        cargarArreglo(arr);
        imprimir_arreglo_secuencias_int(arr);
        compararLongitudesDeCadaSecuencia(arr);
    }

    public static void cargarArreglo(int[] arr) {
		Random r = new Random();
		for(int i = 1; i < MAX-1; i++) {
			if(r.nextDouble() > PROB) {
				arr[i] = (r.nextInt(9) + 1);
			}
		}
	}
    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println();
    }

    public static int obtenerIni(int arr[], int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static int sumarLongitudesDeCadaSecuencia(int[] arr, int ini, int fin) {
        int longitud = 0;
        for (int i = ini; i < fin; i++) {
            longitud = (fin - ini) + 1;
        }
        return longitud;
    }

    public static void compararLongitudesDeCadaSecuencia(int[] arr) {
        int ini = 0;
        int fin = -1;
        int iniciomayor = 0;
        int finmayor = 0;
        int secuenciamayor = 0;
        ini = obtenerIni(arr, fin + 1);
        while (ini < MAX) {
            
            fin = obtenerFin(arr, ini);
            int longitudsecuencia = sumarLongitudesDeCadaSecuencia(arr, ini, fin);
            /*tambien en vez de una funcion podria ir fin-ini+1 y funcionaria*/

            if (longitudsecuencia > secuenciamayor) {
                secuenciamayor = longitudsecuencia;
                iniciomayor = ini;
                finmayor = fin;
            }
            ini=obtenerIni(arr, fin+1);

        }
        System.out.println("La secuencia de mayor tamaño tiene una longitud de: " + ((finmayor - iniciomayor) + 1) + " y empieza en: "
                + iniciomayor + " y termina en: " + finmayor);
    }
}