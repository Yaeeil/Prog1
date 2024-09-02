package Uni6;
//Un supermercado almacena los importes de sus ventas anuales en una matriz de NxM, en
//donde cada fila representa las ventas de cada mes. Dentro de un mes, la información es
//almacenada en secuencias separadas por 0 donde cada secuencia representa las ventas
//realizadas dentro de un día. Por ejemplo, en la siguiente tabla, en el mes 1 se realizaron 3
//ventas el primer día por $150, $200 y $165.
//0 0 150 200 165 0 154 352 240 256 0 900 750 0 0
//0 940 105 265 845 215 0 245 765 348 0 741 125 541 0
//0 851 543 625 845 914 0 754 184 452 637 917 0 0 0
//El gerente desea solicitar distintas estadísticas según el mes que se quiere analizar. En
//algunos casos le interesa conocer el promedio mensual de las ventas de mayor importe
//registradas en cada día y en otros casos, necesita saber si el promedio diario de ventas
//fue todos los días superior a X durante el mes. Para ello informa en un arreglo A1 los
//meses que desea la primera estadística y en un arreglo A2 los de la segunda. A1 y A2 son
//de tamaño N, rellenados con 0.
//Por ejemplo, si A1 = {1,2,0} y A2 = {3,0,0} para los meses 1 y 2 se informará que el
//promedio es $484 (200 + 352 + 900 / 3) y 815.33 (940 + 765 + 741 / 3), respectivamente.
//Para el mes 3, dado un X = 600, informará que no se cumplió.

public class ExtraPrefinal1 {
    public static final int MAXF = 3, MAXC = 15, X = 600, SEP = 0;

    public static void main(String[] args) {
        int[][] Matriz = {
                {0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0},
                {0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0},
                {0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0}
        };
        int[] A1 = {1, 2, 0};
        int[] A2 = {3, 0, 0};
        int i = 0;
        int j = 0;
        while (i < MAXF && A1[i] != 0) {
            double prom = promMensual(Matriz[A1[i] - 1]);
            System.out.println("El promedio mensual es: " + prom);
            i++;
        }
        while (j < MAXF && A2[j] != 0) {
            promDiario(Matriz[A2[j] - 1]);
            j++;
        }
    }

    public static int buscarIni(int[] arreglo, int pos) {
        while (pos < MAXC && arreglo[pos] == SEP) {
            pos++;
        }
        return pos;
    }

    public static int buscarFin(int[] arreglo, int pos) {
        while (pos < MAXC && arreglo[pos] != SEP) {
            pos++;
        }
        return pos - 1;
    }

    public static void promDiario(int[] arr) {
        int ini = 0;
        int fin = -1;
        int supero = 0;
        int contador = 0;
        while (ini < MAXC) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXC) {
                fin = buscarFin(arr, ini);
                if (fin < MAXC) {
                    double prom = promedioDiario(arr, ini, fin);
                    contador++;
                    System.out.println("El promedio diario es: " + prom);
                    if (prom > X) {
                        supero++;
                    }
                    }
                }
            }if (contador == supero && contador != 0) {
                System.out.println("El promedio diario de ventas fue superior a X todos los días durante el mes");
        } else {
        	System.out.println("El promedio diario de ventas no fue superior a X");
        }
    }
    

    public static double promedioDiario(int[] arr, int ini, int fin) {
        int suma = 0;
        int largo = (fin - ini + 1);
        double prom = 0;
        while (ini <= fin) {
            suma += arr[ini];
            ini++;
          prom = suma / largo;
        }
        return prom;
    }

    public static double promMensual(int[] arr) {
        int ini = 0;
        int fin = -1;
        int mayor = 0;
        int contador = 0;
        while (ini < MAXC) {
            ini = buscarIni(arr, fin + 1);
            if (ini < MAXC) {
                fin = buscarFin(arr, ini);
                if (fin < MAXC) {
                    mayor += buscarMayor(arr, ini, fin);
                    contador++;
                }
            }
        }
        double promedio = mayor / contador;
        return promedio;
    }

    public static int buscarMayor(int[] arr, int ini, int fin) {
        int buscar = 0;
        int buscarM = 0;
        while (ini <= fin) {
            buscar = arr[ini];
            if (buscar > buscarM) {
                buscarM = buscar;
            }
            ini++;
        }
        return buscarM;
    }
}
