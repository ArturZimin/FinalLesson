package by.minsk.itakademy.arturzimin;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        List<Employee> listEmployee = new ArrayList<>();
        List<Employee> listEmployee1 = new ArrayList<>();
        Employee employee = new Employee("Andrey", "Mraun", 470, "trade");
        Employee employee1 = new Employee("Dmitriy", "Limidow", 490, "deliveri");
        Employee employee2 = new Employee("Aleksandr", "Amirnow", 470, "trade");
        Employee employee3 = new Employee("Andrey", "Bhishow", 480, "trade");
        Employee employee4 = new Employee("Aleksey", "Cvanow", 490, "delivery");
        Manager manager = new Manager("Alesia", "Rudko", 530, "trade", listEmployee);
        Manager manager1 = new Manager("Alesia", "Rudko", 520, "deliveri", listEmployee1);
        listEmployee.add(employee);
        listEmployee.add(employee1);
        listEmployee1.add(employee2);
        listEmployee1.add(employee3);
        listEmployee1.add(employee4);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(manager);
        list.add(manager1);

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("________________________sorted getSurname:");

        Collections.sort(list, Comparator.comparing(e -> e.getSurname()));


        for (Object y : list) {
            System.out.println(y);
        }
        System.out.println("_________________________sorted getSalary:");
        list.sort(Comparator.comparing(Employee::getSalary));

        for (Object a : list) {
            System.out.println(a);
        }

//        System.out.println("_________________________average getDepartment:");
//        list.stream()
//
//                .map(i -> i.getDepartment() + " - " + i.getSalary())
//                .forEach(System.out::println);
//
//
//    }
//        String department1="";
//        String department="";
//        int summa = 0;
//        int count = 0;
//        int average=0;
//        for (int i = 0; i < list.size(); i++) {
//            Employee sum = list.get(i);
//            if (sum.getSalary() > 0) {
//                summa = summa + sum.getSalary();
//                count++;
//            }
//            if (sum.getSalary()>0) {
//                 department =  sum.getDepartment();
//                System.out.println(department);
//            }
//            if (i == list.size() - 1) {
//                 average = summa / count;
//                System.out.println(" - "+average);
//            }
//        }


    }
}
