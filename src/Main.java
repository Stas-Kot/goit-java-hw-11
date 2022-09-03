import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Oleg", "Stas", "Ivan", "Petro", "Igor", "Vladimir");


//        Task 1

        Task1 task1 = new Task1();
//        String names = task1.namesString();

        String names = task1.namesString(nameList, list -> {
            String res = "";
            for (int i = 1; i < list.size(); i += 2) {
                res += i + "." + list.get(i) + ", ";
            }
            return res.substring(0, res.length() - 2) + ".";
        });


        System.out.println(names);


//        Task 2

        Task2 task2 = new Task2();
        System.out.println(task2.sortList(nameList));


//        Task 3
        Task3 task3 = new Task3();
        System.out.println(task3.numbers());


//        Task 4

        Task4 task4 = new Task4();

        task4.infiniteStream(25214903917L, 11L, (long) Math.pow(2, 48), 0 )
                .limit(10)
                .forEach(System.out::println);

//       Task 5


        Stream<String> StreamA = Stream.of("Viktor", "Ivan", "Petro", "Oleg", "Taras", "Igor");
        Stream<String> StreamB = Stream.of("1", "2", "3", "4", "5");

        Task5 task5 = new Task5();
        task5.zip(StreamA, StreamB);


    }
}
