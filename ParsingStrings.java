import java.util.Scanner;

public class ParsingStrings{
    public static void main(String[] agrs){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        // int userAge = inputDevice.nextInt(); // This is the normal way of reading in an integer
        // System.out.println("You are " + userAge + " years old"); 

        String userAge = inputDevice.next();
        int age = Integer.parseInt(userAge); // This is reading in a string and then parsing it into an integer
        System.out.println("You are " + age + " years old");
    }

    // public static void main(String[] agrs){
    //     Scanner inputDevice = new Scanner(System.in);
    //     System.out.println("Think of a random double: ");
    //     // double userDouble = inputDevice.nextDouble(); // This is the normal way of reading in a double
    //     // System.out.print(userDouble); 

    //     String userDouble = inputDevice.next();
    //     double _double = Double.parseDouble(userDouble); // This is reading in a string and then parsing it into a double
    //     System.out.println(_double);
    // }
}