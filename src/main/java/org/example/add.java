package org.example;

import java.util.List;
import java.util.Scanner;

public class add {

    public void add(List<Contact> arr, Scanner s){
        System.out.println("введіть ваш номер");
        String number = s.nextLine();
        System.out.println("введіть імя");
        String name = s.nextLine();

        Contact contact = new Contact(name, number);
        arr.add(contact);
        System.out.println("успішно додано");
    }
}

