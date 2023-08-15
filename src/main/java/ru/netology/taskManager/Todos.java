package ru.netology.taskManager;

public class Todos {
    private Task[] tasks = new Task[0];

    private Task[] addToArray(Task[] current, Task task) { // Вспомогательный метод для имитации добавления элемента в массив
        Task[] tmp = new Task[current.length + 1]; // @param current Массив, в который мы хотим добавить элемент
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = task; // @param task Элемент, который мы хотим добавить
        return tmp; //@return Возвращает новый массив, который выглядит как тот, что мы передали,но с добавлением нового элемента в конец
    }

    public void add(Task task) { //<- вот здесь в параметре может лежать объект и вида SimpleTask, и вида Epic, и вида Meeting
        tasks = addToArray(tasks, task);
    }

    public Task[] findAll() {
        return tasks;
    }

    public Task[] search(String query) {
        Task[] result = new Task[0]; // массив для ответа
        for (Task task : tasks) { // перебираем все задачи
            if (task.matches(query)) { // если задача подходит под запрос
                result = addToArray(result, task); // добавляем её в массив ответа
            }
        }
        return result;
    }
}
