package org.example.collections.liste;

import org.example.collections.liste.entity.RandomPerson;

import java.util.LinkedList;


import static org.example.collections.liste.entity.RandomPerson.*;


public class LinkedListDemo {

    public static LinkedList<RandomPerson> listeDemo = new LinkedList<>();

    public static void main() {

        System.out.println("Demo sur linkedList");

        addData(5, listeDemo);
        // affichePerson(listeDemo);

        RandomPerson person = new RandomPerson();

        person.firstName = "Alexandre";
        listeDemo.addFirst(person);

        //   affichePerson(listeDemo);


        RandomPerson person2 = new RandomPerson();

        person2.firstName = "Tristan";

        listeDemo.addLast(person2);

        //    affichePerson(listeDemo);


        //  listeDemo.removeFirst();
        // listeDemo.removeLast();


        RandomPerson person3 = new RandomPerson();

        person3 = person2;

        listeDemo.addFirst(person3);

        affichePerson(listeDemo);

        listeDemo.removeFirstOccurrence(person2);
        listeDemo.removeLastOccurrence(person2);

       // listeDemo.getFirst();
        //listeDemo.getLast();

        System.out.println("Le premier element de ma liste est : " + listeDemo.getFirst());
        System.out.println("Le dernier element de ma liste est : " + listeDemo.getLast());


    }


}
