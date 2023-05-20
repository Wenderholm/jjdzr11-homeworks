package com.example.infoshare_zadanie4.zadanie3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ToolkitController {
    private final ToolkitRepository toolkitRepository;

    public ToolkitController(ToolkitRepository toolkitRepository) {
        this.toolkitRepository = toolkitRepository;
    }

    @GetMapping("/")
    String toolsList(Model model){
        List<Tool> allTools = toolkitRepository.getTools();
        model.addAttribute("tools", allTools);
        return "list";
    }

    @GetMapping("/add")
    String toolAddForm(Model model) {
        model.addAttribute("tool", new ToolDto());
        return "add-form";
    }

    @PostMapping("/save")
    String savePromotion(@RequestParam("myList") List<String> myList, @ModelAttribute ToolDto toolDto) {
        Tool.ToolSize toolSize = new Tool.ToolSize(toolDto.getSize(), toolDto.getUnit());
        Tool tool = new Tool(toolDto.getName(),toolSize,myList);
        toolkitRepository.add(tool);
        return "redirect:/";
    }
}
