package by.minsk.itakademy.arturzimin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Manager extends Employee {
    private List<Employee> list=new ArrayList<>();

    public Manager(String name, String surname, int salary, String department, List<Employee> list) {
        super(name, surname, salary, department);
        this.list = list;
    }
    public Manager(){}

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(getList(), manager.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getList());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
