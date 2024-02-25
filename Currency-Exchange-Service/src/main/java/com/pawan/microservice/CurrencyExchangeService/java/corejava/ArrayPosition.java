package corejava;

import java.io.File;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class ArrayPosition {
    public static void main(String[] args) {
        /*List<Integer> values = List.of(5, 3, 4, 7, 6, 2, 9, 6);
        int item = 6;

       IntStream.range(0, values.size()).forEach(i->{
            if(i==3){
                final String result =String.valueOf(values.get(i)) + "0";}
          // System.out.println("result ::" + result);
       });*/



       TreeSet<Integer> treeSet  = new TreeSet<>();
       treeSet.add(1);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(9);

        System.out.println("treeSet "+ treeSet);



        File fileInput = new File("D:\\");

       File[] files = fileInput.listFiles();

        for (File file : files) {

            if(file.isFile())
                file.delete();
            //else
                //Deletefile(file);
        }


    }




}
