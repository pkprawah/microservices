package corejava;

import java.util.List;

public class Emp {

    int id;
    String name;

    private List<String> cars;

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Emp(int id, List<String> cars) {
        this.id = id;
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
