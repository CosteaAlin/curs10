package ro.fasttrackit.homework.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Handler;

public class Company {
    private Set<Person> persons = new HashSet<Person>();

    public Person getManager() {
        for (Person p : this.persons) {
            if (p.getPosition().equalsIgnoreCase("manager")) {
                return p;
            }
        }
        return new Person("", 0, "");
    }

    public void employ(Person person) {
        if (person.getAge() >= 18) {
            this.persons.add(person);
        } else {
            throw new IllegalArgumentException("Too young to be hired");
        }
    }

    public List<Person> getPersons(String profession) {
        List<Person> temp = new ArrayList<Person>();
        for (Person p : this.persons) {
            if (p.getPosition().equalsIgnoreCase(profession)) {
                temp.add(p);
            }
        }
        return temp;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> temp = new ArrayList<Person>();
        for (Person p : this.persons) {
            if (p.getAge() > age) {
                temp.add(p);
            }
        }
        return temp;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> temp = new ArrayList<Person>();
        for (Person p : this.persons) {
            if (p.getName().equalsIgnoreCase(filterName)) {
                temp.add(p);
            }
        }
        return temp;
    }
}
