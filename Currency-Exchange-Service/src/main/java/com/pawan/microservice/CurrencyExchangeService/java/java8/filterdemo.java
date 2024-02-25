package java8;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filterdemo {

    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        language.filter(languages->languages!=null).collect(Collectors.toList());

        language.filter(Objects::nonNull).collect(Collectors.toList());

        language.count();
    }
}
