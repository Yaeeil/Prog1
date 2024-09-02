/*este es el 1 
 */
public class ext1arr {
	public static final int MAX=11;
	public static void main(String [] args){
	int []arr={0,2,4,5,0,8,0,17,20,22,0};
	mostrarArreglo(arr);
    contar_sec_pares(arr);
 }
    public static void contar_sec_pares(int[] arr) {
        int fin = -1;
        int inicio = obtener_inicio(arr, fin + 1);
        int contar = 0;
        int inicioMayor = 0;
        int finMayor = 0;
        int contarMayor = 0;
        while (inicio < MAX) {
            fin = obtener_fin(arr, inicio);
            contar = contarPares(arr, inicio, fin);
            if (contar > contarMayor) {
                contarMayor = contar;
                inicioMayor = inicio;
                finMayor = fin;
            }
            else if (contar==contarMayor) {
                inicio = obtener_inicio(arr, fin + 1);

            }

            inicio = obtener_inicio(arr, fin + 1);

          

        }


        System.out.println("La secuencia con mayor cantidad de numeros pares empieza en: " + inicioMayor
        + " y finaliza en: " + finMayor);
    }

    public static int contarPares(int[] arr, int inicio, int fin) {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (arr[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;

    }
    public static int obtener_inicio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }

        return pos;

    }

    public static int obtener_fin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }

        return pos - 1;

    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++)
            System.out.print(arr[i] + "|");
        System.out.println();
    }
}