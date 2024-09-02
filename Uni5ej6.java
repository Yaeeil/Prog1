
public class Uni5ej6 {
	public static int max=10;
	public static void numeros_pares(int[] arreglo){//aca es necesario pasarle las 
		for(int i=0;i<max;i++) { //variables xq si no el metodo no conoce al arreglo
		int pares=arreglo[i]%2;
		if(pares==0) {
			System.out.println("el arreglo["+i+"] es par: ->"+ arreglo[i]);
		}
	}
	}
	public static void main(String []args) {
	
	try{
		int arreglo[]= {1,2,3,4,5,6,7,8,9,10};
		numeros_pares(arreglo);
	}
	catch(Exception exc) {
		System.out.println(exc);
	}
}
}
