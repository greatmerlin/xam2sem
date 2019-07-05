package FFHS;

public abstract class DataProcessor {

    public void readProcSave(){
        read();
        process();
        save();
    }

    public void save(){
        System.out.println("saving...");
    }

    public abstract void read();

    public abstract void process();


}
