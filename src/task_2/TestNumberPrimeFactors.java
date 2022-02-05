package task_2;

import java.util.Scanner;

public class TestNumberPrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to stop the program, press enter");
        StringBuffer inputNumber = new StringBuffer(scanner.nextLine());
        while (!inputNumber.toString().equals("")) {

            try {
                int number = Integer.parseInt(inputNumber.toString());
                NumberPrimeFactors.printNumberPrimeFactors(number, NumberPrimeFactors.getNumberPrimeFactors(number));
            } catch (NumberFormatException numberFormatException) {
                System.out.println("The entered number must be an integer");
            }

            //clearing input
            inputNumber.delete(0, inputNumber.length());
            inputNumber.append(scanner.nextLine());
        }
    }

}
