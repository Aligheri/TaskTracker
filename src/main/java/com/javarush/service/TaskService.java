package com.javarush.service;

import com.javarush.domain.Status;
import com.javarush.domain.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TaskService {

    Page<Task> getAllTasks(Pageable pageable);

    Task createTask(String description, Status status);

    Task getTaskById(Long id);

    void deleteById(Long id);

    void save(Task task);


}
