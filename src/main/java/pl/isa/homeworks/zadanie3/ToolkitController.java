package pl.isa.homeworks.zadanie3;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToolkitController {
    private List<Tool> tools;
    Path pathToFile = Path.of("src", "main","resources", "toolkit.json");
    public ToolkitController() {
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
//        ObjectMapper mapper = new ObjectMapper();
//        List<Tool> toolsList =
//        try {
//            mapper.writeValue(pathToFile.toFile(), toolsList);
//            return true;
//        } catch (IOException e) {
//            return false;
//        }

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(pathToFile.toFile(), tools); // Zapisanie listy narzędzi do pliku JSON
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
