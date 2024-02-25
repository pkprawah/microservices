package corejava;

import java.util.*;

public class CompareArrayListCustomStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pawan");
        student.setAddress("houseNo2");
        Student student1 = new Student();
        student1.setName("Pawan");
        student1.setAddress("houseNo2");

        Student student2 = new Student();
        student2.setName("Pawan123");
        student2.setAddress("houseNo123");

        Student student3 = new Student();
        student3.setName("Pawan123");
        student3.setAddress("houseNo123");

        int count=0;
        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(student);
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        List<Student> duplicates = new ArrayList<>();
        Set<Student> set = new HashSet<>();
        for (Student i : studentlist) {
            if (set.contains(i)) {
                duplicates.add(i);
                count++;
            } else {
                set.add(i);
            }
        }
        System.out.println("duplicates :: "+duplicates);
        System.out.println("duplicates Object count is list is  :: "+count);


        //Using a Map and Storing the Frequency of Elements

        List<Student> duplicates1 = new ArrayList<>();
        Map<Student, Integer> frequencyMap = new HashMap<>();
        for (Student number : studentlist) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        for (Student number : frequencyMap.keySet()) {
            if (frequencyMap.get(number) != 1) {
                duplicates1.add(number);
            }
        }

        System.out.println("duplicates1 :: "+duplicates1);
    }
}
