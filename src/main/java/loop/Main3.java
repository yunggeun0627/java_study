package loop;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 제거하고 출력
        List<String> words = List.of("apple", "banana", "apple", "grape","banana");


        List<String> newwords = new ArrayList<>();
        for(String word : words) {
            if(newwords.contains(word)) {
                continue;
            }
            newwords.add(word);
        }
        System.out.println(newwords);

    }
}

