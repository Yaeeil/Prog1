//Hacer un programa que dado un arreglo de caracteres de tamaño
//10 que se encuentra cargado, invierta el orden del contenido. Este
//intercambio no se debe realizar de manera explícita, hay que
//hacer un método que incluya una iteración de intercambio
public class Uni5ejerc5{
	public static int max=10;
	public static void main(String []args){
	try {	
		char arreglo[]={'a','b','c','d','e','f','g','h','i','j'};
		for(int i=max-1;i>=0;i--){ //-1 ya que la posicion 10 no existe, solo existe hasta la posicion 9
			System.out.println("arreglo[" + i + "] ->" + arreglo[i]);
		}
	}
	catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
