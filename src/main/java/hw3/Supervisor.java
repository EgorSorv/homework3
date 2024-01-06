package hw3;

import java.util.Objects;

public class Supervisor extends Employee {
    public Supervisor(String name, String midName, String surName, String position, String phone,
                      int salary, String birth) {
        super(name, midName, surName, position, phone, salary, birth);
    }

    public static void increaser(Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getAge() > 20 && !Objects.equals(employee.position, "supervisor"))
                employee.increaseSalary(5000);
        }
    }
}
