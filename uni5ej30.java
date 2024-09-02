import java.util.Random;

public class uni5ej30 {
	public static final int MAX=10;
	public static final double PROB =0.4;
public static void main (String []args) {
int []arr=new int[MAX];
	cargarArreglo(arr);
	System.out.println("original: ");
	for(int i=0; i<MAX; i++) {
	System.out.print("["+arr[i]+"]");
	}
	ordenar_burbujeo(arr); //llama a la funcion y le pasa como paramatro el arreglo
	 decreciente_burbujeo(arr);
	
}
public static void cargarArreglo(int[] arr) {
	Random r = new Random();
	for(int i = 1; i < MAX-1; i++) {
		if(r.nextDouble() > PROB) {
			arr[i] = (r.nextInt(9) + 1);
		}
	}
}

	//ordenado creciente 
	public static void ordenar_burbujeo(int [] arreglo) {
		int aux;
		for(int i=1; i<MAX; i++) {
			for(int j=0; j<MAX-1; j++) {
				if(arreglo[j]>arreglo[j+1]) {
					aux=arreglo[j];
				arreglo[j]=arreglo[j+1];
				arreglo[j+1]=aux;
				}
			}
		}
		System.out.println("creciente: ");
		for(int x=0; x<MAX; x++) {
			System.out.print("[ " +arreglo[x] + "]");
			}
	}

		

	//ordenado decreciente
	public static void decreciente_burbujeo(int []arreglo) {
		int aux;
		for(int i=1; i<MAX; i++) {
			for(int j=0; j<MAX-1; j++) {
				if(arreglo[j]<arreglo[j+1]) {
					aux=arreglo[j];
				arreglo[j]=arreglo[j+1];
				arreglo[j+1]=aux;
				}
			}
	    }
		System.out.println("decreciente: ");
	for(int x=0; x<MAX; x++) {
	
		System.out.print("[" + arreglo[x] + "]");
		}
}
}