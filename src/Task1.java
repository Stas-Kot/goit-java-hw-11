import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
//    private final List<String> nameList = Arrays.asList("Oleg", "Stas", "Ivan", "Petro", "Igor", "Vladimir");
//    public String namesString() {
//        List<String> newList = nameList.stream()
//                .map(it -> nameList.indexOf(it) + ". " + it)
//                .filter(it -> isOdd(it))
//                .collect(Collectors.toList());
//        return newList.toString().substring(1, newList.toString().length() - 1) + ".";
//    }
//
//    private static boolean isOdd(String number) {
//        String[] parts = number.split(". ");
//        String num = parts[0];
//        return Integer.parseInt(num) % 2 != 0;
//    }

    public String namesString(List<String> list, NamesFilter namesFilter) {
        return namesFilter.filtredNames(list);
    }
}
