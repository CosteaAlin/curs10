package ro.fasttrackit.abstractClasses;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DataPrinter printer = new NameDataPrinter();
        printer.printDate();

        new FileDataPrinter().printDate();
    }
}
