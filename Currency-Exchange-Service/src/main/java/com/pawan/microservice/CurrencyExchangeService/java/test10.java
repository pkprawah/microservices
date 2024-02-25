import corejava.Emp;

import java.sql.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test10 {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 1, 2, 4,5};
        findDuplicateElements(integers);
    }

    private static void findDuplicateElements(Integer[] integers) {

      /* Set<Integer> duplicateMaps =Arrays.stream(integers)
                .collect(Collectors.toMap(Function.identity(),company->1, Math::addExact))
                .entrySet()
                .stream()
                .filter(company->company.getValue()>1)
                        .collect(Collectors.toSet());

        System.out.println("" + duplicateMaps);


*/

        Map<Integer,Integer> duplicateCountMap=Arrays.stream(integers).collect(Collectors.toMap(Function.identity(),i->1,Math::addExact));
        Map<Integer,Integer> duplicateCountMap1=Arrays.stream(integers).collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(i->1)));


        System.out.println("duplicateCountMap1 :: "   + duplicateCountMap1 );

        List<Integer> dulicateElement =duplicateCountMap1.entrySet().stream()
                .filter(i->i.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        System.out.println("dulicateElement :: " + dulicateElement );


        //Arrays.stream(duplicates).forEach(System.out::println);

Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicate =Arrays.stream(integers)
                .filter(i->!uniqueElements.add(i))
                .collect(Collectors.toList());

        System.out.println("uniqueElements :: " + uniqueElements);
        System.out.println( "duplicate DDDDDDD:::  " + duplicate );



        List<Emp> empList = new ArrayList<>();

        empList.add(new Emp(1,"P1"));
        empList.add(new Emp(2,"P2"));
        empList.add(new Emp(3,"P3"));
        empList.add(new Emp(4,"P4"));
        empList.add(new Emp(5,"P15"));

       HashMap<Integer,String> empmap=  empList.stream().collect(Collectors.toMap(Emp::getId,Emp::getName,(a,b)->a,HashMap::new));

        System.out.println("empmap :: " +empmap );



        Emp e1 = new Emp(1, Arrays.asList("car1", "car2", "car3"));
        Emp e2 = new Emp(2, Arrays.asList("car111", "car222", "car333"));
        Emp e3 = new Emp(3, Arrays.asList("car1111", "car2222", "car3333"));
        Emp e4 = new Emp(5, Arrays.asList("car2", "car3", "car4"));
        List<Emp> myList = Arrays.asList(e1, e2, e3, e4);



    }
}
