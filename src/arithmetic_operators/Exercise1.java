package arithmetic_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yearlySalary;

        System.out.println("Hey user, how much do you make yearly?");
        yearlySalary = input.nextDouble();

        System.out.println("Your monthly payment is $" + yearlySalary / 12 + " then!");
    }
}
