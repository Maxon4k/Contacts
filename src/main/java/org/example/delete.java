package org.example;

import java.util.List;
import java.util.Scanner;

public class delete {

    public void delete (List<Contact> contactList, Scanner s){
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("\t" + (i+1) + ". " + contactList.get(i) );
        }
        System.out.println("введіть номер контакту, який хочете видалити: ");
        int choice = s.nextInt();
        contactList.remove(choice - 1);
        System.out.println("успішно видалено");
    }
}
