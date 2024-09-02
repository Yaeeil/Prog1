package Uni6;

public class practicaFinal1 {
    public static final int MAX = 20;
    public static final char SEP = '0';
    static char[] arrA = {'0','b', 'c', 'd', '0', 'i', '0', 'g', 'h', 'a', '0', 'd', 'e', 'f', '0', 'a', 'i', 'y', 'u', '0'};
    static char[] arrB = {'0','y','z', '0', 'w', 'r', 'a', '0', 'i', 'p', 'f', 'm', 'o', 'p', '0', 'i', '0', 'l', 'm', '0'};

    public static void main(String[] args) {
    	imprimirArreglo(arrA);
        imprimirArreglo(arrB);
    	 int ini=recorrerB(arrB);
    	 reemplazar(arrA, arrB, ini);
        imprimirArreglo(arrA);
        imprimirArreglo(arrB);
    }

    public static void imprimirArreglo(char[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public static int buscarSecMedio(char[] arrA) {
        int ini = 0;
        int fin = -1;
        int contador = 0;
        while (ini < MAX) {
            ini = buscarIni(arrA, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arrA, ini);
                if (fin < MAX) {
                    contador++;
                }
            }
        }
        int mitadSec = (contador / 2)+1;
        System.out.println(mitadSec);
        ini = 0;
        fin = -1;
        contador = 0;
        int iniG = 0;
        while (ini < MAX) {
            ini = buscarIni(arrA, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arrA, ini);
                if (fin < MAX) {
                    contador++;
                    if (contador == mitadSec) {
                        iniG = ini;
                    }
                }
            }
        }
        return iniG;
    }

    public static int recorrerB(char[] arrB) {
        int ini = 0;
        int fin = -1;
        int finM = -1;
        int iniM = 0;
        int contador = 0;
        int contadorM = 0;
        while (ini < MAX) {
            ini = buscarIni(arrB, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arrB, ini);
                if (fin < MAX) {
                    for (int i = ini; i <= fin; i++) {
                        if (arrB[i] != 'a' && arrB[i] != 'e' && arrB[i] != 'i' && arrB[i] != 'o' && arrB[i] != 'u') {
                            contador++;
                        }
                    }
                            if (contador > contadorM) {
                                contadorM = contador;
                                finM = fin;
                                iniM = ini;
                            } contador=0;
                        }
                    }
                   
        }return iniM;
    }

    public static void reemplazar(char[] arrA, char[] arrB, int iniM) {
        
    	int iniG = buscarSecMedio(arrA);
        int finG = buscarFin(arrA, iniG);
        int finM=buscarFin(arrB, iniM);
        int tamañoA=finG-iniG+1;
        int tamañoB=finM-iniM+1;
        System.out.println(tamañoA);
        System.out.println(tamañoB);
       
   
        
    if(tamañoA<tamañoB) {
    	modificarAgr(arrA, tamañoA, tamañoB, iniG);
    }
    else if(tamañoA>tamañoB) {
    	modificarAch(arrA, tamañoA, tamañoB, iniG);
    }
    while(iniG<=finG) {
        for (int i = iniM; i <= finM; i++) {
            arrA[iniG] = arrB[i];
            iniG++;
            }
    }
    }
    public static void corrIzq(char []arr, int pos) {
    	for(int i=pos; i<MAX-1; i++) {
    		arr[i]=arr[i+1];
    	}
    }
    public static void corrDcha(char []arr, int pos) {
    	for(int i=MAX-1; i>pos; i--) {
    		arr[i]=arr[i-1];
    	}
    }
public static void modificarAgr(char []arrA, int tamañoA, int tamañoB, int finG) {
	int dif=tamañoB-tamañoA;
	while(dif>0) {
	corrDcha(arrA, finG);
	dif--;
	}
}
public static void modificarAch(char []arrA, int tamañoA, int tamañoB, int iniG) {
	int dif=tamañoB-tamañoA;
	while(dif>0) {
		int finG=buscarFin(arrA, iniG);
		corrIzq(arrA, finG);
		dif--;
	}
}
    public static int buscarIni(char[] arr, int pos) {
        while (pos < MAX && arr[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(char[] arr, int pos) {
        while (pos < MAX && arr[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }
}
