//4. Buscar un elemento en un arreglo de caracteres ya cargado de
//tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
//estar indicarlo también
public class Uni5Ejerc4 {
public static int max=10;
public static void main(String []args) {
	try{
		char arreglo[]={'a','b','c','d','e','f','g','h','i','j'};
		for(int i=0;i<max; i++) {
			System.out.println( "arreglo[" + i + "] -> "+ arreglo[i]); //muestra la palabra arreglo 
	} //y entre corchetes la variable i + el valor del arreglo
}	
	catch(Exception exc){
		System.out.println(exc);
	}
}
}
