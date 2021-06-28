package com.example;
public class App 
{
    public int multiply ( int x, int y){
        return x*y; //simply returned the multiplication of two numbers
    }
    public int divide ( int x, int y){
        return x/y; //simply returned the multiplication of two numbers
    }
    public int add ( int x, int y){
        return x+y; //simply returned the multiplication of two numbers
    }
    public int subtract ( int x, int y){
        return x-y; //simply returned the multiplication of two numbers
    }


    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        App addobject = new App();
        int a=10 , b=5;

        int product = addobject.multiply(a, b);   //calling the multiply method with two arguments
        int division = addobject.divide(a, b);
        int addition = addobject.add(a, b);
        int subtraction = addobject.subtract(a, b);

        System.out.println("The product of 10 and 5 is:"+product);
        System.out.println("The division of 10 and 5 is:"+division);
        System.out.println("The addition of 10 and 5 is:"+addition);
        System.out.println("The subtraction of 10 and 5 is:"+subtraction);
 
    }
}
