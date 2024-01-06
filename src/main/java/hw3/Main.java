package hw3;

import static hw3.Supervisor.increaser;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich", "Ovchinnikov",
                "developer", "+7(495)000-11-22", 50000, "1985-04-23");
        Employee natalia = new Employee("Natalia", "Pavlovna", "Keks",
                "senior developer", "+7(495)333-44-55", 90000, "1990-07-07");
        Employee andrey = new Employee("Andrey", "Viktorovich", "Bezrukov",
                "fitter", "+7(495)111-22-33", 52000, "1973-10-14");
        Supervisor vladislav = new Supervisor("Vladislav", "Dmitrievich", "Vilkin",
                "supervisor", "+7(495)555-66-77", 100000, "1970-03-25");
        Employee tatiana = new Employee("Tatiana", "Sergeevna", "Krasotkina",
                "accountant", "+7(495)444-55-66", 50000, "1983-12-05");
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich", "Delfinov",
                "project manager", "+7(495)222-33-44", 40000, "1963-01-01");

        Employee[] company = new Employee[6];
        company[0] = ivan;
        company[1] = natalia;
        company[2] = andrey;
        company[3] = vladislav;
        company[4] = tatiana;
        company[5] = evgeniy;

        for (Employee employee : company) {
            System.out.println(employee.getSalary());
        }

        System.out.println();
        increaser(company);

        for (Employee employee : company) {
            System.out.println(employee.getSalary());
        }
    }
}
