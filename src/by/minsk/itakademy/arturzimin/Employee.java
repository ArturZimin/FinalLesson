package by.minsk.itakademy.arturzimin;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }
    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSurname(), employee.getSurname()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getSalary(), getDepartment());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
