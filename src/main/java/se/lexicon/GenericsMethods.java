package se.lexicon;

import java.util.Locale;

public class GenericsMethods {

    // Generic method example
    public static <T> boolean areEquals(T firstValue, T secondValue) {
        boolean result = firstValue.equals(secondValue);
        return result;
    }

    public  static <T> void printData(T input){
        System.out.println(input.toString());
    }


    public static void main(String[] args) {
        Integer num1= 12;
        Integer num2 = 12;
        boolean result = GenericsMethods.areEquals(num1,num2);
        System.out.println("result = " + result);


        String fn1= "Mehrdad";
        String fn2 = "MEHRDAD";
        System.out.println(GenericsMethods.areEquals(fn1.toLowerCase(),fn2.toLowerCase()));

        //System.out.println(GenericsMethods.areEquals(123, "Mehrdad"));

        System.out.println("---------------------------");
        printData("Mehrdad");
        printData(1234);
        printData(12.33d);

    }


}
