package Uni6;
import java.util.Arrays;

public class PFinal1VersionChat {

    public static void main(String[] args) {
        char[] arregloA = {'a', 'e', '0', 'i', 'o', 'u', '0', 'e', 'i', '0'};
        char[] arregloB = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', '0', 'i', 'j', 'k', '0', 'l', 'm', 'n', 'o', 'p', '0'};

        reemplazarSecuenciaCentral(arregloA, arregloB);

        System.out.println("Arreglo A después del reemplazo: " + Arrays.toString(arregloA));
    }

    public static void reemplazarSecuenciaCentral(char[] arregloA, char[] arregloB) {
        int inicioA = buscarInicioSecuencia(arregloA);
        int inicioB = buscarInicioSecuencia(arregloB);

        int finA = buscarFinSecuencia(arregloA, inicioA);
        int finB = buscarFinSecuencia(arregloB, inicioB);

        int longitudSecuenciaA = finA - inicioA + 1;
        int longitudSecuenciaB = finB - inicioB + 1;

        if (longitudSecuenciaA < longitudSecuenciaB) {
            System.out.println("La secuencia en el arreglo A es más corta que la secuencia en el arreglo B. No se puede realizar el reemplazo.");
            return;
        }

        int cantidadConsonantesA = contarConsonantes(arregloA, inicioA, finA);
        int cantidadConsonantesB = contarConsonantes(arregloB, inicioB, finB);

        if (cantidadConsonantesA >= cantidadConsonantesB) {
            System.out.println("La secuencia en el arreglo A tiene más o igual cantidad de consonantes que la secuencia en el arreglo B. No se realiza el reemplazo.");
            return;
        }

        int diferenciaLongitud = longitudSecuenciaA - longitudSecuenciaB;
        int corrimiento = diferenciaLongitud / 2;

        for (int i = 0; i < longitudSecuenciaB; i++) {
            arregloA[inicioA + corrimiento + i] = arregloB[inicioB + i];
        }
    }

    public static int buscarInicioSecuencia(char[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != '0') {
                return i;
            }
        }
        return -1; // Si no se encuentra secuencia
    }

    public static int buscarFinSecuencia(char[] arreglo, int inicio) {
        for (int i = inicio; i < arreglo.length; i++) {
            if (arreglo[i] == '0') {
                return i - 1;
            }
        }
        return arreglo.length - 1; // Si no se encuentra secuencia
    }

    public static int contarConsonantes(char[] arreglo, int inicio, int fin) {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            char c = Character.toLowerCase(arreglo[i]);
            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                contador++;
            }
        }
        return contador;
    }
}
