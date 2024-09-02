package Uni6;

public class PFinal10 {
	public static final int MAX = 21, SEP = 0, M = 6;

	public static void main(String[] args) {
		int[] ARR = { 0, 1, 2, 3, 0, 5, 6, 7, 0, 8, 9, 10, 0, 13, 10, 11, 0, 13, 14, 15, 0 };
		int[] NUEVO = { 0, 1, 3, 4, 6, 0 };
		imprimirA(ARR);
		insertar1(ARR, NUEVO);
		imprimirA(ARR);
	}

	public static void insertar1(int[] ARR, int[] NUEVO) {
		int dif=0, iniM = 0, finM = 0, tamM = 0, suma = 0, sumaN = 0, sumaM = 0, ini = 0, fin = -1, iniN = 0, finN = -1,
				tamañoN = 0, tamañoA = 0;
		iniN = buscarIni(NUEVO, finN + 1);
		finN = buscarFin(NUEVO, iniN);
		tamañoN = finN - iniN + 1;
		sumaN = suma(NUEVO, iniN, finN);
		while (ini < MAX && sumaN > sumaM) {
			ini = buscarIni(ARR, fin + 1);
			if (ini < MAX) {
				fin = buscarFin(ARR, ini);
				if (fin < MAX) {
					tamañoA = fin - ini + 1;
					suma = suma(ARR, ini, fin);
					if (suma > sumaM) {
						tamM = tamañoA;
						sumaM = suma;
						iniM = ini;
						finM = fin;
						if(sumaM>sumaN && tamM<tamañoN) {
						dif=modificarAgr(ARR, tamM, tamañoN, finM);
						tamM=tamañoN;
							if (sumaM > sumaN && tamM == tamañoN) {
								hacerLugar(ARR, iniM, tamañoN);
								insertar(ARR, NUEVO, iniM, iniN, finN, finM, dif, tamañoN);
						}
						}
						else if(sumaM>sumaN && tamM>tamañoN) {
							dif=modificarAch(ARR, tamM, tamañoN, iniM);
							tamM=tamañoN;
							if (sumaM > sumaN && tamM == tamañoN) {
								hacerLugar(ARR, iniM, tamañoN);
								insertar(ARR, NUEVO, iniM, iniN, finN, finM, dif, tamañoN);
							
						}
					
					}
				}
			}
			}
		}
		}
	
	public static int modificarAgr(int []arrA, int tamañoA, int tamañoB, int finG) {
		int dif=tamañoB-tamañoA;
		while(dif>0) {
		corrDcha(arrA, finG);
		dif--;
		}return tamañoB-tamañoA;
	}
	public static int modificarAch(int []arrA, int tamañoA, int tamañoB, int iniG) {
		int dif=tamañoB-tamañoA;
		while(dif>0) {
			int finG=buscarFin(arrA, iniG);
			corrIzq(arrA, finG);
			dif--;
		}return tamañoB-tamañoA;
	}
	public static void hacerLugar(int[] ARR, int ini, int tamaño) {
		for (int i = 0; i <= tamaño; i++) {
			corrDcha(ARR, ini);
		}
	}

	public static void corrDcha(int[] arr, int pos) {
		for (int i = MAX - 1; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
	}

	public static void insertar(int[] ARR, int[] NUEVO, int iniM, int iniN, int finN, int finM, int dif, int tamaño) {
		while (iniN <= finN) {
			ARR[iniM] = NUEVO[iniN];
			iniM++;
			iniN++;
		}
		ARR[finM+dif+1+tamaño]=0;
		ARR[finM + dif +1] = 0;
	}

	public static int suma(int[] arr, int ini, int fin) {
		int suma = 0;
		while (ini <= fin) {
			suma += arr[ini];
			ini++;
		}
		return suma;
	}

	public static void imprimirA(int[] arr) {
		for (int i = 0; i < MAX; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}

	public static int buscarFin(int[] arr, int pos) {
		while (pos < MAX - 1 && arr[pos] != SEP) {
			pos++;
		}
		return pos - 1;
	}

	public static int buscarIni(int[] arr, int pos) {
		while (pos < MAX && arr[pos] == SEP) {
			pos++;
		}
		return pos;
	}
	 public static void corrIzq(int []arr, int pos) {
	    	for(int i=pos; i<MAX-1; i++) {
	    		arr[i]=arr[i+1];
	    	}
	    }
}


