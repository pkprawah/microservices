package corejava;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningDemo {

    public static void main(String[] args) {

        char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's' };


        String result = Stream.of(ch).map(String::new).collect(Collectors.joining());

        System.out.println("result ::" + result);
    }
}
