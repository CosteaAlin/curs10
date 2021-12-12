package ro.fasttrackit.abstractClasses;

public abstract class DataPrinter {
    public void printDate(){
        String[] data = getDateFromSource();
        for(String line : data){
            System.out.println("----" + line);
        }
    }

    public abstract String[] getDateFromSource();
}
