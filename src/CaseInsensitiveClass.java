import java.util.Scanner;

public class CaseInsensitiveClass {
    //parent class of divided evenly class
    //Multilevel inheritance
    //return type with parameter
    public static boolean inSensitiveMethod(String str1, String str2) {
        /* write a function that validates whether two strings are identical.
        make it case insensitive
         */
        //if two string are identical=true if not false
        //checking strings are identical or not using ternary operator
        boolean result7 = (str1.equalsIgnoreCase(str2) ? true : false);
        return result7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("7.Enter your first string to match if it is identical or not = ");
        String str1 = scanner.next();
        System.out.print("7.Enter your second string to match if it is identical or not = ");
        String str2 = scanner.next();
        System.out.println("Identicla String = "+ inSensitiveMethod(str1,str2));
    }
}
