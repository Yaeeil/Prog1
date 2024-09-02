import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej13uni5 {
public static final int max=10;
public static void main (String []args) {
int[]arreglo= {18,16,14,12,10,8,6,4,2,0};

try{
	BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("ingrese un num");
int num=Integer.valueOf(input.readLine());
insertarvalor(arreglo, num);
}
catch(Exception exc) {
	
}
}
public static void insertarvalor(int []arreglo, int num){
	int i=0;
	while((i<max)&&(num<arreglo[i]) ) {//mientras i sea mas chico que max y 
		i++;						//el numero no sea mayor al arreglo
		
	}
	if(i<max){	
		corrimientoDerecha(arreglo, i);//solo el valor de i esta bien
		arreglo[i]=num;		
	}
		
	imprimirArreglo(arreglo);
			
		}
public static void corrimientoDerecha(int[]arreglo, int inicio) {
	for (int i = max - 1; i > inicio; i--) {
	            arreglo[i] = arreglo[i - 1];
		}
 }


   
public static void imprimirArreglo(int []arreglo) {
for (int j=0; j<max; j++) {
System.out.print(arreglo[j]+ " ");
}
}
}


	


