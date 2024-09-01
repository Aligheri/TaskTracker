package com.javarush.service;

import com.javarush.domain.Status;
import com.javarush.domain.Task;
import com.javarush.repository.TaskRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Page<Task> getAllTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    @Override
    public Task createTask(String description, Status status) {
        Task task = new Task();
        task.setDescription(description);
        task.setStatus(status);

        return taskRepository.save(task);
    }

    @Override
    public Task getTaskById(Long id) {
        Optional<Task> optional = taskRepository.findById(id);
        Task task;

        if (optional.isPresent()) {
            task = optional.get();
        } else {
            throw new RuntimeException("Task not found for id :" + id);
        }
        return task;
    }

    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }


}
