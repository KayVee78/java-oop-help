import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Contact contactOne = new Contact("Sally", new PhoneNumber("2637263737"));
        Contact contactTwo = new Contact("Maggie Smith", new PhoneNumber(41, "9384713401"));
        Contact contactThree = new Contact("Rogger", "rogger@gmail.com");
        Contact contactFour = new Contact("Sarah", new PhoneNumber("2637263737"), "sarah@gmail.com");
        //If we just print data as below, we will not see the actual data but we'll only see the references to the contact objects
        //So we'll have to override the toString method
//        System.out.println(contactOne);

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
    }
}
