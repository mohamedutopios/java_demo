package org.example.enums;

public class DemoEnum {

    public static void getEnum(){

        Priority priority = Priority.HIGH;

        switch (priority){

            case HIGH:
                System.out.println("High Priority");
                break;

            case MEDIUM:
                System.out.println("Medium Priority");
                break;

            case LOW:
                System.out.println("Low Priority");
                break;


        }

        Priority priority1 = Priority.valueOf("HIGH");
        System.out.println(priority1);

        Priority[] values = Priority.values();

        for (Priority prio: values) {
            System.out.println("Enum : "  + prio);
        }


        System.out.println("Nombre de jour pour le mois de Janvier " + Month.JANUARY.getDaysMonth());

    }






}
