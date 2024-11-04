public class Item<T> {
    T id;
    String name;

    public void set(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T get() {
        return this.id;
    }
    
}
