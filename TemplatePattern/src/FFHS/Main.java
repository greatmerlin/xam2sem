package FFHS;

public class Main {

    public static void main(String[] args) {

        DataProcessor obj1 = new ExcelFile();
        obj1.readProcSave();

        System.out.println();

        DataProcessor obj2 = new TextFile();
        obj2.readProcSave();
    }
}
