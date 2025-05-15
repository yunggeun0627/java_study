package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어의 시작이 A또는 a로 시작하는 단어를 newWords 리스트에 담아 출력
        List<String> words = List.of("Apple", "banana", "avocado", "carrot");
        List<String> newwords = new ArrayList<>();
        List<String> newwords2 = new ArrayList<>();
        List<String> newwords3 = new ArrayList<>();


        for(String word : words) {
            if(word.startsWith("A") || word.startsWith("a")) {
                newwords.add(word);
            }
        }

        for(String word : words) {
            char c = word.charAt(0);
            if (c == 'A' || c == 'a') {
                newwords2.add(word);
            }
        }

        for(String word : words) {
            String firstStr = word.substring(0, 1);
            if (firstStr.equalsIgnoreCase("a")) {
                newwords3.add(word);
            }
        }

        System.out.println(newwords);
        System.out.println(newwords2);
        System.out.println(newwords3);

    }
}

