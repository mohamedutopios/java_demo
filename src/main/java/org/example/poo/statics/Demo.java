package org.example.poo.statics;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Demo {

    public static void main() {
        User user1 = new User();
        System.out.println("user1.getId() = " + user1.getId());
        System.out.println("user1.getCounter() = " + user1.getCounter());

        System.out.println();
        System.out.println("================================");
        System.out.println();

        User user2 = new User();
        System.out.println("user2.getId() = " + user2.getId());
        System.out.println("user2.getCounter() = " + user2.getCounter());

        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("user1.getCounter() = " + user1.getCounter());

        System.out.println();
        System.out.println("================================");
        System.out.println();

        User user3 = new Employee();
        user3.doAnyStaticAction();

        User.doAnyStaticAction();
        Employee.doAnyStaticAction();

        System.out.println();
        System.out.println("================================");
        System.out.println();

        int[] arr = {1, 2, 3};
        sort(arr);
        //sort(arr);
    }

}

