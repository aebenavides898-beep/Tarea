package recursion_generics;

import java.util.List;

public class GenericsUtils {

    // ── 17. Buscar elemento (devuelve índice o -1) ───────────────────────────
    public static <T> int buscar(T[] arr, T valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(valor)) return i;
        }
        return -1;
    }

    // ── 18. Convertir arreglo genérico a String[] ────────────────────────────
    public static <T> String[] aTexto(T[] arr) {
        String[] resultado = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultado[i] = arr[i].toString();
        }
        return resultado;
    }

    // ── 19. Mínimo de una lista (T debe ser Comparable) ──────────────────────
    // Original prompt used invalid syntax "<T & Comparable>"; corrected to
    // "<T extends Comparable<T>>" which is standard Java bounded type parameter.
    public static <T extends Comparable<T>> T minimo(List<T> lista) {
        if (lista.isEmpty())
            throw new IllegalArgumentException("La lista no puede estar vacía");
        T min = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(min) < 0) min = elemento;
        }
        return min;
    }

    // ── 20. Promedio de una lista numérica ───────────────────────────────────
    // Original prompt used "<T Number extends>"; corrected to "<T extends Number>".
    public static <T extends Number> double promedio(List<T> lista) {
        if (lista.isEmpty())
            throw new IllegalArgumentException("La lista no puede estar vacía");
        double suma = 0;
        for (T elemento : lista) {
            suma += elemento.doubleValue();
        }
        return suma / lista.size();
    }
}
