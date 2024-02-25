package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStirngWords {
    public static void main(String[] args) {
        String input1= "This is a first sentence";
        //String output "a first is sentence This"
        List<String> result=sortStringWords(input1);
        System.out.println("result :: " + result);
    }

    private static List<String> sortStringWords(String input1) {

        String[] str= input1.split(" ") ;
        List<String> list= Arrays.stream(str)
                .sorted((str1, str2) -> str1.toLowerCase().compareTo(str2.toLowerCase()))
                .collect(Collectors.toList());
        return list;
    }
}
