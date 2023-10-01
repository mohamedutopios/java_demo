package org.example.poo.package2;

import org.example.poo.package1.ClasseC;

public class Demo {

    public static void main(){

        ClasseB classeB = new ClasseB();
        ClasseC classeC = new ClasseC();

        classeC.doSomethingB2();
        classeC.doSomethingB();

        classeB.doSomethingB();
        classeB.doSomethingB2();
        classeB.doSomethingB3();



    }



}
