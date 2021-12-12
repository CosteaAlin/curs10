package ro.fasttrackit.homework.ex1;

public class Main {
    public static void main(String[] args) {
        Basket basket= new Basket();
        basket.add("banana");
        basket.add("apple");
        basket.add("banana");
        basket.add("orange");
        System.out.println(basket.customCount());
    }
}
