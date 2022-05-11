package com.albin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Good morning");
        System.out.println(new App().add(5,5));
    }
  public  int add (int a,int b) {
    	return a+b;
    }
}
