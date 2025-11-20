package com.example.TodoApp.Services;

import com.example.TodoApp.models.Task;
import org.springframework.stereotype.Service;
import com.example.TodoApp.repository.TaskRepo;

import java.util.List;

@Service
public class TaskService {

    public final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getALLTasks() {
        return taskRepo.findAll();
    }

    public void createTask(String title) {
        Task task=new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepo.save(task);
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task=taskRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task ID"));
        task.setCompleted(!task.isCompleted());
        taskRepo.save(task);
    }
}
