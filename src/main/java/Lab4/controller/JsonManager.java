package Lab4.controller;

import Lab4.model.University;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonManager {
    public void saveUniversityToJson(University university, String filename) {
        Gson gson = new Gson();
        String json = gson.toJson(university);

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University loadUniversityFromJson(String filename) {
        try {
            String json = new String(Files.readAllBytes(Paths.get(filename)));
            Gson gson = new Gson();
            return gson.fromJson(json, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
