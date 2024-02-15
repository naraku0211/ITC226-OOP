package main;

public class Enriquez extends Person{

    public Enriquez() {
    }

    public Enriquez(String name, String address, String gender, int age, String civilStatus, String religion, String bloodType) {
        super(name, address, gender, age, civilStatus, religion, bloodType);
    }
    
    @Override
    public void eat(){
        System.out.println(Enriquez.super.getName() + " is eating.");
        System.out.println(Enriquez.super.getName() + " is full.");
    }
    
    public void sleep(String sleepType, int hours){
        System.out.println(Enriquez.super.getName() + " is sleeping " + sleepType + " position in " + hours + " hours.");
    }
}
