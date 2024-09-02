package Uni6;
//codigo que me pasaron
public class PFinal5 {
	  public static final int N = 4, M = 15, P = N * M;
	  public static final char SEP = ' ';

	  public static void main(String[] args) {
	    char[][] mat = {
	      {' ','P','U','E','R','T','A',' ','A','B','R','E',' ',' ',' '},
	      {' ','L','A',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	      {' ',' ','J','U','A','N',' ',' ',' ',' ',' ',' ',' ',' ',' '},
	      {' ',' ',' ',' ','M','A','Ñ','A','N','A',' ',' ','D','E',' '}
	    };
	    char[] arr = new char[P];

	    imprimirMat(mat); 
	    imprimirArr(arr);
	    System.out.println("Se transcribirán todas las secuencias al arreglo");
	    transcribirSecuenciasMatArr(mat, arr);
	    imprimirArr(arr); 
	    System.out.println("Se ordenará el arreglo de manera alfabética");
	    ordenarAlfabeticamenteArr(arr); 
	    imprimirArr(arr); 
	  }

	  // Métodos para imprimir
	  public static void imprimirMat(char[][] mat) {
	    for (int fila = 0; fila < N; fila++) {
	      imprimirArr(mat[fila]);
	    }
	  }

	  public static void imprimirArr(char[] arr) {
	    System.out.print(" | ");
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " | ");
	    }
	    System.out.println();
	  }

	  // Métodos para buscar secuencias
	  public static int buscarIni(char[] arr, int fin) {
	    while (fin < arr.length && arr[fin] == SEP) {
	      fin++;
	    }
	    return fin;
	  }

	  public static int buscarFin(char[] arr, int fin) {
	    while (fin < arr.length && arr[fin] != SEP) {
	      fin++;
	    }
	    return fin - 1;
	  }

	  // Método para transcribir secuencias de la matriz al arreglo
	  public static void transcribirSecuenciasMatArr(char[][] mat, char[] arr) {
	    for (int fila = 0; fila < N; fila++) {
	      int ini = 0, fin = -1;
	      while (ini < M) {
	        ini = buscarIni(mat[fila], fin + 1);
	        if (ini < M) {
	          fin = buscarFin(mat[fila], ini);
	          insertarSecuenciaArr(mat[fila], ini, fin, arr, 0);
	        }
	      }
	    }
	  }

	  // Método para insertar secuencias en el arreglo
	  public static void insertarSecuenciaArr(char[] arrO, int ini, int fin, char[] arrD, int pos) {
	    int tam = fin - ini + 1;
	    // Creo un espacio extra
	    corr_der(arrD, pos);
	    arrD[pos] = SEP;
	    for (int corr = 0; corr < tam; corr++) {
	      corr_der(arrD, pos);
	      arrD[pos] = arrO[fin--];
	    }
	  }

	  public static void reinsertarSecuenciaArr(char[] arr, int ini, int fin, int pos) {
	    char aux;
	    // Se elimina la secuencia de una posición mientras se inserta en otra posición
	    while (ini <= fin + 1) {
	      aux = arr[ini];
	      corr_izq(arr, ini++); // para eliminar el elemento
	      corr_der(arr, pos);   // insertar el elemento
	      arr[pos++] = aux;     // Inserta 
	    }
	  }

	 
	  public static void corr_der(char[] arr, int pos) {
	    for (int i = P - 1; i > pos; i--) {
	      arr[i] = arr[i - 1];
	    }
	  }

	  public static void corr_izq(char[] arr, int pos) {
	    for (int i = pos; i < P - 1; i++) {
	      arr[i] = arr[i + 1];
	    }
	  }

	  
	  public static void ordenarAlfabeticamenteArr(char[] arr) {
	    int pos = 0, last = -1, fin = -1;
	    while (last < P && pos <P) {
	      pos = buscarSiguienteMayorAlfabeticamente(arr, last + 1);
	      if (pos < P) {
	        fin = buscarFin(arr, pos);
	        reinsertarSecuenciaArr(arr, pos, fin, 0);
	        last += fin - pos + 2;
	       
	      }
	    }
	  }

	  // Método para buscar la siguiente secuencia mayor alfabéticamente
	  public static int buscarSiguienteMayorAlfabeticamente(char[] arr, int pos) {
	    char mayor = ' ';
	    int ini_m = P, ini = pos, fin = pos - 1;
	    while (ini < P) {
	      ini = buscarIni(arr, fin + 1);
	      if (ini < P) {
	        fin = buscarFin(arr, ini);
	        if (arr[ini] >= mayor) {
	          mayor = arr[ini];
	          ini_m = ini;
	        }
	      }
	    }
	    return ini_m;
	  }
	}
