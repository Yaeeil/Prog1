
public class uni5ej16 {
	public static final int MAX=20;
public static void main(String []args) {
	int arreglo[]={0,3,4,0,8,0,17,20,23,0,1,3,4,0,8,0,17,20,23,0};
	secMayor(arreglo);
}
	public static void secMayor(int[]arreglo) {
	int inicio=0;
	int fin=-1;
	int sumaMaxima = 0;
	int inicioMayor =0;
	int finMayor= -1;
	int sumaActual = 0;
   inicio=obtenerIni(arreglo, fin+1);
while(inicio<MAX-1) {
	fin=obtenerFin(arreglo, inicio);
	sumaActual=suma(arreglo, inicio, fin);
	if (sumaActual > sumaMaxima) {
	            inicioMayor=inicio;
	            finMayor = fin;
	            sumaMaxima = sumaActual;
	                }
	inicio=obtenerIni(arreglo, fin+1);
}
	   imprimir(inicioMayor, finMayor, sumaMaxima);          
	
}
	public static void imprimir(int ini, int fin, int sumaM) {
	 System.out.println("Posición de inicio de la secuencia: " + ini);
	    System.out.println("Posición de fin de la secuencia: " + fin);
	    System.out.println("Suma del contenido de la secuencia: " + sumaM);
}

	public static int suma(int [] arreglo, int ini, int fin) {
		int suma=0;
		for(int i=ini; i<=fin; i++) {
			suma+=arreglo[i];
		}
		return suma;
	}
public static int obtenerIni(int[] arr, int pos) {
    while (pos < MAX-1 && arr[pos] == 0) {
        pos++;
    }
    return pos;
}

public static int obtenerFin(int[] arr, int pos) {
    while (pos < MAX-1 && arr[pos] != 0) {
        pos++;
    }
    return pos - 1;
}

	    }

