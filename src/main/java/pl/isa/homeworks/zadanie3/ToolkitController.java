package pl.isa.homeworks.zadanie3;

import java.util.ArrayList;
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
        return true;
    }

    public boolean add(Tool tool) {
        tools.add(tool);
        return saveToolkit();
    }

    private List<Tool> readToolkit() {
        return new ArrayList<>();
    }

    private boolean saveToolkit() {
        return false;
    }
}
