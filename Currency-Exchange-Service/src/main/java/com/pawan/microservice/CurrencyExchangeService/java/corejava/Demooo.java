package corejava;

import java.util.*;
import java.util.stream.Collectors;

public class Demooo {

    public static void main(String[] args) {

       // {1,[4,5,6,7]}
        //{4,[4,8,9,7]} // out value [4,8,9,7,14,81,19]
       // {9,[4,8,9,17]}
       // {19,[4,8,19,7]}
       // {6,[14,81,19,7]}

      Map<Integer, List<Integer>> maplist =new HashMap<>()  ;



        // {1,[4,5,6,7]}
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(7);


        //{4,[4,8,9,7]}
      List<Integer> list2= new ArrayList<>();
        list2.add(4);
        list2.add(8);
        list2.add(9);
        list2.add(7);



        // {9,[4,8,9,17]}
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(8);
        list3.add(9);
        list3.add(17);

       // {19,[4,8,19,7]}
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(8);
        list4.add(19);
        list4.add(7);

        // {6,[14,81,19,7]}
        List<Integer> list5 = new ArrayList<>();
        list5.add(14);
        list5.add(81);
        list5.add(19);
        list5.add(7);

        maplist.put(1,list1);
        maplist.put(4,list2);
        maplist.put(9,list3);
        maplist.put(19,list4);
        maplist.put(6,list5);


        System.out.println("Input map :: " +maplist );

        getEvenKeyListDetails(maplist);

    }

    public static List<Integer> getEvenKeyListDetails(Map<Integer, List<Integer>> maplist) {

        List<List<Integer>> evenKeyMap=maplist.entrySet().stream().filter(key->key.getKey()%2==0).map(Map.Entry::getValue).collect(Collectors.toList());

        System.out.println("evenKeyMap :: " + evenKeyMap);

        return null;

    }
}
