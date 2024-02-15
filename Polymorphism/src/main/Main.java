package main;


public class Main {


    public static void main(String[] args) {
        Enriquez e1 = new Enriquez();
        e1.setName("Cutie Enriquez");
        e1.eat();
        //e1.sleep(8);
        e1.sleep("standing", 8);
      
        Person p1 = new Person();
        p1.setName("Lord Jesus");
        p1.eat();
        p1.sleep(8);
    }
    
}
