



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;



public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;


        Set<String> wordSet = new HashSet<>();
        for (String line : fantasyFormatData) {
            String[] words = line.split("\\s+");
            Collections.addAll(wordSet, words);
        }


        System.out.println("Set of different words:");
        System.out.println(wordSet);

        try {

            PrintWriter writer = new PrintWriter(new FileWriter("task4.txt"));
            writer.println("Set of different words:");
            writer.println(wordSet);


            Map<Integer, Integer> wordLengthMap = new HashMap<>();
            for (String word : wordSet) {
                int length = word.length();
                wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
            }


            System.out.println("\nMap of word lengths:");
            System.out.println(wordLengthMap);

            writer.println("\nMap of word lengths:");
            writer.println(wordLengthMap);

            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
