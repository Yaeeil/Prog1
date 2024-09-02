import java.io.BufferedReader;
import java.io.InputStreamReader;
public class uni5ej27 {
	public static void burbujeo(int[] arreglo){ //esto ordena las secuencias de a pares
		 int temp;
		 for(int i = 1;i < max;i++){
			 for (int j = 0 ; j < max - 1; j++){
				 if (arreglo[j] > arreglo[j+1]){
					 temp = arreglo[j];
					 arreglo[j] = arreglo[j+1];
					 arreglo[j+1] = temp;
				 }
			 }
		 }
	}

public static final int max=10;
public static void main(String [] args) {
	int arreglo[]= {0,2,4,6,8,10,12,14,16,18};
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	try{System.out.println("ingrese un num:");
	int num=Integer.valueOf(input.readLine());
	
	for (int i = max-2; i >=0; i--) { //inicia en 8, para obtener luego el lugar del primer valor al sumarle a i+1 y perder el ultimo
        arreglo[i + 1] = arreglo[i]; //si pusiera -1 en max- no funcionaria porque no daria el largo del array
	}
	arreglo[0]=num;
	burbujeo(arreglo);
	for(int x=0;x<max;x++) {
	System.out.println(arreglo[x]);
	}
}
	catch(Exception exc) {
		System.out.println(exc);
}
}
}
