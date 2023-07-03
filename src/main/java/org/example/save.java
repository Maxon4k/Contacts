package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class save {
    public void saveData(List<Contact> contactsList) throws IOException {
        try (Writer writer = new FileWriter("src/Gson.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(contactsList, writer);
        }
    }
}
