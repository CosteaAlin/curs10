package ro.fasttrackit.homework.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {
    private List<String> fruits = new ArrayList<>();

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        if (this.find(fruit)) {
            fruits.remove(fruit);
            return true;
        } else {
            return false;
        }
    }

    public int position(String fruit) {
        if (this.find(fruit)) {
            return fruits.indexOf(fruit);
        } else {
            return -1;
        }
    }

    public Collection<String> distinct() {
        return fruits.stream().distinct().toList();
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int counter = 0;
        for (String fruit : this.fruits) {
            counter++;
        }
        return counter;
    }
}
