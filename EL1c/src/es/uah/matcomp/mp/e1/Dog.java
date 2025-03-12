package es.uah.matcomp.mp.e1;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Wooof");
    }
    public String toString(){
        return getName();
    }
}
