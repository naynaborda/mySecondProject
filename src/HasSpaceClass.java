import java.util.Scanner;

public class HasSpaceClass{
        //parent class of String to Int class,Animal leg class,Total cup class
        //Hierarchical inheritance
    //return type with  parameter
    public static boolean SpacesMethod(String str1) {
        //Entering the string for to find out if space in the string
        //a word contain space=true if not false
        //String str1 = scanner.nextLine();
        //checking in the string for space using ternary operator
        boolean result3 = (str1.contains(" ")) ? true : false;
        return result3;
    }

    public static void main(String[] args) {
        //don't need main method here we can call this method in his child class that's why
       // HasSpaceClass hasspaceclass = new HasSpaceClass();
        Scanner scanner = new Scanner(System.in);
        System.out.print("3.Enter the String to test if it has space or not = ");
        System.out.println("String space = " +SpacesMethod(scanner.nextLine()));


    }
}
