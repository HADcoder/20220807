package com.example.nacos.demo;

public class A {

    static{
        System.out.println("1");
    }

    public A(){
        System.out.println("2");
    }



}


 class B extends A {

    static{
        System.out.println("a");
    }

    public B(){
        System.out.println("b");
    }


}


 class T {

    public static void main(String[] args) {
        A a = new B();
        a = new B();

    }

}