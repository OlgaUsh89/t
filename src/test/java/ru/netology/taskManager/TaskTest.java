package ru.netology.taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void shouldSearchByRequest() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");

        Assertions.assertEquals(true, simpleTask.matches("Позвонить родителям"));
        Assertions.assertEquals(false, simpleTask.matches("Убрать дом"));

    }

    @Test
    public void shouldSearchByRequest2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(1, subtasks);

        Assertions.assertEquals(true, epic.matches("Молоко"));
        Assertions.assertEquals(false, epic.matches("Сыр"));

    }

    @Test
    public void shouldSearchByRequest3() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertEquals(true, meeting.matches("Приложение"));
        Assertions.assertEquals(false, meeting.matches("Сбер"));

    }
}









