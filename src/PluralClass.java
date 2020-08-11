import java.util.Scanner;

public class PluralClass {
    //parent class or super class or base class of compare class
    //single inheritance
    //return type with  parameter
    public static boolean PluralMethod(String str1) {

        //Entering the string for to find out if it is plural
        //checking in the string for plural using ternary operator
        boolean result1 = (str1.endsWith("s")) ? true : false;
        return result1;
    }

    public static void main(String[] args) {
       // PluralClass pluralClass = new PluralClass();
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Enter the to test if it is plural or not = ");
       System.out.println("Plural String result is = " + PluralMethod(scanner.nextLine()));
        /*i can call this class method in his child class compare class so don't
        need main method here
         */


    }
}
