/*
 * This is not my code!!!!
 * Using only for reference
 */
package ch_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class wordFrequency {
    public static void main(String[] args) throws FileNotFoundException {
        // open the file
        Scanner console = new Scanner(System.in);
        System.out.print("What is the name of the text file? ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File(fileName));

        // count occurrences
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        // get cutoff and report frequencies
        System.out.println("Total words = " + wordCounts.size());
        System.out.print("Minimum number of occurrences for printing? ");
        int min = console.nextInt();
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count >= min)
                System.out.println(count + "\t" + word);
        }
    }

}
