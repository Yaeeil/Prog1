public class Uni5ej7 {
    public static final int MAX = 10;
    
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        corrimientoDerecha(arreglo, 5); //va a esa posicion, 5 es la posicion de inicio
        
        for (int i = 0; i < MAX; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    
    public static void corrimientoDerecha(int[] arreglo, int posicionInicio) {
        for (int i = MAX - 1; i > posicionInicio; i--) {
            arreglo[i] = arreglo[i - 1];
        }
    }
}
