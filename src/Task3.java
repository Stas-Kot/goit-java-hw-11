import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    private String[] arr = {"1, 2, 0", "4, 5"};
    //    List<String> arrList = Arrays.asList(arr);

    public String numbers () {
        return Arrays.stream(arr)
                .flatMap((p) -> Arrays.stream(p.split(",")))
                .map(it -> it.trim())
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
    }
}
