import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI person = new BMI(weight,height);
        person.printBMI();
    }
}
