package task_1;

public class DigitAdder {

    public static int getDigitSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt(Character.toString(str.charAt(i)));
            }
        }
        return sum;
    }

}
