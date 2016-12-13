package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Integer add(Integer a, Integer b) {
      if (a > 10) {
        System.out.println("a is greater than 10");
      } else {
        System.out.println("a is less than 10");
      }
      return a + b;
    }
}
