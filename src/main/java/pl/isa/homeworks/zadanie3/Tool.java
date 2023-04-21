package pl.isa.homeworks.zadanie3;

import java.util.Collections;
import java.util.List;

public class Tool {
    private String name;
    private ToolSize toolSize;

    private List<String> activities = Collections.emptyList();
    public Tool() {
    }
    public Tool(String name, ToolSize size) {
        this.name = name;
        this.toolSize = size;
    }

    public Tool(String name, ToolSize toolSize, List<String> activities) {
        this.name = name;
        this.toolSize = toolSize;
        this.activities = activities;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToolSize getToolSize() {
        return toolSize;
    }

    public void setToolSize(ToolSize toolSize) {
        this.toolSize = toolSize;
    }

    public record ToolSize(float size, String unit) {
    }
}
