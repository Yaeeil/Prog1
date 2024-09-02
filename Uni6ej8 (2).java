public class Uni6ej8 {
    private static final int MAX = 10;
    
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        corrimientoIzquierda(arreglo, 3);
        
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
    public static void corrimientoIzquierda(int[] arreglo, int posicionInicio) {
        for (int i = posicionInicio; i < MAX - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        
        arreglo[MAX - 1] = arreglo[9]; //el valor original se ve eliminado y al final se repite el anteult num
    }
}
