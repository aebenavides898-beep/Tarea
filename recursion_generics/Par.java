package recursion_generics;

public class Par<T, U> {

    private final T primero;
    private final U segundo;

    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() { return primero; }
    public U getSegundo() { return segundo; }

    public void mostrar() {
        System.out.println("Par(" + primero + ", " + segundo + ")");
    }
}
