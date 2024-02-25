import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
//        I/P : employee object list
//        O/P: print the name of 3rd highest salaried senior(by age) employee
//
//        employee object-  name ,salary,age,id
        List<Employee> emplist = new ArrayList<>();
       emplist.add(new Employee(101, "vinod", 25, 10000));
       emplist.add(new Employee(107, "kumar", 35, 20000));
       emplist.add(new Employee(103, "ravi", 15, 5000));
      emplist.add(new Employee(100, "charan", 35, 10000));
       emplist.add(new Employee(100, "rama", 45, 10000));
       emplist.add(new Employee(110, "navi", 5, 30000));
       emplist.add(new Employee(110, "abc", 10, 30000));
       emplist.add(new Employee(110, "dummy", 16, 30000));
       emplist.add(new Employee(110, "dummy1", 20, 30000));
        emplist.add(new Employee(110, "dummy1123", 7890, 990000));
       emplist.add(new Employee(110, "rama1", 55, 10000));
        emplist.add(new Employee(110, "rama12", 85, 10000));
       emplist.add(new Employee(110, "random", 30, 6000));


   List<Employee> sortedEmployee = emplist.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary)
                        .thenComparing(Employee::getAge).reversed()).collect(Collectors.toList());


//        Map<Employee,List<Employee>> employeeMap12 =
//                emplist.stream()
//                        .collect(Collectors.groupingBy(Employee::getSalary,LinkedHashMap::new,Collectors.toList()))
//                        .values().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,LinkedHashMap::new));



        Map<Employee, List<Employee>> result = emplist.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee::getSalary, LinkedHashMap::new, Collectors.toList()))
               .values().stream()
               .collect(Collectors.toMap(employees -> employees.get(0),Function.identity()));

        System.out.println("employeeMap12  ####### "+ result);

       Map<Integer,List<Employee>> employeeMap =
        emplist.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                        .sorted((map1,map2)->map2.getKey().compareTo(map1.getKey())).limit(3).skip(2)
                .collect(
                Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (es1, es2) -> es1, LinkedHashMap::new
                )
        );


        String employeeMaptestList =
                emplist.stream()
                        .collect(Collectors.groupingBy(Employee::getSalary, HashMap::new, Collectors.toList()))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).limit(1)
                        .collect(
                                Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (es1, es2) -> es1, LinkedHashMap::new
                                )
                        ).values().stream().flatMap(list->list.stream()).collect(Collectors.toList())
                        .stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getAge).reversed()).findFirst().get()
                        .getName();

        System.out.println("Thired highest salary with aged person :: "+employeeMaptestList);

    List<Employee> thirdHightstSalaryemplist = employeeMap.values().stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        List<Employee> thirdHightstSalaryemplistsorted  =   thirdHightstSalaryemplist.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed().thenComparing(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println("employeeMap  ::  : : " + employeeMap);
       String name =  thirdHightstSalaryemplistsorted.stream().findFirst().get().getName();
       // System.out.println("###########**********8" + thirdHightstSalaryemplistsorted);

       // System.out.println("namenamenamenamename" + name);




//        Map<Integer,List<Employee>> employeeMapdirect =
//                emplist.stream()
//                        .collect(Collectors.groupingBy(Employee::getSalary, HashMap::new, Collectors.toList()))
//                        .entrySet()
//                        .stream()
//                        .sorted((map1,map2)->map2.getKey().compareTo(map1.getKey())).limit(3).skip(2).





        //Employee last = emplist.stream().reduce((one, two) -> two).get();




    }






}


class Employee{
    private  Integer id;
    private String name;
    private  Integer age;
    private Integer salary;

    public Employee(Integer id, String name, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
