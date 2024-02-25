import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        // 1. create HashMap object
      /*  Map<String, Double> playerPercentile = new HashMap<>();


        // 1.1 add map entries
        playerPercentile.put("Morgan", 99.67);
        playerPercentile.put("Stewart", 90.98);
        playerPercentile.put("Mike", 93.65);
        playerPercentile.put("Cook", 91.67);
        playerPercentile.put("Stokes", 92.35);
        playerPercentile.put("Broad", 99.67);
        playerPercentile.put("Pietersen", 92.35);
        playerPercentile.put("Hussain", 94.89);
        playerPercentile.put("Collingwood", 92.35);
        playerPercentile.put("Flintoff", 93.65);
        playerPercentile.put("Strauss", 91.67);
        playerPercentile.put("Butler", 99.67);


         // 2. Player's percentile and its duplicate count
        Map<Double,Long> duplicateCountMap1 = playerPercentile
                .values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
*/
        // test array[] with duplicates
        int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};


        // 1. convert array[] to Map of integers and their count
        Map<Integer, Long> duplicateCountMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("1. Duplicate Count Map = " + duplicateCountMap);


        // 2. sort map first by decreasing-order of duplicate-count (VALUE)
        // and then by decreasing-order of duplicate number (KEY)
        LinkedHashMap<Integer, Long> duplicateCountSortedMap = duplicateCountMap
                .entrySet()
                .stream()
                .sorted(
                        Map.Entry.<Integer, Long>comparingByValue().reversed()
                                .thenComparing(Map.Entry.<Integer, Long>comparingByKey().reversed())
                )
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new)
                );
        System.out.println("2. Duplicate Count Sorted Map = " + duplicateCountSortedMap);

    }
}
