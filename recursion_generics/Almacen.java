package recursion_generics;

public class Almacen<T> {

    private static final int CAPACIDAD = 3;

    @SuppressWarnings("unchecked")
    private final T[] productos = (T[]) new Object[CAPACIDAD];
    private int size = 0;

    public void agregar(T item) {
        if (estaLleno())
            throw new IllegalStateException("El almacén está lleno (capacidad: " + CAPACIDAD + ")");
        productos[size++] = item;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= size)
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
        return productos[indice];
    }

    public boolean estaLleno() { return size == CAPACIDAD; }

    public int tamanoActual() { return size; }
}
