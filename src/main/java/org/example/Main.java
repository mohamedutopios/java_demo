package org.example;

import org.example.collections.liste.IteratorDemo;
import org.example.collections.liste.LinkedListDemo;
import org.example.collections.liste.ListDemo;
import org.example.collections.liste.entity.RandomPerson;
import org.example.collections.liste.enums.Order;
import org.example.collections.map.MapDemo;
import org.example.collections.set.SetDemo;
import org.example.designPattern.decorateur.DecoratorPatternTest;
import org.example.designPattern.observer.ObserverDemo;
import org.example.exceptions.DemoThrows;
import org.example.exceptions.SimpleExemple;
import org.example.exceptions.exceptionImbrique.DemoExceptionImbrique;
import org.example.exceptions.exceptionPerso.CheckMyAge;
import org.example.exercices.pattern.bridge.Voiture;
import org.example.files.DemoFile;
import org.example.files.DemoFile2;
import org.example.files.banque.ExoBancaire;
import org.example.files.fileInputStream.FileInputStreamd;
import org.example.method.MethodParam;
import org.example.operator.Operator;
import org.example.poo.Phone;
import org.example.poo.Product;
import org.example.poo.datastructure.*;
import org.example.poo.inner.OuterClass;
import org.example.exercicesPOO.*;
import org.example.readFromConsole.ReadFromConsole;
import org.example.streams.Demo1;
import org.example.streams.Demo2;
import org.example.string.ChaineCaractere;
import org.example.string.ChaineCaractere1;
import org.example.variable.Variable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {


       // Variable.getVariable();
        //Operator.getOperationAndComparaisonType();
       // Operator.getExpressionType();
        //Operator.getOperationAndComparaisonType();
        Product p = new Product();
        Product p2 = new Product(1, "Pantalon");
        p.setName("Jupe");
        System.out.println(p.getName());
        System.out.println(p2.getName());

        Phone phone = new Phone(12);
        phone.setPrix(13);
        phone.setName("Iphone");
        phone.setId(3);
        System.out.println(phone.toString());
        Phone phone1 = new Phone(1, "Nokia",45);
        System.out.println(phone1.toString());

       Product.getBonjour();


        phone.whatIAme();
        p.whatIAm();


        // Demo.main();

        //Engine engine = new Engine();

        // MotorCycle motorCycle = new MotorCycle();

        //System.out.println(motorCycle);

        // ElectricCar electricCar = new ElectricCar();

        // electricCar.setCouleur("bleu");
        // electricCar.setNbreRoue(4);

        //  System.out.println(electricCar);

        // VehicleService.test();

       


        /*OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass inner = outerClass.new InnerClass();

        inner.afficheMessage2();

        OuterClass.AutreClassInner autreClassInner = new OuterClass.AutreClassInner();

        autreClassInner.afficheMessage();*/


        //ListDemo.main();


        /*List<RandomPerson> personList = new ArrayList<>();

        RandomPerson.addData(5, personList);


        ListDemo.trieOrderRandomPerson(Order.CITY, personList);

        RandomPerson.affichePerson(personList);*/

        //LinkedListDemo.main();
        // SetDemo.main();

        //MapDemo.main();

        // SimpleExemple.main();

        // CheckMyAge.main();

       /* try {
            DemoThrows.main();
        }catch (IOException e){
            System.out.println("C'est une exception ... ");
        }*/

        //   DemoExceptionImbrique.main2();

        // Demo1.main();
        //Demo2.main();

        // DemoFile.main3();

        // DemoFile2.main();

        // FileInputStreamd.main();


        // ExoBancaire.main();

        // System.out.println(recursive(5));

        //Demo.main();
      //  DecoratorPatternTest.main();


       // ListDemo.main();
       // IteratorDemo.main();
       // DemoExceptionImbrique.main2();

       // org.example.designPattern.bridge.Main.mainHouse();
       // ObserverDemo.main();
        //Voiture.main();
    }

}
