package hw3;

public class Employee {
    private static final int CURRENT_YEAR = 2024;

    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;

    public Employee(String name, String midName, String surName, String position, String phone, int salary, int birth) {
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
        return CURRENT_YEAR - birth;
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

    private void increaseSalary(int amount) {
        this.salary += amount;
    }

    public static void increaser(Employee[] emp) {
        for (Employee employee : emp) {
            if (employee.getAge() > 45)
                employee.increaseSalary(5000);
        }
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
