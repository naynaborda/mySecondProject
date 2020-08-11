import java.util.Scanner;

public class DividedEvenlyClass extends CaseInsensitiveClass {
    //multilevel inheritance
    //child class of case insensitive class
    //parent class of star number class
    //return type with no parameter
    protected static boolean dividedEvenlyMethod() {
        //Given two integers,a and b,return true if a can be divided evenly by b.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number to test if is divided evenly or not = ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number to test if it is divided evenly or not = ");
        int b = scanner.nextInt();
        //checking integers are evenly divided or not by using ternary operator
        boolean result8 = (a % b == 0) ?true : false;
        return result8;
    }

    public static void main(String[] args) {
        System.out.println("Divided Evenly = " + dividedEvenlyMethod());
        // can call from its parent class insensitive method
        //System.out.println(inSensitiveMethod());
    }
}
