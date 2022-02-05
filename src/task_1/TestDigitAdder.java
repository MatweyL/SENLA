package task_1;

import java.util.Scanner;

public class TestDigitAdder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to stop the program, press enter");
        StringBuffer inputText = new StringBuffer(scanner.nextLine());
        while (!inputText.toString().equals("")) {

            System.out.println(DigitAdder.getDigitSum(inputText.toString()));

            //clearing input
            inputText.delete(0, inputText.length());
            inputText.append(scanner.nextLine());
        }

    }

}
