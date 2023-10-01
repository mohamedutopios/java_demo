package org.example.collections.liste;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(){

        ArrayList<Integer> liste = new ArrayList<>();
        List<Integer> liste3 = new ArrayList<>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);


        // Iterator :
        System.out.println("Iterator : ");

        Iterator iter = liste.iterator();

        while (iter.hasNext()){
            System.out.println("iterator : " + iter.next() + " ");
        }

        //ListIterator :
        System.out.println("ListIterator : ");
        ListIterator i = liste.listIterator();

        while (i.hasNext()){
            System.out.println(i.next() + " ");

        }

        // Sens inverse :

        while (i.hasPrevious()){
            System.out.println(i.previous() + " ");
        }

    }





}
