package Uni6;

public class PFinal8 {
	public static final int N=15, M=3;
	public static final char SEP= ' ';
	
	public static void main(String [] args) {
		
	
	char[][] matriz = {
            {'a', 'e', 'i', 'o', 'u', ' ', 'p', 'y', 'u', ' ', 'a', 'a', 'e', 'i', ' '},
            {'h', 'e', 'l', 'l', 'o', ' ', 'y', ' ', 'a', 'i', 'e', 'u', 'o', 'o', ' '},
            {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g', ' ', 'i', 'u', ' '},};
	
	imprimirM(matriz);
	for(int i=0; i<M; i++) {
		recorrer(matriz[i]);
	}
	System.out.println("--------");
	imprimirM(matriz);
	}
	  public static void imprimirM(char[][] arr) {
	        for (int i = 0; i < M; i++) {
	            for (int j = 0; j < N; j++) {
	                System.out.print("'" + arr[i][j] + "'");
	            }
	            System.out.println();
	        }
	    }
	public static void recorrer(char [] arr) {
		int ini=0;
		int fin=-1;
		while(ini<N) {
				ini=buscarIni(arr, fin+1);
			if(ini<N) {
				
					fin=buscarFin(arr, ini);
					if(fin<N) {
						if(todasVocales(arr, ini, fin)){
							eliminarSec(arr, ini, fin);
						}fin=ini;
					{
						
					}
			}
				
			}
		}
	}
	public static void eliminarSec(char [] arr, int ini, int fin) {
		for(int i=ini; i<=fin; i++) {
			corrIzq(arr, ini);
		}
	}
	public static int buscarIni(char []arr, int pos) {
		while(pos<N && arr[pos]==SEP) {
			pos++;
		}return pos;
	}
	

	public static int buscarFin(char []arr, int pos) {
		while(pos <N && arr[pos]!=SEP) {
			pos++;
		}return pos-1;
	}
	public static void corrIzq(char [] arr, int pos) {
		for(int i=pos; i<N-1; i++) {
    		arr[i]=arr[i+1];
	}
	}
	public static boolean todasVocales(char [] arr, int ini, int fin) {
		boolean a=false;
		boolean e=false;
		boolean i=false;
		boolean o=false;
		boolean u=false;
		while(ini<=fin) {
			if(arr[ini] == 'a') {
				a=true;
			}else if(arr[ini] == 'e') {
				e=true;
			}else if(arr[ini] == 'i') {
				i=true;
			}else if(arr[ini] == 'o') {
				o=true;
			}else if(arr[ini] == 'u') {
				u=true;
			} ini++;
			
		} if ((a && e && i && o && u)== true){
			return true; 
		}else {
			return false;
		}
	}
}