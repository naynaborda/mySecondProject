import java.util.Scanner;

public class StringtoIntClass extends HasSpaceClass {
    //child class of has space class
    //Hierarchical inheritance
    //return type with no parameter
    public String stringIntMethod() {
        //Enter a string and returns it as an integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("4.Enter a integer number = ");
        String str1 = scanner.nextLine();
        int j = Integer.valueOf(str1);
        //entering a string using value of method
        String result4 = ("String to int using valueOf() = " + j  );
        return result4;
        // String input = scanner.nextLine();
        //  int i =Integer.parseInt(input);
        //entering a string using parse int method
        // String result4=("String converted to int = " + i);
        // return result4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringtoIntClass stringtoInt = new StringtoIntClass();
        System.out.println(stringtoInt.stringIntMethod());
        //calling a method from its parent class has space class
        System.out.print("3.Enter the to test if it has space or not = ");
        System.out.println("String space = " + stringtoInt.SpacesMethod(scanner.nextLine()));


    }
}
