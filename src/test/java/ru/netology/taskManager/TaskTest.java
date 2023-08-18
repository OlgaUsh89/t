package ru.netology.taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void shouldSearchByRequest() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");

        Assertions.assertTrue(simpleTask.matches("Позвонить родителям"));
        Assertions.assertFalse(simpleTask.matches("Убрать дом"));

    }

    @Test
    public void shouldSearchByRequest22() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(1, subtasks);

        Assertions.assertTrue(epic.matches("Молоко"));
        Assertions.assertFalse(epic.matches("Сыр"));
    }

    public void shouldSearchByRequest5() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertEquals(true, meeting.matches("Приложение"));

    }

    public void shouldSearchByRequest3() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertEquals(true, meeting.matches("Приложение"));
        Assertions.assertEquals(false, meeting.matches("Сбер"));
    }

}









