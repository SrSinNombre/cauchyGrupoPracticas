package es.uah.matcomp.mp.e1;

public class Mammal extends Animal {
    public Mammal(String name){
        super(name);
    }
    public String toString(){
        return "Mammal" + getName();
    }
}
