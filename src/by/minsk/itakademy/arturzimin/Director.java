package by.minsk.itakademy.arturzimin;

public class Director extends Employee {

    public Director(String name, String surname, int salary, String department) {
        super(name, surname, salary, department);
    }
    public Director (){}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Director{");
        sb.append('}');
        return sb.toString();
    }
}
