package se.lexicon;

import se.lexicon.model.Car;
import se.lexicon.model.Person;
import se.lexicon.model.Student;
import se.lexicon.model.Teacher;

public class GenericsBoundedMethods {


    public static <T extends Number> Number addition(T firstInput, T secondInput) {
        return firstInput.intValue() + secondInput.intValue();
    }


    public static int odlAddition(int num1, int num2) {
        return num1 + num2;
    }


    public static <T extends Person> boolean compare(T firstElement, T secondElement){
        return firstElement.equals(secondElement);
    }


    public static void main(String[] args) {
        System.out.println(odlAddition(12, 33));

        addition(12,100); // Integer Object
        addition(12.00d,100.00d); // Double Object
        //addition("sss","ffff");


        Student student1= new Student();
        Student student2= new Student();
        compare(student1,student2);

        Teacher teacher1= new Teacher();
        Teacher teacher2= new Teacher();
        compare(teacher1,teacher2);

        Car volvo = new Car();
        Car bmw = new Car();
        //compare(bmw ,volvo);
    }

}
