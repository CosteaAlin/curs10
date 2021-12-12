package ro.fasttrackit.homework.ex2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Boquet {
    private Set<String> flowers = new HashSet<String>();

    public Collection<String> getAll() {
        return this.flowers;
    }

    public void add(String flower) {
        this.flowers.add(flower);
    }

    public String remove(String flower) {
        if (this.flowers.contains(flower)) {
            this.flowers.remove(flower);
            return String.format("%s was removed.", flower);
        } else {
            return String.format("%s was not found in the list.", flower);
        }
    }
}
