package org.example.poo.inner;

public class OuterClass {

    private static String message = "Dans une classe externe";


    public static class AutreClassInner {


        public void afficheMessage() {
            System.out.println("Je suis une classe interne static " + message);
        }


    }


    public class InnerClass {

        public void afficheMessage2() {
            System.out.println("Je suis une class intern non statique " + message);
        }


    }


}
