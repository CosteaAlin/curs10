package ro.fasttrackit.homework.ex3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alin", 22, "Plumber");
        Person p2 = new Person("Bogdan", 37, "Manager");
        Person p3 = new Person("David", 28, "Welder");
        Person p4 = new Person("Adrian", 55, "Carpenter");

        Company company = new Company();
        company.employ(p1);
        company.employ(p2);
        company.employ(p3);
        company.employ(p4);

        System.out.println(company.getPersons("welder"));
        System.out.println(company.getPersonsOlder(30));
        System.out.println(company.getPerson("alin"));
    }
}
