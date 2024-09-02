import java.io.BufferedReader;
import java.io.InputStreamReader;

public class uni5ej9 {
public static final int max=10;
    public static void main(String[] args){
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       try { System.out.print("Ingrese un número entero: ");
        int numero = Integer.valueOf(input.readLine());

       //corrimiento a la derecha
        for (int i = max-2; i >=0; i--) { //inicia en 8, para obtener luego el lugar del primer valor al sumarle a i+1 y perder el ultimo
            arreglo[i + 1] = arreglo[i]; //si pusiera -1 en max- no funcionaria porque no daria el largo del array
        }

        // Agrega el número en la posición 0 ingresado por el usuario
        arreglo[0] = numero;

        // arreglo actualizado
        System.out.println("Arreglo después de agregar el número:");
        for (int i = 0; i < max; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    catch(Exception exc) {
    	System.out.println(exc);
    }
}
}