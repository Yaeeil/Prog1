public class uni5ej15 {
	public static final int MAX=20;
    public static void main(String[] args) {
    	int arreglo[]={0,3,4,0,8,0,17,20,23,0,1,3,4,0,8,0,17,20,23,0};
       int inicio = 0; //podria ser otro valor es para que si no es 0 siga ejecutando
        int fin = -1; //podria ser otro valor es para que si no es 0 siga ejecutando
        inicio=posIni(arreglo, fin+1);
        fin=posFin(arreglo, inicio);
        System.out.println("Posición de inicio: " + inicio);
        System.out.println("Posición de fin: " + fin);
    }
    public static int posIni(int [] arreglo, int pos) {
    	while(pos<MAX-1 && arreglo[pos]==0) {
    		pos++;
    		
    	}
    	return pos;
    }
    public static int posFin(int [] arreglo, int pos) {
    	while(pos<MAX-1 && arreglo[pos]!=0) {
    		pos++;
    		
    	}
    	return pos-1;
    }
    
        
  
    }



