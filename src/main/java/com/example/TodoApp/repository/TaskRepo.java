package com.example.TodoApp.repository;

import com.example.TodoApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {


}
