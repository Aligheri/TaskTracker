package com.javarush.controller;

import com.javarush.domain.Status;
import com.javarush.domain.Task;
import com.javarush.service.TaskServiceImpl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    private final TaskServiceImpl taskService;

    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        Pageable pageable = PageRequest.of(page, size);
        model.addAttribute("allTasksList", taskService.getAllTasks(pageable));
        return "index";
    }
    @PostMapping("/create")
    public String createTask(@ModelAttribute("newTask") Task newTask) {
        taskService.createTask(newTask.getDescription(), Status.IN_PROGRESS);
        return "redirect:/";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable(value = "id") Long id) {
        taskService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping(value = {"/updateTask/{id}", "/updateTask"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String updateTask(@PathVariable(value = "id", required = false) Long id,
                             @ModelAttribute Task task, Model model) {
        if (id != null) {
            Task existingTask = taskService.getTaskById(id);
            model.addAttribute("task", existingTask);
        } else {
            taskService.save(task);
            return "redirect:/";
        }
        return "update";
    }
}