package lesson_26;

import java.util.HashMap;
import java.util.Map;

public class WordCountDemo {
    public static void main(String[] args) {
        String line = "Рюкзак Ручка Карандаш Ручка Рюкзак Ластик";
        Map<String, Integer> wordToCount = getWordToCount(line);
        print(wordToCount);
    }

    private static Map<String, Integer> getWordToCount(String line) {
        String[] words = line.split(" ");
        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            int count = wordToCount.getOrDefault(word,0);
            //Integer count = wordToCount.get(word);
           // if (count == null) {
              //  count = 0;
           // }
            wordToCount.put(word, count + 1);

        }
        return wordToCount;
    }

    private static void print( Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
