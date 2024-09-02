package Uni6;

public class PFinal3 {
public static final int MAXF=5, MAXC=20;
public static final char SEP=' ';
public static void main (String [] args) {
	char[][] matSec = {
            {' ', 'A', 'B', 'G', 'H', ' ', '2', 'A', '3', ' ', 'b', 'R', 'S', 'T', ' ', '6', '5', 'K', ' ', ' '},
            {' ', ' ', '2', '1', '4', '5', ' ', 'P', 'Q', ' ', 'z', 'A', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' '},
            {' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', 'E', 'F', ' ', ' ', ' '},
            {' ', ' ', ' ', 'B', 'C', 'T', 'Z', ' ', 'X', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' '},
            {' ', '1', '2', '4', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', '7', 'H', '2', '1', '8', ' '}
};
	
	imprimirM(matSec);
	System.out.println("hola");
	for(int i=0; i<MAXF; i++) {
		eliminarSecCrec(matSec[i]);
		
	}imprimirM(matSec);
}
public static void eliminarSecCrec(char [] arr) {
	int ini=0;
	int fin=-1;
	while(ini<MAXC) {
		ini=buscarIni(arr, fin+1);
		if(ini<MAXC) {
			fin=buscarFin(arr, ini);
			if(fin<MAXC && esCrec(arr,ini,fin)) {
				eliminarSec(arr, ini, fin);
				fin=ini;//actualizo porque elimine
			}
		}
	}
}
public static void eliminarSec(char [] arr, int ini, int fin) {
	for(int i=ini; i<=fin; i++) {
		corrIzq(arr,ini);
	}
}
public static boolean esCrec(char[] arr, int ini, int fin) {
    while (ini < fin && arr[ini] < arr[ini + 1] ) {
    ini++;
   
} return ini>=fin;
}
public static void imprimirM(char[] []arr) {
    for (int i = 0; i < MAXF; i++) {
    	for (int j = 0; j < MAXC; j++) {
        System.out.print("'" +arr[i][j] + "'");
        
    }System.out.println();
    }
  
}
public static void corrIzq(char [] arr, int pos) {
	for(int i=pos; i<MAXC-1; i++) {
		arr[i]=arr[i+1];
}
}
public static int buscarFin(char [] arr, int pos) {
	while(pos<MAXC && arr[pos]!=SEP) {
	pos++;
}return pos-1;

}
	public static int buscarIni(char [] arr, int pos) {
		while(pos<MAXC && arr[pos]==SEP) {
		pos++;
	}return pos;
	
}
}
