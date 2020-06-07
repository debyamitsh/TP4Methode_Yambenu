package com.debyam.exercice125;

class A {
    public void a() {
        System.out.println("a de A");
    }
    public void b() {
        System.out.println("b de A");
    }
}
class B extends A {
    public void b() {
        System.out.println("b de B");
    }
    public void c() {
        System.out.println("c de B");
    }
}
public class Correction2 {
    public static void main(String[] args) {
        A a1=new A();
        A b1=new B();
        B a2=new A(); // NE PASSE PAS A LA COMPILATION
        B b2=new B();
        a1.a();
        b1.a();
        a2.a();
        b2.a();
        a1.b();
        b1.b();
        a2.b();
        b2.b();
        a1.c(); // Ne passe pas a la compilation
        b1.c(); // Ne passe pas a la compilation
        a2.c();
        b2.c();
        ((B)a1).c(); // Cette instruction provoque a l'execution un "CLASS CAST EXCEPTION";
        ((B)b1).c();
        ((B)a2).c();
        ((B)b2).c();
    }
}