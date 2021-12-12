package ro.fasttrackit.homework.ex2;

public class Main {
    public static void main(String[] args) {
        Boquet boquet= new Boquet();
        boquet.add("Lily");
        boquet.add("Rose");
        boquet.add("Tulip");
        System.out.println(boquet.remove("Tulip"));
    }
}
