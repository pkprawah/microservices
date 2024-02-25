import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingStirng {

    public static void main(String[] args) {
        String name = "Pawan";

        //String sortedNames =name.chars().sorted().collect(StringBuilder::new
       // ,StringBuilder::appendCodePoint,StringBuilder::append).toString();

       String sortedNames= Stream.of(name.toLowerCase().split("")).sorted().collect(Collectors.joining());

        System.out.println("Sorted names  :: " + sortedNames);



        // 1. creating HashMap object of type <String, Integer>
        Map<String, Integer> countryPopulation = new HashMap<>();


        // 1.1 adding key-value pairs to HashMap object
        countryPopulation.put("Indian", 382357386);
        countryPopulation.put("America", 332429717);
        countryPopulation.put("Russia", 146748590);
        countryPopulation.put("Brazil", 213728559);
        countryPopulation.put("Pakistan", 220892331);


        // 1.2 print - before sorting - random order
        System.out.println("Before Sorting - Random order :- \n");

        Map<String,Integer> sortedInAcsending = countryPopulation
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                        (e1,e2)->e1, LinkedHashMap::new));


        Map<String,Integer> sortedInAcsendingq = countryPopulation
                .entrySet()
                .stream()
                .sorted((map1,map2)-> map1.getKey().compareTo(map2.getKey()))
                .collect(Collectors.toConcurrentMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,(e1,e2)->e1
                       ));



        //sortedInAcsending.forEach((key,value) -> System.out.println("Keys: " + key + " ,  Value: " + value));

        sortedInAcsendingq.forEach((key,value) -> System.out.println("Keys: " + key + " ,  Value: " + value));
    }
}
