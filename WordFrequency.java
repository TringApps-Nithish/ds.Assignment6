package as;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t ----- Frequency Of Word Using HashMap and PriorityQueue -----\n");
        System.out.printf(" Enter No. of Sentences : ");
        int n = sc.nextInt();
        System.out.println();
        sc.nextLine();
        String[] input_text = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf(" Enter Sentence %d : ", i + 1);
            input_text[i] = sc.nextLine();
        }


        HashMap<String, Integer> Counting = new HashMap<>();
        for (String lineOfText : input_text) {
            String[] seperate_words = lineOfText.split("\\s+");
            for (String word : seperate_words) {
                Integer count = Counting.get(word);
                if (count == null) {
                    count = 0;
                }
                Counting.put(word, count + 1);
            }
        }
        PriorityQueue<String> sortedWords = new PriorityQueue<>((a, b) -> Counting.get(b) - Counting.get(a));
        sortedWords.addAll(Counting.keySet());

        for (String word : sortedWords)
            System.out.println(" Word : "+ word  + "  Frequency = "+ Counting.get(word));
    }
}
