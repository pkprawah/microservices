//package corejava;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class EmpDept {
//
//    public static void main(String[] args) {
//        List<Dept> deptList= new ArrayList<>();
//
//        List<Emp> empList1 = new ArrayList<>();
//        List<Emp> empList2 = new ArrayList<>();
//        List<Emp> empList3 = new ArrayList<>();
//
//        Emp emp = new Emp();
//
//        emp.setId(1);
//        emp.setName("Pawan");
//
//        Emp emp1 = new Emp();
//
//        emp1.setId(1);
//        emp1.setName("ankit");
//
//        Emp emp2 = new Emp();
//
//        emp2.setId(1);
//        emp2.setName("sushil");
//
//        empList1.add(emp);
//        empList2.add(emp1);
//        empList3.add(emp2);
//
//        Dept d = new Dept();
//        d.setName("HR");
//        d.setId(1);
//        d.setEmps(empList1);
//
//        Dept d1 = new Dept();
//        d1.setName("Vertical");
//        d1.setId(2);
//        d1.setEmps(empList2);
//
//        Dept d2 = new Dept();
//        d2.setName("Software");
//        d2.setId(3);
//        d2.setEmps(empList3);
//
//        deptList.add(d);
//        deptList.add(d);
//        deptList.add(d);
//
//
//
//        Map<String, Long> empCountByDepart = deptList
//                .stream()
//                .collect(Collectors.groupingBy(e -> e.getName(),Collectors.counting()));
//
//
//        System.out.println("empCountByDepart :: "+ empCountByDepart);
//    }
//}
