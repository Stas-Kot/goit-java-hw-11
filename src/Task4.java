import java.util.stream.Stream;

public class Task4 {
    public Stream<Long> infiniteStream(long a, long c, long m, long sed){
        Stream<Long> stream = Stream.iterate(sed, (x) -> {
            return (a * x + c) % m;
        });
        return stream;
    }

}
