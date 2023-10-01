package org.example.collections.map;

import org.example.collections.entities.Product;
import org.example.collections.entities.User;

import java.util.*;

public class MapDemo {


    public static void main(){

        Map<Integer, String> map = new HashMap<>();

        map.put(2, "Maison");
        map.put(3, "Caravane");
        map.put(5,"Châlet");
        map.put(6,"Appartement");


        System.out.println("Get un element de la map " + map.get(6));

        System.out.println("Iteration dans la map pour récupérer les clés : ");

        for (Integer key: map.keySet()) {
            System.out.println("key " + key);
        }

        System.out.println("Iteration dans la map pour récupérer les valeurs et les clés :");

        for (Map.Entry<Integer, String> entry: map.entrySet()){

            System.out.println("Entry key " + entry.getKey() + " Entry Value " +entry.getValue());

        }


        Map<User, Product> userProductMap = new HashMap<>();

        User user = new User();
        user.setFirstName("Eddy");
        user.setLastName("Mitchell");

        Product product = new Product();

        userProductMap.put(user,product);

        System.out.println("Get product by user " + userProductMap.get(user));


        User user1;
        user1 = user;

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());

        System.out.println("Get product by user " + userProductMap.get(user1));

        User user2 = new User("Michel","Jonas","1234","michel@gmail.com");
        User user3 = new User("Jean-Louis","Aubert","1234","jean-louis@gmail.com");
        User user4 = new User("Alain","Bashung","1234","alain@gmail.com");

        ArrayList<User> listeUser = new ArrayList<>();

        listeUser.addAll(Arrays.asList(user2,user3,user4));

        List<Product> products = new ArrayList<>();

       // Product.addProduct(10,products);

        Map<Integer,List<Product>> map2 = new HashMap<>();


        for (int i = 0; i < listeUser.size(); i++) {
            Product.addProduct(10,products);
            map2.put(listeUser.get(i).getId(), products);
        }

        for (Map.Entry<Integer, List<Product>> entry: map2.entrySet()) {
            for (Product p: entry.getValue()) {
                System.out.println("User id " + entry.getKey() + " : " + p);
            }


        }




    }





}
