package Practice2;

public class Generics<T> implements Alpha<String>{

    private T ref;

    public Generics(T ref) {
        this.ref = ref;
    }

    public void display() {
        System.out.println("The Type of t is "+ref.getClass().getName());
    }

    public T getRef() {
        return ref;
    }
}
