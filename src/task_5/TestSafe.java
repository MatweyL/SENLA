package task_5;

import task_3.VowelAnalyzer;

import java.util.Scanner;

public class TestSafe {

    private static void printCommandList() {

        System.out.println("Press 1 to initialize new safe");
        System.out.println("Press 2 to enter the item");
        System.out.println("Press 3 to see the contents of the safe");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to stop the program, press enter");
        printCommandList();
        System.out.println("cmd: ");
        StringBuffer cmd = new StringBuffer(scanner.nextLine());
        Safe safe = null;
        while (!cmd.toString().equals("")) {

            if (cmd.toString().equals("1")) {
                System.out.println("===Safe===");
                System.out.println("capacity: ");
                safe = new Safe(Integer.parseInt(scanner.nextLine()));
            }
            else if (safe != null && cmd.toString().equals("2")) {
                String name;
                int size, price;
                System.out.println("===Item===");
                System.out.println("name: ");
                name = scanner.nextLine();
                System.out.println("size: ");
                size = Integer.parseInt(scanner.nextLine());
                System.out.println("price: ");
                price = Integer.parseInt(scanner.nextLine());
                safe.addNewItem(new Item(name, size, price));
            }
            else if (safe != null && cmd.toString().equals("3")) {
                safe.printCurrentBestCombination();
            }
            else {
                if (safe == null) {
                    System.out.println("The safe wasn't initialized");
                }
                else {
                    System.out.println("Command '" + cmd + "' doesn't exists");
                }
            }

            //clearing input
            cmd.delete(0, cmd.length());
            printCommandList();
            System.out.println("cmd: ");
            cmd.append(scanner.nextLine());
        }
    }

}
