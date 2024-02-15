package sample;

import newpackage.NewClass;

public class Sample123 {

    private static String hello = "Hello";
    protected float sum = 0.0f;
    int i = 0;

    public Sample123() {
    }
    
    public Sample123(String hello, float sum, int i){
        
    }
    
    public static void main(String[] args) {
       NewClass obj = new NewClass();
       Sample123 obj1 = new Sample123();
       Sample123 obj123 = new Sample123(hello, 0, 0);
        System.out.println(obj.x);
        System.out.println(hello);
    }
    
    private void displayData(){
        
    }
    
    private void displayData(String hello, float sum, int i){
        
    }
    
    public void changeData(){
        System.out.println(hello);
    }
    
}
