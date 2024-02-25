package corejava;

import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpTest {




    public static void main(String[] args) {

        List<EmpDemo> emplists = new ArrayList<>();

        EmpDemo e1= new EmpDemo();
        e1.setId(1);
        e1.setName("pawan");

        EmpDemo e2= new EmpDemo();
        e2.setId(2);
        e2.setName("pawan");

        EmpDemo e3= new EmpDemo();
        e3.setId(2);
        e3.setName("pawan");

        EmpDemo e4= new EmpDemo();
        e4.setId(3);
        e4.setName("pawan");

        emplists.add(e1);
        emplists.add(e2);
        emplists.add(e3);
        emplists.add(e4);



        Map<Integer,Long> map = emplists.stream().sorted(Comparator.comparingInt(EmpDemo::getId)
                .thenComparing(EmpDemo::getName))
                .collect(Collectors.groupingBy(EmpDemo::getId,Collectors.counting()));


        System.out.println(map);

    }



}
