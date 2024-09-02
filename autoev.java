
public class autoev {
	public static void calcular(int a, int b) {
		int c = 0;
		int suma = 0;
		while (a < 10) {
		   c = a / b;
	           if (c > 2)
		      b++;
		   else
	              a++;
		   suma += b;
		}
		System.out.println(a + " " + b + " " + suma);
	}
public static void main(String []args) {
	calcular(0,3);
}
}
