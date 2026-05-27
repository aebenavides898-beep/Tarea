package recursion_generics;

import java.util.Arrays;
import java.util.List;

public class MainRecursionGenerics {

    public static void main(String[] args) {

        // ── 1. Cuenta regresiva ───────────────────────────────────────────────
        System.out.println("=== 1. Cuenta Regresiva (n=10) ===");
        RecursionUtils.cuentaRegresiva(10);

        // ── 2. Imprimir array recursivamente ─────────────────────────────────
        System.out.println("\n=== 2. Imprimir Array Recursivamente ===");
        int[] arr2 = {14, 27, 3, 88, 51, 6};
        System.out.println("Arreglo: " + Arrays.toString(arr2));
        RecursionUtils.imprimirArray(arr2, 0);

        // ── 3. Producto recursivo ─────────────────────────────────────────────
        System.out.println("\n=== 3. Producto Recursivo ===");
        System.out.println("producto(5) = " + RecursionUtils.producto(5));
        System.out.println("producto(7) = " + RecursionUtils.producto(7));

        // ── 4. Suma de pares hasta n ──────────────────────────────────────────
        System.out.println("\n=== 4. Suma de Pares hasta n=10 ===");
        System.out.println("sumarPares(10) = " + RecursionUtils.sumarPares(10));

        // ── 5. Factorial con validación ───────────────────────────────────────
        System.out.println("\n=== 5. Factorial con Validación ===");
        System.out.println("factorial(5) = " + RecursionUtils.factorial(5));
        System.out.println("factorial(0) = " + RecursionUtils.factorial(0));
        try {
            RecursionUtils.factorial(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("factorial(-3) → Excepción: " + e.getMessage());
        }

        // ── 6. Combinaciones ──────────────────────────────────────────────────
        System.out.println("\n=== 6. Combinaciones C(n, k) ===");
        System.out.println("C(6,3)  = " + RecursionUtils.combinaciones(6, 3));
        System.out.println("C(10,4) = " + RecursionUtils.combinaciones(10, 4));
        System.out.println("C(8,2)  = " + RecursionUtils.combinaciones(8, 2));

        // ── 7. Imprimir primeros N de Fibonacci ───────────────────────────────
        System.out.println("\n=== 7. Primeros N Números de Fibonacci ===");
        System.out.print("n=8:  ");
        RecursionUtils.imprimirFibonacci(8);
        System.out.print("n=15: ");
        RecursionUtils.imprimirFibonacci(15);

        // ── 8. Suma de Fibonacci ──────────────────────────────────────────────
        System.out.println("\n=== 8. Suma de Fibonacci ===");
        System.out.println("sumaFibonacci(10) = " + RecursionUtils.sumaFibonacci(10));

        // ── 9. Promedio recursivo ─────────────────────────────────────────────
        System.out.println("\n=== 9. Promedio Recursivo ===");
        int[] notas = {85, 92, 78, 90, 88, 76};
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.printf("Promedio = %.2f%n", RecursionUtils.promedio(notas));

        // ── 10. Mínimo y conteo ───────────────────────────────────────────────
        System.out.println("\n=== 10. Mínimo y Conteo ===");
        int[] arr10 = {4, 7, 2, 9, 2, 5, 1, 2, 8, 3};
        System.out.println("Arreglo: " + Arrays.toString(arr10));
        System.out.println("Mínimo                = " + RecursionUtils.minimo(arr10, 0));
        System.out.println("Ocurrencias del valor 2 = " + RecursionUtils.contar(arr10, 0, 2));

        // ── 11. Contar consonantes ────────────────────────────────────────────
        System.out.println("\n=== 11. Contar Consonantes ===");
        String[] frases = {
            "Hola mundo",
            "La programacion es divertida",
            "Java es un buen lenguaje de programacion"
        };
        for (String frase : frases) {
            System.out.printf("\"%s\" → %d consonantes%n",
                    frase, RecursionUtils.contarConsonantes(frase));
        }

        // ── 12. Reemplazar caracteres ─────────────────────────────────────────
        System.out.println("\n=== 12. Reemplazar Caracteres ===");
        String original = "la casa amarilla de la abuela";
        System.out.println("Original:              \"" + original + "\"");
        System.out.println("Reemplazar 'a' por 'X': \"" +
                RecursionUtils.reemplazar(original, 'a', 'X') + "\"");

        // ── 13. Búsqueda binaria en Strings ──────────────────────────────────
        System.out.println("\n=== 13. Búsqueda Binaria en Strings ===");
        String[] nombres = {"Ana", "Carlos", "Diana", "Elena", "Jorge", "Luis", "Maria", "Pedro"};
        System.out.println("Lista ordenada: " + Arrays.toString(nombres));
        String[] objetivos = {"Diana", "Luis", "Zara"};
        for (String objetivo : objetivos) {
            int idx = RecursionUtils.busquedaBinaria(nombres, objetivo, 0, nombres.length - 1);
            if (idx >= 0) System.out.printf("  \"%s\" → encontrado en índice %d%n", objetivo, idx);
            else          System.out.printf("  \"%s\" → no encontrado%n", objetivo);
        }

        // ── 14. Potencia eficiente (divide y vencerás) ────────────────────────
        System.out.println("\n=== 14. Potencia Eficiente ===");
        System.out.println("potencia(2, 10) = " + RecursionUtils.potencia(2, 10));
        System.out.println("potencia(3, 5)  = " + RecursionUtils.potencia(3, 5));
        System.out.println("potencia(5, 0)  = " + RecursionUtils.potencia(5, 0));

        // ── 15. Clase Par<T, U> ───────────────────────────────────────────────
        System.out.println("\n=== 15. Clase Par<T, U> ===");
        Par<String, Integer> persona = new Par<>("Andres", 21);
        System.out.print("Par<String, Integer> (nombre, edad): ");
        persona.mostrar();

        Par<String, Boolean> producto = new Par<>("Laptop", true);
        System.out.print("Par<String, Boolean> (producto, disponible): ");
        producto.mostrar();

        // ── 16. Clase Almacen<T> ──────────────────────────────────────────────
        System.out.println("\n=== 16. Clase Almacen<T> ===");

        Almacen<String> almacenTextos = new Almacen<>();
        almacenTextos.agregar("Java");
        almacenTextos.agregar("Python");
        almacenTextos.agregar("C++");
        System.out.println("Almacen<String>:");
        System.out.println("  Tamaño actual : " + almacenTextos.tamanoActual());
        System.out.println("  ¿Lleno?       : " + almacenTextos.estaLleno());
        System.out.println("  Elemento [1]  : " + almacenTextos.obtener(1));

        Almacen<Integer> almacenNums = new Almacen<>();
        almacenNums.agregar(100);
        almacenNums.agregar(200);
        System.out.println("Almacen<Integer>:");
        System.out.println("  Tamaño actual : " + almacenNums.tamanoActual());
        System.out.println("  ¿Lleno?       : " + almacenNums.estaLleno());
        System.out.println("  Elemento [0]  : " + almacenNums.obtener(0));

        // ── 17. Buscar elemento genérico ──────────────────────────────────────
        System.out.println("\n=== 17. Buscar Elemento Genérico ===");
        String[] nombres17 = {"Ana", "Carlos", "Diana", "Elena"};
        System.out.println("String[] : " + Arrays.toString(nombres17));
        System.out.println("  buscar(\"Diana\") → índice " + GenericsUtils.buscar(nombres17, "Diana"));
        System.out.println("  buscar(\"Zara\")  → índice " + GenericsUtils.buscar(nombres17, "Zara"));

        Integer[] nums17 = {10, 25, 37, 42, 58};
        System.out.println("Integer[]: " + Arrays.toString(nums17));
        System.out.println("  buscar(37) → índice " + GenericsUtils.buscar(nums17, 37));
        System.out.println("  buscar(99) → índice " + GenericsUtils.buscar(nums17, 99));

        // ── 18. Convertir a String[] ──────────────────────────────────────────
        System.out.println("\n=== 18. Convertir a String[] ===");
        Integer[] enteros = {1, 2, 3, 4, 5};
        System.out.println("Integer[] original : " + Arrays.toString(enteros));
        System.out.println("String[]  resultado: " + Arrays.toString(GenericsUtils.aTexto(enteros)));

        Double[] decimales = {1.1, 2.2, 3.3, 4.4};
        System.out.println("Double[]  original : " + Arrays.toString(decimales));
        System.out.println("String[]  resultado: " + Arrays.toString(GenericsUtils.aTexto(decimales)));

        // ── 19. Mínimo numérico genérico ──────────────────────────────────────
        System.out.println("\n=== 19. Mínimo Numérico Genérico ===");
        List<Integer> listaInt = Arrays.asList(5, 3, 9, 1, 7);
        System.out.println("List<Integer> " + listaInt + " → mínimo = " + GenericsUtils.minimo(listaInt));

        List<Double> listaDouble = Arrays.asList(4.5, 1.2, 8.9, 2.3);
        System.out.println("List<Double>  " + listaDouble + " → mínimo = " + GenericsUtils.minimo(listaDouble));

        try {
            GenericsUtils.<Integer>minimo(List.of());
        } catch (IllegalArgumentException e) {
            System.out.println("Lista vacía → Excepción: " + e.getMessage());
        }

        // ── 20. Promedio numérico genérico ────────────────────────────────────
        System.out.println("\n=== 20. Promedio Numérico Genérico ===");
        List<Integer> integersP = Arrays.asList(10, 20, 30, 40, 50);
        System.out.printf("List<Integer> %s → promedio = %.2f%n", integersP, GenericsUtils.promedio(integersP));

        List<Double> doublesP = Arrays.asList(1.5, 2.5, 3.5, 4.5);
        System.out.printf("List<Double>  %s → promedio = %.2f%n", doublesP, GenericsUtils.promedio(doublesP));

        List<Long> longsP = Arrays.asList(100L, 200L, 300L);
        System.out.printf("List<Long>    %s → promedio = %.2f%n", longsP, GenericsUtils.promedio(longsP));
    }
}
