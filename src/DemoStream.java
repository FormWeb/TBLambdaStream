import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        String[] names = new String[] {"Jean", "Jacques", "Jules", "Antoine"};

        Stream<String> myStream = Arrays.stream(names)
                .filter(e -> e.charAt(0) == 'J')
                .map(e -> "Bonjour " + e);

        String jean = Arrays.stream(names)
                .filter(e -> e.equals("Jean"))
                .findAny()
                .orElse(null);

        List<String> myListOfMessage = myStream.toList();

        myListOfMessage = myListOfMessage.stream()
                .map(DemoStream::myMapFunction)
                .toList();

        myListOfMessage.forEach(System.out::println);
    }

    public static String myMapFunction(String name) {
        return name + "!";
    }
}
