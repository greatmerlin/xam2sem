package FFHS;

public abstract class Animal {

    private int legs = 4;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
        System.out.println("animal here");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("name= " + name + ", " + "\nage= " + age ); // no need to be getters, Parent class power
    }

    public double getWeight(){
        return 10;
    }

    abstract void eat();

}
