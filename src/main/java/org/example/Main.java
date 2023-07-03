package org.example;

import com.google.gson.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static String[] commands = {"exit", "showall", "add", "delete", "update", "save"};

    static List<Contact> contactsList = new ArrayList<>();

    private static void fromJsonToArr() throws IOException {
        String path = "src/Gson.json";
        String file = new String(Files.readAllBytes(Paths.get(path)));
        JsonParser parser = new JsonParser();
        JsonArray ja = parser.parse(file).getAsJsonArray();

        for (int i = 0; i < ja.size(); i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            String name = jo.get("name").getAsString();
            String number = jo.get("number").getAsString();
            Contact contact = new Contact(name, number);
            contactsList.add(contact);
        }
    }

    public static void main(String[] args) throws IOException {
        fromJsonToArr();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть будь-яку команду або `help`, щоб побачити всі команди");
        while (true) {
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "help":
                    System.out.println("Всі команди");
                    for (int i = 0; i < commands.length; i++) {
                        System.out.println(i + ". " + commands[i]);
                    }
                    break;
                case "0":
                case "exit":
                    exit exit = new exit();
                    exit.exit(contactsList);
                    break;
                case "1":
                case "showall":
                    showall show = new showall();
                    show.show(contactsList);
                    break;
                case "2":
                case "add":
                    add add = new add();
                    add.add(contactsList, scanner);
                    break;
                case "3":
                case "delete":
                    delete del = new delete();
                    del.delete(contactsList, scanner);
                    break;
                case "4":
                case "update":
                    update updater = new update();
                    updater.updata(contactsList, scanner);
                    break;
                case "5":
                case "save":
                    save saver = new save();
                    saver.saveData(contactsList);
                    System.out.println("Успішно збережено");
                    break;
            }
            System.out.println("Виберіть команду");
        }
    }
}