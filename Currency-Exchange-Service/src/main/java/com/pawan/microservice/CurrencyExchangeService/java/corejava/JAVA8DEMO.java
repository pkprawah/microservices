package corejava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JAVA8DEMO {

    public static void main(String[] args) {
        List<String> obj = Arrays.asList("ant", "1", "cat", "ant",
                "we", "java", "cat");

        Map<String, Long> mappingResult = obj.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("mappingResult :: "+ mappingResult);


        Set<String> result = obj.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(m->m.getValue()>1)
                        .map(str->str.getKey()).collect(Collectors.toSet());

        System.out.println( "result :: " + result);


        Set<String> items = new HashSet<>();

        Set<String> duplicates  = obj.stream().filter(n->!items.add(n)).collect(Collectors.toSet());
        System.out.println("duplicates :: " + duplicates);


        Map<String, Integer> map = obj.stream().collect(Collectors.toMap(Function.identity(),Value->1,Integer::sum));

        System.out.println("map :: "  + map);


        Map<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(123, "Jessie");
        hMap.put(234, "Alpha");
        hMap.put(345, "Beta");
        hMap.put(456, "Tesla");
        hMap.put(111, "Tera");
        hMap.put(112, "Tera");


        // Filter by map key

        Map<Integer, String> filterByMapKey = hMap.entrySet().stream()
                .filter(str->str.getKey()<=245)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println("filterByMapKey :: " + filterByMapKey );


        // Filter by map Value

        Map<Integer, String> filterByMapValue = hMap.entrySet().stream().filter(str-> "Tera".equalsIgnoreCase(str.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        System.out.println("filterByMapValue ::" + filterByMapValue);

       // Filter Map by both Keys and Values


/*
Java Program to find the largest number from a Set.
 */
        Set<Integer> numbers = Set.of(2, 6, 7, 9, 5, 155, 66, 99);

        //Integer resultMax = numbers.stream().max(Comparator.comparing(i->Integer.valueOf(i))).get();

        Integer resultMax = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("resultMax ::::: " + resultMax);

        List<Integer> numbersList = Arrays.
                asList(2, 6, 7, 9, 5, 55, 4, 99);
        int smallestNumber = numbersList.stream().
                min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Smallest Number= " + smallestNumber);


    }
}
