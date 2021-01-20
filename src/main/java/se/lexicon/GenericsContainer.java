package se.lexicon;

public class GenericsContainer<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        GenericsContainer<String> type= new GenericsContainer<>();
        type.set("Mehrdad");
        String name = type.get();

        GenericsContainer<Integer> numberType= new GenericsContainer<>();
        numberType.set(123);
        //numberType.set("qwwww");
    }
}
