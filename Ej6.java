import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ej6 {
	public static void main (String[] args) throws IOException {
		BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Tipo de factura:");
		String factura= bf.readLine();
		System.out.println("Numero de factura:");
		String numb= bf.readLine();
		System.out.println("Nombre:");
		String nombre= bf.readLine();
		System.out.println("Producto 1:");
		String prod1= bf.readLine();
		System.out.println("Importe 1:");
		String impor1= bf.readLine();
		System.out.println("Producto 2:");
		String prod2= bf.readLine();
		System.out.println("Importe 2:");
		String impor2= bf.readLine();
		System.out.println("Total:");
		String total= bf.readLine();
		System.out.println("Factura"+"                "+ factura +"        " +  numb);
		System.out.println("Nombre"+ "                "+ nombre);
		System.out.println("Producto"+"               "+"Importe");
		System.out.println(prod1 +  "                 "+impor1);
		System.out.println(prod2 +  "                 "+ impor2);
		System.out.println("Importe total"  +"        "+ total);
		
	}
}
