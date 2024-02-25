import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {

    public static void main(String[] args) {

       String str= "it was very hot yesterday, but it is cold today";

        //"o/p : it it is was hot but very cold today yesterday"



        String[] arr = str.split(" ");

        arr = Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);


        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

        }
}
