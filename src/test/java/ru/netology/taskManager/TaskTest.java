package ru.netology.taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void shouldSearchByRequest() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");

        Assertions.assertEquals(true, simpleTask.matches("Позвонить родителям"));

    }

    @Test
    public void shouldSearchByRequest2() {
        SimpleTask simpleTask = new SimpleTask(1, "Позвонить родителям");

        Assertions.assertEquals(false, simpleTask.matches("Убрать дом"));
    }

    @Test
    public void shouldSearchByRequest3() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(1, subtasks);

        Assertions.assertEquals(true, epic.matches("Молоко"));


    }

    @Test
    public void shouldSearchByRequest4() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(1, subtasks);


        Assertions.assertEquals(false, epic.matches("Сыр"));
    }

    @Test
    public void shouldSearchByRequest5() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertEquals(true, meeting.matches("Приложение"));

    }

    @Test
    public void shouldSearchByQuery() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertEquals(false, meeting.matches("Сбер"));
    }

    @Test
    public void shouldGetTopic() {
        Meeting meeting = new Meeting(2, "Функциональное тестирование", "Русбанк", "Завтра в пять");
        Assertions.assertEquals("Функциональное тестирование", meeting.getTopic());
    }

    @Test
    public void shouldGetProject() {
        Meeting meeting = new Meeting(2, "Функциональное тестирование", "Русбанк", "Завтра в пять");
        Assertions.assertEquals("Русбанк", meeting.getProject());
    }

    @Test
    public void shouldGetStart() {
        Meeting meeting = new Meeting(2, "Функциональное тестирование", "Русбанк", "Завтра в пять");
        Assertions.assertEquals("Завтра в пять", meeting.getStart());
    }

    @Test
    public void shouldGetSubtasks() {
        String[] subtasks = new String[]{"Картофель", "Морковь"};
        Epic epic = new Epic(2, subtasks);

        Assertions.assertArrayEquals(new String[]{"Картофель", "Морковь"}, epic.getSubtasks());
    }

    @Test
    public void shouldGetTitle() {
        SimpleTask simpleTask = new SimpleTask(3, "Занятия по английскому");
        Assertions.assertEquals("Занятия по английскому", simpleTask.getTitle());
    }

    @Test
    public void shouldGetId() {
        Task task = new Task(7);
        Assertions.assertEquals(7, task.getId());
    }

    @Test
    public void shouldCompare() {
        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        SimpleTask simpleTask2 = new SimpleTask(5, "Позвонить родителям");
        Assertions.assertEquals(simpleTask1, simpleTask2);
    }

    @Test
    public void shouldCompare2() {
        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        Object obj = new Object();
        Assertions.assertNotEquals(simpleTask1, obj);
    }


    @Test
    public void shouldCompare3() {
        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        SimpleTask simpleTask2 = new SimpleTask(7, "Позвонить друзьям");
        Assertions.assertNotEquals(simpleTask1, simpleTask2);
    }

    @Test
    public void shouldCompare4() {
        SimpleTask simpleTask1 = new SimpleTask(5, "Позвонить родителям");
        SimpleTask simpleTask2 = new SimpleTask(1, "Позвонить родителям");
        Assertions.assertNotEquals(simpleTask1, simpleTask2);

    }
}








