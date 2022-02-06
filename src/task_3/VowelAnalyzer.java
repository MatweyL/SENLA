package task_3;

import java.util.*;

public class VowelAnalyzer {

    private static final char[] vowels = {'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'ё'};


    private static boolean isVowel(char symbol) {
        symbol = Character.toLowerCase(symbol);
        for (char vowel: vowels) {
            if (vowel == symbol) {
                return true;
            }
        }
        return false;
    }

    public static int getNumberOfVowels(String word) {
        int numberOfVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }

    public static ArrayList<String> sortSentenceByNumberOfVowels(String sentence) {
        List<String> words = new ArrayList<>(List.of(sentence.split(" ")));
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return getNumberOfVowels(o2) - getNumberOfVowels(o1);
            }
        });
        return new ArrayList<>(words);
    }

    public static void printSortedSentence(ArrayList<String> sortedSentence) {
        for (String word: sortedSentence) {
            System.out.println(word);
        }
    }

    public static String makeFirstVowelUpper(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return word.substring(0, i) + Character.toUpperCase(word.charAt(i)) + word.substring(i + 1);
            }
        }
        return word;
    }
}
