import java.util.Scanner;

public class CompareClass extends PluralClass {
    //single inheritance
    // child class or sub class of plural class
    //return type without parameter
    public static boolean comparison() {
        /*take two string as argument and return either true or false depending on whether the
        total number of characters in the first string is equal to the total number of characters
        in the second string
         */
        //Total number of characters of given two words are equal=true,if not false.
        Scanner scanner = new Scanner((System.in));
        //comparing two string if it is equal or not
        System.out.print("2.Enter the first string to test if total number of characters in both strings" +
                " are same or not = ");
        String str1 = scanner.next();
        System.out.print("2.Enter the the second string to test if total number of characters in both" +
                " Strings are same or not =");
        String str2 = scanner.next();
        //comparing the two string using ternary operator
        boolean result2 = (str1.length() == str2.length()) ? true : false;
        return result2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        CompareClass compareClass = new CompareClass();
        System.out.println("Comparing both string = " + comparison());
        //calling a method from plural class (from its parent class)
        System.out.print("1.Enter the String to test if it is plural or not = ");
        System.out.println("Plural String result is = " + compareClass.PluralMethod(scanner.nextLine()));

    }


}