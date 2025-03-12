package es.uah.matcomp.mp.e1;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String toString(){
        return "Animal " + name;
    }
    public String getName() {
        return name;
    }
}
