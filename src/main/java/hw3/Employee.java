package hw3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Employee {
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final String CURRENT_YEAR = date.format(new Date());;

    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    String birth;

    public Employee(String name, String midName, String surName, String position, String phone,
                    int salary, String birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        LocalDate start = LocalDate.parse(birth, formatter);
        LocalDate end = LocalDate.parse(CURRENT_YEAR, formatter);
        Duration duration = Duration.ofDays(DAYS.between(start, end));
        long age = ChronoUnit.YEARS.between(LocalDateTime.now(),
                LocalDateTime.now().plus(duration));
        return (int) age;
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}');
    }

    void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static float averageSalary(Employee[] emp) {
        float resualt = 0;

        for (Employee employee : emp)
            resualt += employee.getSalary();

        return resualt / emp.length;
    }

    public static float averageAge(Employee[] emp) {
        float resualt = 0;

        for (Employee employee : emp)
            resualt += employee.getAge();

        return resualt / emp.length;
    }
}
