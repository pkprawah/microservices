package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample_createStream_filter_display {

	public static void main(String[] args) {

		List<String> strlist = new ArrayList<String>();

		strlist.add("ank");
		strlist.add("sam");
		strlist.add("az");
		strlist.add("neh");
		strlist.add("ad");
		// Convert list (ArrayList) of String to stream
		Stream<String> stream = strlist.stream();
		// In one line display all records that start with 'a' in stream
		System.out.println("1. Use stream for filtering and display");
		// Filter all record starts with "a" display ank/az/ad
		stream.filter(s -> s.startsWith("a")).forEach(System.out::println);

		strlist.stream().filter(s -> s.startsWith("n")).forEach(s -> System.out.println("filtered value is :: " + s));

		// for each then filer then sys out

		strlist.stream().forEach(s -> {
			if (s.startsWith("a")) {
				System.out.println("For each filter :: " + s);
			}
		});

		// In one line display all records (in sorted manner - ASCENDING) that
		// start with 'a' in stream
		System.out.println("\n4.Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )");

		strlist.stream().filter(s -> s.startsWith("a")).sorted().forEach(s -> System.out.println(s));

		System.out.println("\n5.Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
		// using predicate

		Predicate<String> filterPredicates = s -> s.startsWith("a");

		strlist.stream().filter(filterPredicates).sorted((a, b) -> b.compareTo(a))
				.forEach(s -> System.out.println("descending order ::" + s));

		// In one line display all records (in sorted manner - DESCENDING -  -
		// by using Comparator.reverseOrder()) that start with 'a' in stream
		System.out.println(
				"Use stream for filtering, sorting and display(in sorted manner - DESCENDING order reverseOrder)");

		strlist.stream().filter(filterPredicates).sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println("descending order ::" + s));

		// In one line display all records (in sorted manner) in UPPERCASE that
		// start with 'a' in stream
		System.out.println("\n7.Use stream for filtering, UPPERCASE conevrsion, sorting and display");

		strlist.stream().filter(filterPredicates).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println("uppercase ::" + s));

		// Write a Java 8 program to square the list of numbers and then filter
		// out the numbers greater than 100 and then find the average of the
		// remaining numbers?
		Integer[] arr = new Integer[] { 100, 100, 9, 8, 200 };
		List<Integer> numbers = Arrays.asList(arr);

		OptionalDouble mapToDouble = numbers.stream().mapToDouble(n -> n * n).filter(num -> num > 100).average();

		if (mapToDouble.isPresent()) {
			System.out.println(mapToDouble.getAsDouble());
		}

		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("apple");
		fruitsList.add("orange");
		fruitsList.add("banana");
		fruitsList.add("pear");
		fruitsList.add("mango");
		fruitsList.add("pear");
		fruitsList.add("mango");

		Map<Boolean, Long> partitionedFruitsByLength = fruitsList.stream()
				.collect(Collectors.partitioningBy(s -> s.length() == 4, Collectors.counting()));

		System.out.println("partitionedFruitsByLength :: .." + partitionedFruitsByLength);

		Integer[] arr1 = new Integer[] { 100, 9, 8, 200, 8, 10, 12, 100 };
		List<Integer> numbers1 = Arrays.asList(arr1);

		Map<Boolean, List<Integer>> partitionedOfEvenOddList = numbers1.stream()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));

		System.out.println("partitionedOfEvenOddList :: .." + partitionedOfEvenOddList);

		String name = "Pawan";

		Map<String, Long> charcountMap = name.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

		System.out.println("charcountMapcharcountMap ::: " + charcountMap);

		List<String> fruitsListDuplicate = new ArrayList<>();
		fruitsListDuplicate.add("apple");
		fruitsListDuplicate.add("orange");
		fruitsListDuplicate.add("banana");
		fruitsListDuplicate.add("pear");
		fruitsListDuplicate.add("mango");
		fruitsListDuplicate.add("pear");
		fruitsListDuplicate.add("mango");

		Set<String> fruitset = new HashSet<>();

		fruitsListDuplicate.stream()
				.map(getFunction(fruitsListDuplicate, fruitsListDuplicate.size() != fruitset.size()))
				.collect(Collectors.toSet()).forEach(s -> {
					System.out.println("prints :: :: " + s);
				});
		;

		// OR

		fruitsListDuplicate.stream().map(name1 -> name1 + "(" + Collections.frequency(fruitsListDuplicate, name1) + ")")
				.collect(Collectors.toSet()).forEach(s -> {
					System.out.println("prints :: :: ## " + s);
				});
		;

		String names = "Pawan";

		Map<String, Long> charcountMapa = Arrays.asList(names.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("charcountMapa ::: " + charcountMapa);

	}

	private static Function<String, String> getFunction(List<String> fruitsListDuplicate, boolean b) {

		return b ? name -> name + "(" + Collections.frequency(fruitsListDuplicate, name) + ")" : Function.identity();
	}

}
