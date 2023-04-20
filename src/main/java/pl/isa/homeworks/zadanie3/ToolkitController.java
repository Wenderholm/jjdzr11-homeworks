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
    private final List<Tool> tools;

    public ToolkitController() {
        tools = readToolkit();
    }

    public List<Tool> getTools() {
        return new ArrayList<>(tools);
    }

    public boolean isEmpty() {
        return tools.isEmpty();
    }

    public boolean add(Tool tool) {
        tools.add(tool);
        return saveToolkit();
    }
    Path pathToFile = Path.of("src", "main","resources", "toolkit.json");
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
        return false;
    }
}
