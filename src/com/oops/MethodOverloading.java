package com.oops;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("hello");
        Parent parent = new Parent();
        Child child = new Child();
        parent.run();
        child.run();
        Parent parent1 = new Child();
        parent1.run();

    }
}

class Parent{
    public void run(){
        System.out.println("I am in parent class Run method");
    }
    public void B(){
        System.out.println("I am in parent class B method");
    }
}
class Child extends Parent{
    public void run(){
        System.out.println("I am in child class run method");
    }

}
