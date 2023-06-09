package com.example.infoshare_zadanie4.zadanie3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToolkitController {
    private final ToolkitRepository toolkitRepository;
    List<Tool> toolListByName;
    public String searchName;

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
    @GetMapping("/delete/{name}")
    String deletePromotion(@PathVariable("name")String name){
        toolkitRepository.removeByName(name);
        return "redirect:/";
    }

    @GetMapping("/edit/{name}")
    String editPromotion(@PathVariable("name")String name, Model model){
        ToolDto toolDto = toolkitRepository.findByName(name);
        model.addAttribute("toolToEdit",toolDto);
        return "update-form";
    }

    @PostMapping("/update/{name}")
    String updatePromotion(
            @PathVariable("name")String name,
            @RequestParam("myList") List<String> myList,
            @ModelAttribute ToolDto toolDto){
        toolkitRepository.removeByName(name);
        Tool.ToolSize toolSize = new Tool.ToolSize(toolDto.getSize(), toolDto.getUnit());
        Tool tool = new Tool(toolDto.getName(),toolSize,myList);
        toolkitRepository.add(tool);
        return "redirect:/";
    }

    @GetMapping("/search")
    String search(Model model, ToolDto toolDto){
        model.addAttribute("tool", toolDto);
        return "searchForm";
    }

    @PostMapping("/filterByName")
    String showByAuthor(@ModelAttribute("tool") ToolDto toolDto){
        toolListByName = toolkitRepository.filterByTool(toolDto.getName());
        searchName = toolDto.getName();
        return "redirect:filterTool";
    }
    @GetMapping("/filterTool")
    String bookAuthList(Model model){
        model.addAttribute("toolA", toolListByName);
        model.addAttribute("searchName", searchName);
        return "toolByName";
    }

}
