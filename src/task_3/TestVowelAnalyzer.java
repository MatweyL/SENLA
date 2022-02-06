package task_3;

import java.util.Scanner;

public class TestVowelAnalyzer {

    private static void printCommandList() {
        System.out.println("Press 1 to enter the sentence and get the sorted words by number of vowels of the sentence");
        System.out.println("Press 2 to enter the word and count the number of vowels in it");
        System.out.println("Press 3 to enter the word and make its first vowel upper");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to stop the program, press enter");
        printCommandList();
        System.out.println("cmd: ");
        StringBuffer cmd = new StringBuffer(scanner.nextLine());
        StringBuffer inputText = new StringBuffer();
        while (!cmd.toString().equals("")) {

            if (cmd.toString().equals("1")) {
                System.out.println("sentence: ");
                inputText.delete(0, inputText.length());
                inputText.append(scanner.nextLine());
                VowelAnalyzer.printSortedSentence(VowelAnalyzer.sortSentenceByNumberOfVowels(inputText.toString()));
            }
            else if (cmd.toString().equals("2")) {
                System.out.println("word: ");
                inputText.delete(0, inputText.length());
                inputText.append(scanner.nextLine());
                System.out.println(VowelAnalyzer.getNumberOfVowels(inputText.toString()));
            }
            else if (cmd.toString().equals("3")) {
                System.out.println("word: ");
                inputText.delete(0, inputText.length());
                inputText.append(scanner.nextLine());
                System.out.println(VowelAnalyzer.makeFirstVowelUpper(inputText.toString()));
            }
            else {
                System.out.println("Command " + cmd + " doesn't exists");
            }

            //clearing input
            cmd.delete(0, cmd.length());
            printCommandList();
            System.out.println("cmd: ");
            cmd.append(scanner.nextLine());
        }
    }

}
