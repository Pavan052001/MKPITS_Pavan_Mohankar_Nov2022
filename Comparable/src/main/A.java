package main;

public interface A {
   default void display(){
       System.out.println("hello");
   }
}
