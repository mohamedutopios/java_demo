package org.example.collections.liste;

import org.example.collections.liste.entity.RandomPerson;
import org.example.collections.liste.enums.Order;
import org.example.collections.liste.tools.FlexibleRandomComparator;

import static org.example.collections.liste.entity.RandomPerson.affichePerson;
import static org.example.collections.liste.entity.RandomPerson.addData;

import java.util.*;

public class ListDemo {


    public static List<RandomPerson> listeDemo = new ArrayList<RandomPerson>();
    public static List<RandomPerson> listeDemo2 = new ArrayList<RandomPerson>();

    public static List<RandomPerson> listeDemo3 = new ArrayList<RandomPerson>();


    public static void main() {

        List<String> liste = new ArrayList<>();

        liste.add("Michel");
        liste.add("Toto");
        liste.add("Paul");

        String nom = liste.get(1);
        Object obj = liste.get(1);
        System.out.println(liste);


        List<String> liste2 = new LinkedList<>();
        liste2.add("Pierre");


        List<Integer> liste3 = new ArrayList<>(Arrays.asList(2,9,0,67,45,32,1));

        List<Integer> liste4 = new ArrayList<>(Arrays.asList(2,9,0,67,45,32,1));

        Collections.sort(liste3);

        Integer toto = Collections.min(liste4);

        System.out.println("min " + toto);

        for (Integer i: liste3) {
            System.out.println(i);
        }


        int[] tab = new int[]{7,9,9,0,5,4,3,2};

        Arrays.sort(tab);

        liste3.clear();
        liste3.addAll(liste4);

        // Demo avec Arraylist avec objet :

        RandomPerson.addData(3,listeDemo);

        RandomPerson.affichePerson(listeDemo);

        RandomPerson person = new RandomPerson();

        person.firstName = "Mohamed";

        System.out.println(" --- Ajout d'un personne ----");

        listeDemo.add(3,person);

     //   affichePerson(listeDemo);


        System.out.println(" ====> Ajout une personne à l'index d'un autre objet");

        RandomPerson person1 = new RandomPerson();
        person1.firstName ="Pikachu";
        listeDemo.add(listeDemo.indexOf(person), person1);
        affichePerson(listeDemo);


        System.out.println("======> Creation d'une seconde liste ");


        addData(7,listeDemo2);

        System.out.println("Affiche la nouvelle liste (liste demo2) ");

        affichePerson(listeDemo2);

        System.out.println(" ====> Ajouter la liste demo2 à la liste demo1");

        listeDemo.addAll(listeDemo2);

        System.out.println("Affiche la liste demo1 qui contient la liste demo2 ");

        affichePerson(listeDemo);

        System.out.println("Supprimer un element de la liste : ");

        listeDemo.remove(person);
        listeDemo.remove(3);

        affichePerson(listeDemo);

        System.out.println(" ******* contains ********");


        System.out.println("Est ce que la liste demo contient la liste demo2  : " + listeDemo.containsAll(listeDemo2));

        listeDemo.remove(9);

        System.out.println("Suppression de l'element 9 : ");

        System.out.println("Est ce que la liste demo contient la liste demo2  : " + listeDemo.containsAll(listeDemo2));


        System.out.println(" **** Sous liste ****");

        System.out.println("Sous liste de la liste demo1 de l'index 3 à 9 : " );

        listeDemo3 = listeDemo.subList(3,9);

        affichePerson(listeDemo3);

    }

    public static void trieOrderRandomPerson(Order order, List<RandomPerson> liste){
        FlexibleRandomComparator comparator = new FlexibleRandomComparator();
        comparator.setOrder(order);
        Collections.sort(liste,comparator);
    }






}
