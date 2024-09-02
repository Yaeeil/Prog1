//Se tiene un arreglo de enteros de tamaño 20 de secuencias de
//números entre 1 y 9, separadas por 0. El arreglo está precargado,
//y además empieza y termina con uno o más separadores 0. Hacer
//un programa que permita obtener a través de métodos la posición
//de inicio y la posición de fin de la secuencia ubicada a partir de
//una posición entera ingresada por el usuario. Finalmente, si
//existen imprima por pantalla ambas posiciones obtenidas
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class uni5ej24 {
	public static final int max=20;

public static void main(String[]args) {
	int arreglo[]= {0,1,2,3,0,1,4,7,0,1,2,3,0,1,4,7,0,1,0,0};
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	try{System.out.println("ingrese una posicion:");
	int pos=Integer.valueOf(input.readLine());
	int inicio=posicion_inicio(arreglo, pos);
	int fin=posicion_fin(arreglo, pos);
	System.out.println("inicio: "+ inicio);
	System.out.println("final: "+fin);
	
}
catch(Exception exc) {
	System.out.println(exc);
}
}
public static int posicion_inicio(int [] arreglo, int pos){
	System.out.println("inicio");
	int inicio=-1;
	for(int i=pos; i<max; i++) {
		if(arreglo[i]!=0) {
			inicio=i;	
		}
	}
	return inicio;
}

public static int posicion_fin(int[] arreglo, int pos){
	System.out.println("fin");
	int fin=-1;
	for(int i=pos; i<max;i++) {
		if (arreglo[i] == 0) {
            fin = i - 1;
}
}
	return fin;
}
}

