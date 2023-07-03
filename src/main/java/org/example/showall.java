package org.example;

import java.util.List;

public class showall{

    public void show(List<Contact> contactList) {

        System.out.println("Всі контакти");
        for (int i = 0; i < contactList.size(); i ++ ){
            System.out.println("\t" + (i+1) + ". " + contactList.get(i) );
        }

    }


}
