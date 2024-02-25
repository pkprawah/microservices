package corejava;

import java.util.*;

public class DepartmentEmployeeTest {
    public static void main(String[] args) {


        EmployeeTest e1 = new EmployeeTest(1,"A",101,5000);
        EmployeeTest e2 = new EmployeeTest(2,"B",102,6000);
        EmployeeTest e3 = new EmployeeTest(3,"C",101,7000);
        EmployeeTest e4 = new EmployeeTest(4,"D",103,9000);
        EmployeeTest e5 = new EmployeeTest(5,"E",101,2000);


        List<EmployeeTest> employeeList = new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        int age =28;
        System.out.println((age>18)?"a": "b");


        Map<Integer,Integer> employeecount = new HashMap<>();

        for (EmployeeTest emp:employeeList) {

            if(employeecount.containsKey(emp.dept_Id)){
                int count = employeecount.get(emp.dept_Id);

                employeecount.put(emp.dept_Id,count+1);
            }else{
                int count =1;
                employeecount.put(emp.dept_Id,count);
            }


        }


        System.out.println("Department employee count :: " +employeecount );

    }

}

class EmployeeTest{
    //id, emp_name, dept_id ,salary

    Integer id;
    String empName;
    Integer dept_Id;

    Integer salary;

    public EmployeeTest(Integer id, String empName, Integer dept_Id, Integer salary) {
        this.id = id;
        this.empName = empName;
        this.dept_Id = dept_Id;
        this.salary = salary;
    }
}

class Department{

    int dept_Id;
    String name;
    String active;




}
