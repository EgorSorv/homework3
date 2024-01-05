package hw3;

import static hw3.Employee.increaser;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich", "Ovchinnikov",
                "developer", "+7(495)000-11-22", 50000, 1985);
        Employee natalia = new Employee("Natalia", "Pavlovna", "Keks",
                "senior developer", "+7(495)333-44-55", 90000, 1990);
        Employee andrey = new Employee("Andrey", "Viktorovich", "Bezrukov",
                "fitter", "+7(495)111-22-33", 52000, 1973);
        Employee tatiana = new Employee("Tatiana", "Sergeevna", "Krasotkina",
                "accountant", "+7(495)444-55-66", 50000, 1983);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich", "Delfinov",
                "project manager", "+7(495)222-33-44", 40000, 1963);

        Employee[] company = new Employee[5];
        company[0] = ivan;
        company[1] = natalia;
        company[2] = andrey;
        company[3] = tatiana;
        company[4] = evgeniy;

        for (int i = 0; i < company.length; i++) {
            increaser(company);
        }
    }
}
