//10 que se encuentra precargado, solicite al usuario un número
//entero y elimine la primera ocurrencia del número (un número
//igual) en el arreglo (si existe). Para ello tendrá que buscar la
//posición y si está, realizar un corrimiento a izquierda (queda una
//copia de la última posición del arreglo en la anteúltima posición).
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class uni5ej10 {
	public static final int max=10;
    public static void main(String[] args) {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese un numero entero: ");
            int numero = Integer.valueOf(input.readLine());
            // Buscar la posición de la primera ocurrencia del número
            int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
            int posicion = -1;
            for (int i = 0; i < max; i++) {
                if (arreglo[i] == numero) {
                    posicion = i;
                }
            }
            corrizq(arreglo,posicion);
            imprimir(arreglo);
        }        catch (Exception e) {
            System.out.println("Error: Ingrese un numero entero valido.");
        
    }
    }
                public static void corrizq(int []arreglo, int posicion) {
                for (int i = posicion; i < max- 1; i++) {
                    arreglo[i] = arreglo[i + 1];
                }
                
}
public static void imprimir(int [] arreglo) {
                // Mostrar el arreglo actualizado
                System.out.println("Arreglo despues de eliminar la primera ocurrencia del numero:");
                for (int i = 0; i < max; i++) {
                    System.out.print(arreglo[i] + " ");
                }
            } 
}
