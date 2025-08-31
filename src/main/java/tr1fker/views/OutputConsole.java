package tr1fker.views;

import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;

import java.util.Set;

public class OutputConsole {
    public void printCustomMenu(){
        System.out.println("""
---Пользовательское меню---
1. Добавить задачу.
2. Посмотреть все задачи.
3. Обновить задачу.
4. Удалить задачу.
5. Найти задачу.
6. Выйти.
---------------------------""");
    }

    public void printINumberOption(){
        System.out.print("Введите номер опции:");
    }

    public void printSuccessExit(){
        System.out.print("Успешное завершение работы!");
    }

    public void printINameTask(){
        System.out.print("Введите название задачи:");
    }

    public void printPriorities(Priority[] priorities){
        int counter = 0;
        for (Priority priority : priorities){
            System.out.println(++counter + ". " + priority.getValue());
        }
    }

    public void printINumber(){
        System.out.print("Введите номер:");
    }

    public void printIDescTask(){
        System.out.print("Введите описание задачи:");
    }

    public void printFilterTasksMenu(){
        System.out.println("""
---Меню фильтрации задач---
1. Просмотр всех задач
2. Просмотр задач по указанному приоритету
3. Просмотр задач по указанному статуса
4. Вернуться.
---------------------------""");
    }

    public void printAllTasks(Set<Task> tasks){
        for (Task task : tasks){
            System.out.println(task);
        }
    }

    public void printStatuses(Status[] statuses){
        int counter = 0;
        for (Status status : statuses){
            System.out.println(++counter + ". " + status.getValue());
        }
    }
}
