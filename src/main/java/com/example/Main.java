package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //Ejercicio1

        Saludo saludar = (Saludo) context.getBean("saludar");

        String saludame = saludar.inmprimirSaludo();
        System.out.println(saludame);


        //Ejercicio2

        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        String saludo = notificationService.imprimaSaludo();

        UserService userService = (UserService) context.getBean("userService");


        System.out.println(userService.getNotificationService().imprimaSaludo());

    }
}
//  UserService userService = (UserService) context.getBean("notificationService");

