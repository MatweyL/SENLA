package task_4;

import java.util.HashMap;

public class NumberPrinter {
    private static HashMap<Character, String[]> printingNumbers = new HashMap<>();
    private final static int ROWS_NUMBER = 8;
    private final static int COLUMNS_NUMBER = 5;

    static {
        printingNumbers.put('0', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('1', new String[]{
                "   **",
                "  * *",
                " *  *",
                "*   *",
                "    *",
                "    *",
                "    *",
                "    *",
        });
        printingNumbers.put('2', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "    *",
                "   * ",
                "  *  ",
                " *   ",
                "*****",
        });
        printingNumbers.put('3', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "  ** ",
                "   * ",
                "    *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('4', new String[]{
                "  * *",
                "  * *",
                " *  *",
                "*****",
                "    *",
                "    *",
                "    *",
                "    *",
        });
        printingNumbers.put('5', new String[]{
                "*****",
                "*    ",
                "*    ",
                "**** ",
                "    *",
                "    *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('6', new String[]{
                "  ** ",
                " *  *",
                "*    ",
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('7', new String[]{
                "*****",
                "    *",
                "    *",
                "    *",
                "   * ",
                "  *  ",
                " *   ",
                "*    ",
        });
        printingNumbers.put('8', new String[]{
                " *** ",
                "*   *",
                "*   *",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('9', new String[]{
                " *** ",
                "*   *",
                "*   *",
                " ****",
                "    *",
                "    *",
                "*   *",
                " *** ",
        });
        printingNumbers.put('-', new String[]{
                "     ",
                "     ",
                "     ",
                "*****",
                "     ",
                "     ",
                "     ",
                "     ",
        });
        printingNumbers.put('.', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                " *** ",
                " *** ",
        });
    }

    private static char getMaxDigit(String number) {
        char maxDigit = '0';
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) > maxDigit) {
                maxDigit = number.charAt(i);
            }
        }
        return maxDigit;
    }

    public static void printNumber(String number) {
        char maxDigit = getMaxDigit(number);
        for (int rowI = 0; rowI < ROWS_NUMBER; rowI++) {
            for (int i = 0; i < number.length(); i++) {
                if (printingNumbers.containsKey(number.charAt(i))) {
                    if (number.charAt(i) == maxDigit) {
                        System.out.print(printingNumbers.get(number.charAt(i))[rowI].replace('*', maxDigit));
                    }
                    else {
                        System.out.print(printingNumbers.get(number.charAt(i))[rowI]);
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
