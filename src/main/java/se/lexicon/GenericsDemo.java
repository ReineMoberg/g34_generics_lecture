package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        // gneric is a technique of writing code without specifying data type(s)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1234);
        //names.add("name"); got compile time error
        Integer test = numbers.get(0);

        List<String> names = new ArrayList<>();
        // String
        names.add("Test");


    }
}
