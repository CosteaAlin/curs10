package ro.fasttrackit.abstractClasses;

public class FileDataPrinter extends DataPrinter {
    @Override
    public String[] getDateFromSource() {
        return new String[]{
                "line1",
                "line2",
                "line3",
                "line4",
                "line5"
        };
    }
}
