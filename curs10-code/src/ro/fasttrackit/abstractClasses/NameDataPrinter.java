package ro.fasttrackit.abstractClasses;

public class NameDataPrinter extends DataPrinter {

    @Override
    public String[] getDateFromSource() {
        return new String[]{
                "Ana",
                "Bogdan",
                "Laura",
                "Mircea",
                "Dragos"
        };
    }
}
