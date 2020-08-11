import java.util.Scanner;

public class TotalCupClass extends HasSpaceClass {

    //hierarchical inheritance
    //child class of has space class
    //return type with no parameter
    private static int totalCupMethod() {
        /*per 6 coffee cups i buy, i get 7th free.in total,i get 7cups,create a function that takes n
        cups bought and return as an integer the total number of cups i would get.
         */
        //Buy 6 coffee cups and get additional 1 for free
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of cups = ");
        Integer cups = scanner.nextInt();
        Integer result6 = (cups / 6) + cups;
        return result6;
    }

    public static void main(String[] args) {
        TotalCupClass totalCupClass = new TotalCupClass();
        System.out.println("Total number of cups = " + totalCupMethod());
        //calling a method from its parent class has space class
        Scanner scanner = new Scanner(System.in);
        System.out.print("3.Enter the to test if it has space or not = ");
        System.out.println("String space = " + totalCupClass.SpacesMethod(scanner.nextLine()));



    }

}
