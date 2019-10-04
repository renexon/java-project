package oop;

public class Calculator {
    //polymorphism
    public int addition (int a, int b){
        return a+b;
    }
    public int addition(int a, int b, int c){
        return a + b +c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = calculator.addition(10,20);
        int y = calculator.addition(10, 20, 11);
        System.out.println(x);
        System.out.println(y);
    }
}
