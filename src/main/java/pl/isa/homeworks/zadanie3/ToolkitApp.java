package pl.isa.homeworks.zadanie3;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ToolkitApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int SHOW_ALL = 1;
    private static final int FIND_TOOL = 2;
    private static final int ADD_TOOL = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        ToolkitController toolkitController = new ToolkitController();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            showOptions();
            if(scanner.hasNextInt()){
                int selectedOption = readOption(scanner);
                switch (selectedOption) {
                    case SHOW_ALL -> showAll(toolkitController);
                    case FIND_TOOL -> findTool(toolkitController);
                    case ADD_TOOL -> addTool(toolkitController);
                    case EXIT -> isRunning = false;
                }
            }else{
                System.out.println("This is not a number ;)");
                scanner.nextLine();
            }
        }
    }

    private static void showOptions() {
        System.out.println("Menu options\n"
                + SHOW_ALL + " - show all tools\n"
                + FIND_TOOL + " - find tool by name\n"
                + ADD_TOOL + " - add new tool\n"
                + EXIT + " - exit");
    }

    private static int readOption(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void showAll(ToolkitController toolkitController) {
        if (toolkitController.isEmpty()) {
            System.out.println("You have no tools in your toolkit");
            return;
        }

        toolkitController.getTools().forEach(ToolkitApp::showTool);
        System.out.println("---");
    }

    private static void showTool(Tool tool) {
        System.out.println("---\n" + tool.getName()
                + "\nSize: " + tool.getToolSize().size() + " " + tool.getToolSize().unit());
    }

    private static void findTool(ToolkitController toolkitController) {
        System.out.println("What kind of tool do you want to check: ");
        String toolToFindByName = scanner.nextLine().toLowerCase();
        List<Tool> tools = toolkitController.getTools();
        boolean findTool = false;
        for (Tool tool : tools) {
            if (foundToolByName(toolToFindByName).test(tool)) {
                System.out.println("We heave that tool");
                findTool = true;
                break;
            }
        }
        if (!findTool) {
            System.out.println("We don't have that tool");
        }
    }


    private static Predicate<Tool> foundToolByName(String toolName) {
        return tool -> tool.getName().equalsIgnoreCase(toolName);
    }

    private static void addTool(ToolkitController toolkitController) {
        System.out.println("Tool name:");
        String name = scanner.nextLine();
        float checkedSize = checkIsFloat();
        System.out.println("Set unit:");
        String unit = scanner.nextLine();
        Tool.ToolSize toolSize = new Tool.ToolSize(checkedSize, unit);
        Tool tool = new Tool(name,toolSize);
        toolkitController.add(tool);
    }

    private static float checkIsFloat() {
        boolean isFloat = true;
        float size = 0;
        while(isFloat){
            System.out.println("Tool size:");
            if(scanner.hasNextFloat()){
                size = scanner.nextFloat();
                scanner.nextLine();
                isFloat = false;
            }else{
                System.out.println("This is not a number");
                scanner.nextLine();
            }
        }
        return size;
    }
}
