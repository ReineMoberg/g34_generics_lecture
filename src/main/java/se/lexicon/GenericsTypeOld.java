package se.lexicon;

public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }


    public static void main(String[] args) {
        GenericsTypeOld stringType = new GenericsTypeOld();
        stringType.set("Hello");

        String name = (String) stringType.get();
        System.out.println("name = " + name);

        Integer num = (Integer) stringType.get();

    }
}
