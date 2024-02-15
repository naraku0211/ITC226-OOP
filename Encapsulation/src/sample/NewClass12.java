package sample;

import java.util.Scanner;

public class NewClass12 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        NewClass1234 obj1 = new NewClass1234(3,4,5);
        //int newLength = input.nextInt();
        obj1.setLength(input.nextInt());
        System.out.println("Length: " + obj1.getLength());
    }
}
