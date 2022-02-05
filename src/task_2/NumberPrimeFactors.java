package task_2;

import java.util.ArrayList;

public class NumberPrimeFactors {

    public static ArrayList<Integer> getNumberPrimeFactors(int number) {
        number = Math.abs(number);
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if (number == 1) {//если введенное число 1, то программа должна вывести его
            primeFactors.add(number);
        }
        //проходимся по всем делителям числа от 2 до корня квадратного из числа
        for (int divider = 2; divider * divider <= number; divider++) {//divider*divider <= number эквивалентно divider <= sqrt(number)
            while (number % divider == 0) {//пока число делится на текущий делитель, добавляем его в массив делителей и делим на него число
                primeFactors.add(divider);
                number /= divider;
            }
        }
        if (number != 1) {//Если оставшееся число не равно 1 и оно не добавлено (divider^2 был больше чем number), значит оно простое и его надо добавить
            primeFactors.add(number);
        }
        return primeFactors;
    }

    public static void printNumberPrimeFactors(int number, ArrayList<Integer> primeFactors) {
        System.out.print("|" +number + "| = ");
        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.print(primeFactors.get(i));
            if (i + 1 != primeFactors.size()) {
                System.out.print(" * ");
            }
        }
        System.out.println();
    }

}
