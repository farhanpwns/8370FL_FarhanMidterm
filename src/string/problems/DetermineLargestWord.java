package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="The human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        System.out.println(wordNLength.keySet());

        int max = 0;
        for(int biggestKey: wordNLength.keySet()) {
            max = Math.max(max, biggestKey);
        }

        System.out.println("Longest Word: " + max + " " + wordNLength.get(max));

}

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        String [] words =wordGiven.split(" ");

        for(String s: words){
            map.put(s.length(), s);
        }

        return map;
    }

    public static void longestWord(String str1) {
    }
}
