package com.example.infoshare_zadanie4.zadanie3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Repository
public class ToolkitRepository {
    private List<Tool> tools;
    Path pathToFile = Path.of("src", "main","resources", "toolkit.json");
    public ToolkitRepository() {
        tools = readToolkit();
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public List<Tool> getTools() {
        return new ArrayList<>(tools);
    }

    public boolean isEmpty() {
        return tools.isEmpty();
    }

    public boolean add(Tool tool) {
        List<Tool> newToolsList = new ArrayList<>(tools);
        newToolsList.add(tool);
        setTools(newToolsList);
        return saveToolkit();
    }


    private List<Tool> readToolkit() {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(String.valueOf(pathToFile)));
            ObjectMapper toolsList = new ObjectMapper();
            return Arrays.asList(toolsList.readValue(jsonData, Tool[].class));
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private boolean saveToolkit() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pathToFile.toFile(), tools);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
