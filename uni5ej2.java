
public class uni5ej2 {
	public static int max=10;
	public static int contarElementosPorEncima(int[] arreglo, double promedio) {
        int contador = 0;
        for (int i = 0; i < max; i++) {
            if (arreglo[i] > promedio) {
                contador++;
            }
        }
        return contador;
    }

	public static int promedio_arreglo(int [] arr){
	int suma = 0;
	 for (int i = 0; i < max; i++){
	suma+=arr[i];
	 } 
	 return (suma/max);
	 }
public static void main(String []args) {

	try {
		int arreglo[]= {1,2,3,4,5,6,7,8,9,10};
		int promedio;
		 promedio = promedio_arreglo(arreglo);
		 System.out.println("El promedio del arreglo es: " + promedio);	
		 int porencima=contarElementosPorEncima(arreglo, promedio);
		 System.out.println("Cant de elementos por encima: "+  porencima );
	}
	catch(Exception exc) {
		System.out.println(exc);
			
		}
	}
}
