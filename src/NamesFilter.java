import java.util.List;

@FunctionalInterface
public interface NamesFilter {
    String filtredNames(List<String> list);
}
