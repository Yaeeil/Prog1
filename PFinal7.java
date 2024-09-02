package Uni6;

public class PFinal7 {
	public static final int MAXF = 5, MAXC = 20, CANT = 7, R = (MAXF * MAXC);
	public static final char SEP = ' ';

	public static void main(String[] args) {
		char[][] MAT = {
				{ ' ', 'A', 'B', 'G', 'H', ' ', '2', 'A', '3', ' ', 'b', 'R', 'S', 'T', ' ', '6', '5', 'K', ' ', ' ' },
				{ ' ', ' ', '2', '1', '4', '5', ' ', 'P', 'Q', ' ', 'z', 'A', ' ', '7', 'M', 'N', 'W', ' ', ' ', ' ' },
				{ ' ', '4', 'G', '8', ' ', '3', '5', '7', '1', ' ', ' ', '2', 'X', ' ', 'D', 'E', 'F', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', 'B', 'C', 'T', 'Z', ' ', 'X', 'P', '1', '1', ' ', '2', '1', '3', ' ', '1', '3', ' ' },
				{ ' ', '1', '2', '4', ' ', '5', '4', ' ', ' ', 'A', '2', '1', '2', ' ', '7', 'H', '2', '1', '8',
						' ' } };
		char[] AR = new char[R];
		imprimirM(MAT);
		recorrerM(MAT, AR);
		imprimirM(MAT);
		imprimirArr(AR);
	} 

	public static void recorrerM(char[][] MAT, char[] AR) {
		int ini = 0;
		int fin = -1;
		int contador = 0;
		int index = 0;
		for (int i = 0; i < MAXF; i++) {
			while (contador < CANT && ini < MAXC) {
				ini = buscarIni(MAT[i], fin + 1);
				if (ini < MAXC) {
					fin = buscarFin(MAT[i], ini);
					if (fin < MAXC) {
						contador++;
						System.out.println(contador);
					}
				}
			}
			if (contador >= CANT) {
			
				while (ini < MAXC) {
					ini = buscarIni(MAT[i], fin + 1);
					if (ini < MAXC) {
						fin = buscarFin(MAT[i], ini);
						if (fin < MAXC) {
							index = copiarEnArr(MAT[i], AR, ini, fin, index);
							if (index < R) {
								AR[index] = SEP;
								index++;
							}
							eliminarSec(MAT[i], ini, fin);
							fin = ini;
						}
					}
				}
			}
			ini = 0;
			fin = -1;
		}
	}

	public static void eliminarSec(char[] MAT, int ini, int fin) {
		for (int i = ini; i <= fin; i++) {
			corrIzq(MAT, ini);
		}
	}

	public static int copiarEnArr(char[] MAT, char[] AR, int ini, int fin, int index) {
		
		while (ini <= fin && index < R) {
			AR[index] = MAT[ini];
			ini++;
			index++;
		}
		return index;
	}

	public static void imprimirArr(char[] arr) {
		System.out.println("arreglo");
		for (int j = 0; j < MAXF * MAXC; j++) {
			System.out.print("'" + arr[j] + "'");

		}
		System.out.println();
	}

	public static void imprimirM(char[][] arr) {
		for (int i = 0; i < MAXF; i++) {
			for (int j = 0; j < MAXC; j++) {
				System.out.print("'" + arr[i][j] + "'");

			}
			System.out.println();
		}

	}

	public static void corrIzq(char[] arr, int pos) {
		for (int i = pos; i < MAXC - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}

	public static int buscarFin(char[] arr, int pos) {
		while (pos < MAXC && arr[pos] != SEP) {
			pos++;
		}
		return pos - 1;

	}

	public static int buscarIni(char[] arr, int pos) {
		while (pos < MAXC && arr[pos] == SEP) {
			pos++;
		}
		return pos;

	}
}
