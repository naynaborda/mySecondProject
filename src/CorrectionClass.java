import java.util.Scanner;

public class CorrectionClass {
    public static void stringToIntMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any number in string: ");
        String str = scanner.nextLine();
        int j = Integer.parseInt(str);
        System.out.println("String converted to int using parseInt method = "+j);
        //to confirm that string is converted in int
        //System.out.println(j+2);
   }
    public static void wordCountMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence:");
        String str =scanner.nextLine();
        int a=str.split(" ").length;
        System.out.println(a);

    }

    public static void main(String[] args) {
        stringToIntMethod();
        wordCountMethod();
    }
}
