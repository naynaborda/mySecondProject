import java.util.Scanner;

public class AnimalLegClass extends HasSpaceClass {
    //Hierarchical inheritance
    //child class of has space class
    // return type with parameter
    public static int numberOfLegsMethod(int chicken, int cows, int pigs) {
        //to find out how many legs can be counted among all the animals
        Integer results5 = (chicken * 2 + cows * 4 + pigs * 4);
        return results5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalLegClass animalLegClass = new AnimalLegClass();
        System.out.print("5.Enter the number of Chicken = ");
        //Integer chicken=scanner.nextInt();;
        System.out.print("5.Enter the number of  Cows = ");
        //Integer cows=scanner.nextInt();;
        System.out.print("5.Enter the number of  Pigs = ");
        // Integer pigs = scanner.nextInt();;
        System.out.println("Total number of the legs of animals =" + numberOfLegsMethod(scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt()));


    }
}
