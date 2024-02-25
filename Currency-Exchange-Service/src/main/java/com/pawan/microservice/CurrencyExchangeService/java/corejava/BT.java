package corejava;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class BT {

    public static void main(String[] args) {

Map<String ,Integer> map1 = new HashMap<>();
String str1 = new String("java ops!");
String str2 = new String("java ops");






       // System.out.println(map1.get(str1));
       // System.out.println(map1.get(str2));


        HashMap hmap=new HashMap();
        hmap.put(91,"Hashmap Implementation");
        hmap.put(92,"in ");
        hmap.put(93,"Java");
        hmap.put(null,"InterviewBit");
        //System.out.println(hmap);

       HashMap hmap1=new HashMap();
        hmap1.put(91,"Hashmap Implementation");
        hmap1.put(92,"in ");
        hmap1.put(93,"Java");
        hmap1.put(null,"InterviewBit1");
        hmap1.put(null,"InterviewBit2");
        hmap1.put(null,"InterviewBit3");
        System.out.println(hmap1);


        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer)itr.next();
            System.out.println(i);
            if (i == 7) {
                list.add(15);

            }



        }
        System.out.println(" listlist ::: " + list );

}}

