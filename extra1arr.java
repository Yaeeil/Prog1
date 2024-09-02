/*en realidad es el 2 este 
 * 
 */
public class extra1arr {
    public static final int MAX = 12;
    
    public static void main(String[] args) {
        int[] arr = {0, 8, 4, -2, 0, 10, 5, 0, 1, 25, 2, 0};
        int ini = 0;
        int fin = -1;
        
        imprimirArregloSecuenciasInt(arr);
        ini = buscarIni(arr, fin + 1);
        fin = buscarFin(arr, ini);
        elementosPar(arr, ini, fin);
       
    }
    
    public static int buscarIni(int[] arr, int pos) {
        while (pos < MAX - 1 && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }
    
    public static int buscarFin(int[] arr, int pos) {
        while (pos < MAX - 1 && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }
    
    public static int suma(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }
    
    public static void elementosPar(int[] arr, int ini, int fin) {
        while (ini < MAX-1) {
            int suma = suma(arr, ini, fin);
            if ((suma % 2) == 0) {
                for (int i = ini; i <= fin; i++) {
                    arr[i]++;
                }
            }
            ini = buscarIni(arr, fin + 1);
            fin = buscarFin(arr, ini);
        }
        imprimirArregloSecuenciasInt(arr);
    }
    
    public static void imprimirArregloSecuenciasInt(int[] arr) {
        System.out.print("Arreglo de secuencias: ");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println();
    }
}
