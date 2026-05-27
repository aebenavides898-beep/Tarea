package recursion_generics;

public class RecursionUtils {

    // ── 1. Cuenta regresiva ──────────────────────────────────────────────────
    public static void cuentaRegresiva(int n) {
        if (n <= 0) {
            System.out.println("¡Despegue!");
            return;
        }
        System.out.println(n);
        cuentaRegresiva(n - 1);
    }

    // ── 2. Imprimir array recursivamente ─────────────────────────────────────
    public static void imprimirArray(int[] arr, int indice) {
        if (indice >= arr.length) return;
        System.out.println(arr[indice]);
        imprimirArray(arr, indice + 1);
    }

    // ── 3. Producto recursivo (1 × 2 × … × n) ────────────────────────────────
    public static int producto(int n) {
        if (n <= 1) return 1;
        return n * producto(n - 1);
    }

    // ── 4. Suma de pares hasta n ─────────────────────────────────────────────
    public static int sumarPares(int n) {
        if (n < 2) return 0;
        if (n % 2 == 0) return n + sumarPares(n - 2);
        return sumarPares(n - 1);
    }

    // ── 5. Factorial con validación ──────────────────────────────────────────
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo: " + n);
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // ── 6. Combinaciones C(n, k) ─────────────────────────────────────────────
    public static long combinaciones(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    // ── 7 & 8. Helper de Fibonacci (privado) ─────────────────────────────────
    private static long fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // ── 7. Imprimir los primeros n números de Fibonacci ──────────────────────
    public static void imprimirFibonacci(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(", ");
            sb.append(fib(i));
        }
        System.out.println(sb);
    }

    // ── 8. Suma de los primeros n términos de Fibonacci ──────────────────────
    public static long sumaFibonacci(int n) {
        long suma = 0;
        for (int i = 0; i < n; i++) {
            suma += fib(i);
        }
        return suma;
    }

    // ── 9a. Suma recursiva de arreglo ─────────────────────────────────────────
    public static int sumarRecursivo(int[] arr, int indice) {
        if (indice >= arr.length) return 0;
        return arr[indice] + sumarRecursivo(arr, indice + 1);
    }

    // ── 9b. Promedio usando sumarRecursivo ────────────────────────────────────
    public static double promedio(int[] arr) {
        return (double) sumarRecursivo(arr, 0) / arr.length;
    }

    // ── 10a. Mínimo recursivo ────────────────────────────────────────────────
    public static int minimo(int[] arr, int indice) {
        if (indice == arr.length - 1) return arr[indice];
        int minResto = minimo(arr, indice + 1);
        return arr[indice] < minResto ? arr[indice] : minResto;
    }

    // ── 10b. Contar ocurrencias recursivamente ────────────────────────────────
    public static int contar(int[] arr, int indice, int valor) {
        if (indice >= arr.length) return 0;
        int hit = (arr[indice] == valor) ? 1 : 0;
        return hit + contar(arr, indice + 1, valor);
    }

    // ── 11. Contar consonantes ───────────────────────────────────────────────
    public static int contarConsonantes(String s) {
        if (s.isEmpty()) return 0;
        char c = Character.toLowerCase(s.charAt(0));
        boolean esLetra = Character.isLetter(c);
        boolean esVocal = "aeiouáéíóúü".indexOf(c) >= 0;
        int cuenta = (esLetra && !esVocal) ? 1 : 0;
        return cuenta + contarConsonantes(s.substring(1));
    }

    // ── 12. Reemplazar caracteres ────────────────────────────────────────────
    public static String reemplazar(String s, char viejo, char nuevo) {
        if (s.isEmpty()) return "";
        char c = s.charAt(0);
        char reemplazado = (c == viejo) ? nuevo : c;
        return reemplazado + reemplazar(s.substring(1), viejo, nuevo);
    }

    // ── 13. Búsqueda binaria en arreglo de Strings ───────────────────────────
    public static int busquedaBinaria(String[] arr, String objetivo, int izq, int der) {
        if (izq > der) return -1;
        int medio = (izq + der) / 2;
        int cmp = arr[medio].compareTo(objetivo);
        if (cmp == 0) return medio;
        if (cmp > 0) return busquedaBinaria(arr, objetivo, izq, medio - 1);
        return busquedaBinaria(arr, objetivo, medio + 1, der);
    }

    // ── 14. Potencia eficiente (divide y vencerás) ───────────────────────────
    public static long potencia(int base, int exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) {
            long mitad = potencia(base, exp / 2);
            return mitad * mitad;
        }
        return base * potencia(base, exp - 1);
    }
}
