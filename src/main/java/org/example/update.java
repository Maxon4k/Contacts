package org.example;

import java.util.List;
import java.util.Scanner;

public class update {
    public void updata(List<Contact> arr, Scanner s){
        for (int i = 0; i < arr.size(); i ++ ){
            System.out.println("\t" + (i+1) + ". " + arr.get(i) );
        }
        System.out.println("Виберіть контакт, щоб змінити :");
        int choice = s.nextInt();
        System.out.println("введіть ваш номер");
        String newnumber = s.next();
        System.out.println("введіть імя");
        String newname = s.next();
        arr.get(choice - 1).setName(newname);
        arr.get(choice - 1).setNumber(newnumber);
        System.out.println("успішно змінено");
    }
}
