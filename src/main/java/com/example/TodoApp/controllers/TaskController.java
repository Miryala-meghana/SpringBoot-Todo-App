package com.example.TodoApp.controllers;

import com.example.TodoApp.Services.TaskService;
import org.springframework.ui.Model;
import com.example.TodoApp.models.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController("/tasks")
public class TaskController {

    public final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model)
    {
        List<Task> tasks=taskService.getALLTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }

    @PostMapping
    public String createTask(@RequestParam String title)
    {
       taskService.createTask(title);
       return "redirect:/";
    }

    @GetMapping("{id}/delete")
    public String deleteTask(@PathVariable Long id)
    {
        taskService.deleteTask(id);
        return "redirect:/";
    }

//    @GetMapping("{id}/toggle")
    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable Long id)
    {
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
