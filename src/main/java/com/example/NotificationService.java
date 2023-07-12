package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String NotificationService() {return "notification";}

    public  String imprimaSaludo(){
        return "Esto es de Notification Service";
    }

    private Saludo saludar;

    public NotificationService(Saludo saludar) {
        this.saludar = saludar;
    }


}
