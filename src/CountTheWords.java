import java.util.Scanner;

public class CountTheWords extends StarNumberClass {
    //4/07/2020

    //Multilevel Inheritance
    //child class of star number class
    //no return type with no parameter
    public static void wordCountMethod() {
        //create a method that takes a string and returns the word count.the string will be a sentence.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence:");
        String str = scanner.nextLine();
        int a = str.split(" ").length;
        System.out.println(a);

    }
        public static void main(String[] args) {
        wordCountMethod();

        //can call the method from it's parent class star number method
        //System.out.println(countTheWords.starNumberMethod());


    }
}
