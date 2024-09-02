package Uni6;

public class extra_prefinal2OtraForma {
	  public static final int N=5, M=20, P=2, K=2;
	  public static final char L='F', SEP = ' ';
	  public static void main(String[]args){
	    char[][] matriz = {
	      {' ','1','2','G','H',' ','2','A','3',' ','3','R','B','J',' ','6','5','K',' ',' '},
	      {' ',' ','2','1','4','5',' ','R','P',' ','D','3',' ','7','M','N','W',' ',' ',' '},
	      {' ','4','G','8',' ','3','5','7','1',' ',' ','2','X',' ','D','4','1',' ',' ',' '},
	      {' ',' ',' ','5','T','T','M',' ','A','P','1','1',' ','2','1','3',' ','1','3',' '},
	      {' ','6','6','4',' ','5','4',' ',' ','A','2','1','2',' ','G','4','2','1','8',' '}
	    };
	    System.out.println("Se encontraron " + contarPosiblesExtraterrestres(matriz) + " señales posibles de extraterrestres.");

	  }
	  public static int contarPosiblesExtraterrestres(char[][]matriz){
	    int consecutivas = 0, posiblesExtraterrestre = 0;
	    for(int fila = 0; fila < N; fila++){
	      if(posibleSignal(matriz[fila])){
	        consecutivas++;
	      } else {
	        consecutivas=0;
	      }
	      if(consecutivas == P){
	        posiblesExtraterrestre++;
	        consecutivas=0;
	        int j=0;
	        for (int i = fila-P+1; j < P; j++) {
	          System.out.println(i++);
	        }
	      }
	    }
	    return posiblesExtraterrestre;
	  }
	  public static boolean posibleSignal(char[]arr){
	    boolean esPosible = false;
	    int ini = 0, fin = 0;
	    while(ini < M -1 && !esPosible ){
	      ini = buscarIni(arr,fin+1);
	      if(ini < M-1){
	        fin = buscarFin(arr, ini);
	        esPosible = encuentroValida(arr,ini,fin); // Como devuelve false o true, me ahorro escribir el if
	      }
	    }
	    return esPosible;
	  }
	  public static boolean encuentroValida(char[]arr, int ini, int fin){
	    boolean valida = false;
	    int mayores=0;
	    while(ini<=fin && !valida){
	      if(arr[ini]>L){
	        mayores++;       
	        valida = mayores==K; // Otra vez. Como devuelve false o true, me ahorro el if
	      }
	      ini++;
	    }
	    return valida;
	  }
	  public static int buscarIni(char[]arr, int fin){
	    while(fin < M-1 && arr[fin] == SEP){
	      fin++;
	    }
	    return fin;
	  }
	  public static int buscarFin(char[]arr, int ini){
	    while(ini < M-1 && arr[ini] != SEP){
	      ini++;
	    }
	    return ini-1;
	  }
	}


