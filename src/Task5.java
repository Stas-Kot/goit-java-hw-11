import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();
//        List<T> streamAList = first.collect(Collectors.toList());
//        List<T> streamBList = second.collect(Collectors.toList());
//
//        int minSize = Math.min(streamAList.size(), streamBList.size());
//
//        for (int i = 0; i < minSize; i++) {
//            resultList.add(streamAList.get(i));
//            resultList.add(streamBList.get(minSize - 1 - i));
//        }

        Iterator<T> IteratorA = first.iterator();
        Iterator<T> IteratorB = second.iterator();

        while (IteratorA.hasNext() && IteratorB.hasNext()) {
            resultList.add(IteratorA.next());
            resultList.add(IteratorB.next());
        }
        Collections.shuffle(resultList);
        System.out.println("Task5 = " + resultList.toString());

        return resultList.stream();
    }
}
