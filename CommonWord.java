import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CommonWord {
    public static void main(String[] args) {
        String[] words = {"rer", "", "forest", "river", "guitar", "river", "sky", "boat", "forest", "fire"};
        System.out.println(" Самое часто встречающееся слово: " + Arrays.stream(words)
                .collect(groupingBy(Function.identity(), counting()))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(null));
     }
}
