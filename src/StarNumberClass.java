import java.util.Scanner;

public class StarNumberClass extends DividedEvenlyClass {
    //Multilevel Inheritance
    //child class or sub class of divided evenly class
    //parent class of count word class
    //return type with parameter
    protected int starNumberMethod(int n) {
        int result9 = (6 * n * (n - 1) + 1);
        return result9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to know its star number =");
        //int n = scanner.nextInt();
        StarNumberClass starNumberClass = new StarNumberClass();
        System.out.println("Star Number = " + starNumberClass.starNumberMethod(scanner.nextInt()));
        //we can call it from its parent class divided evenly method
       // System.out.println(dividedEvenlyMethod());


    }
}
