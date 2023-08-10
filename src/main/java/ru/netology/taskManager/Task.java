package ru.netology.taskManager;

import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean matches(String query) { //возможность искать задачи по посковому запросу (query). Подходит ли задача запросу, будет решать сама задача, для чего мы в Task заведём метод matches
        return false;
    }
}

