package corejava;

import java.util.List;

public class Dept {

    int Id;
    String name;
    List<Emp> emps;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", emps=" + emps +
                '}';
    }
}
