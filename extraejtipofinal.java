public class extraejtipofinal {
    public static final int MAX = 12;
    public static final int MAX_NUEVO = 5;

    public static void main(String[] args) {
        int[] arrA = {0, 1, 2, 3, 0, 4, 5, 6, 0, 7, 7, 0};
        int[] arrNUEVO = {0, 4, 5, 3, 0};

        secMayor(arrA, arrNUEVO);
        imprimirArreglo(arrA);
    }

    public static int suma(int[] arr, int ini, int fin) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int posIni(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }

    public static int posFin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }

    public static void corrDcha(int[] arrA, int posInsercion) {
        for (int i = MAX - 1; i > posInsercion; i--) {
            arrA[i] = arrA[i - 1];
        }
    }

    public static void secMayor(int[] arrA, int[] arrNUEVO) {
        int fin = -1;
        int ini = 0;
        int iniN = 0;
        int finN = -1;
        int sumaN = 0;
        int suma = 0;
        iniN = posIni(arrNUEVO, finN + 1);
        finN = posFin(arrNUEVO, iniN);
        sumaN = suma(arrNUEVO, iniN, finN);
        
        while (ini < MAX - 1) {
            fin = posFin(arrA, ini);
            suma = suma(arrA, ini, fin);
            
            if (sumaN > suma) {
                ini = posIni(arrA, fin + 1);
                fin = posFin(arrA, ini);
                suma = suma(arrA, ini, fin);
            } else if (sumaN < suma) {
                for (int i = ini; i < MAX - MAX_NUEVO; i++) {
                    corrDcha(arrA, ini + MAX_NUEVO - 1);
                    
                    for (int j = ini; j < ini + MAX_NUEVO; j++) {
                        arrA[j] = arrNUEVO[j - ini];
                    }
                }
                
                ini = ini + MAX_NUEVO;
            } else {
                ini = posIni(arrA, fin + 1);
            }
        }
    }
}
