package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

    // upper bounded wildcard
    // using upper bounded we can restrict data type or local data types
    public static double sum(List<? extends Number> list) { // all sub-classes + Number
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // unbounded wildcard
    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.println("Data:" + obj);
        }

    }

    // lower bounded wildcard
    public static void addNumbers(List<? super Integer> list){ // all supper classes + Integer
        for (int i = 0 ; i< list.size() ; i++){
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // upper bounded wildcard
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(13);
        numbers.add(100);
        System.out.println(sum(numbers));

        ArrayList<Double> dList = new ArrayList<>();
        dList.add(12.12d);
        dList.add(10.00d);
        dList.add(1.0d);
        sum(dList);

        System.out.println("--------------------------");
        // unbounded wildcard
        printData(numbers);
        printData(dList);

        ArrayList<String> names = new ArrayList<>();
        names.add("Test1");
        names.add("Test2");
        names.add("Test3");
        printData(names);

        // lower bounded wildcard
        addNumbers(numbers);
        //addNumbers(dList);
        ArrayList<Number> n= new ArrayList<>();
        n.add(123);

        addNumbers(n);
    }
}
