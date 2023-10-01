package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {


    public static void main() {

        List<String> prenoms = Arrays.asList("abdallah", "benoit", "albert", "thierry", "alain", "jean", "alban", "alain");

        System.out.println("Filter : ");
        prenoms.stream()
                .filter(p -> p.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("Count : ");
        System.out.println("Le nombre de personne dont le prenom commence par un a est de : " + prenoms.stream()
                .filter(p -> p.startsWith("a")).count());

        System.out.println();
        System.out.println("Distinct : ");
        prenoms.stream().distinct().forEach(System.out::println);
        System.out.println();
        System.out.println("Limit : ");
        prenoms.stream().limit(4).forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted : ");
        System.out.println();
        prenoms.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted inverse : ");
        prenoms.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Employe> liste = new ArrayList<>();

        liste.add(new Employe(1, Genre.HOMME,176,3500));
        liste.add(new Employe(2, Genre.HOMME,180,1900));
        liste.add(new Employe(3, Genre.FEMME,190,2600));
        liste.add(new Employe(4, Genre.HOMME,176,2400));
        liste.add(new Employe(5, Genre.FEMME,156,2200));
        liste.add(new Employe(6, Genre.HOMME,176,2090));


        double totalSalaire = liste.stream()
                .mapToDouble(e-> e.getSalaire())
                .sum();

        System.out.println("Total salaire : " + totalSalaire);

        Optional<Employe> employe = liste.stream()
                .filter(p -> p.getTaille()>=176)
                .findFirst();

        System.out.println("Le premier employe qui fait au moins 176 cm est " + employe.get());


        int[] nbr = {1,4,5,7,3,60};

        int somme = Arrays.stream(nbr).reduce(0,(a,b) -> a + b);
        System.out.println("La somme du tableau nbr est de " + somme);

        List<Integer> nbrs = Arrays.asList(1,2,3,4,5);

        /*List<Integer> pairs = nbrs.stream()
                .filter(x -> x%2==0)
                .toList();*/

    //    pairs.stream().forEach(System.out::println);


    }


}
