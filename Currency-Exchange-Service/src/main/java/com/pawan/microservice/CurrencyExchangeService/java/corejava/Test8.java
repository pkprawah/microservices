package corejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {

        List<Employee1> employee1s = new ArrayList<>();

        employee1s.add(new Employee1(10,"pawan1"));
        employee1s.add(new Employee1(20,"pawan2"));
        employee1s.add(new Employee1(10,"pawan3"));
        employee1s.add(new Employee1(47,"pawan4"));
        employee1s.add(new Employee1(48,"pawan5"));


      List<Employee1> emplist = employee1s.stream()
                .sorted(Comparator.comparing(Employee1::getName).thenComparing(Employee1::getAge))
                .collect(Collectors.toList());




    }




}

class Employee1{


    private Integer age;
    private String name;

    public Employee1(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
