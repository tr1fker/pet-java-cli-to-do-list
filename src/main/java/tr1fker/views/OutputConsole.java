package tr1fker.views;

import tr1fker.models.Priority;

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
            System.out.println(++counter + ". " + priority);
        }
    }

    public void printINumber(){
        System.out.print("Введите номер:");
    }

    public void printIDescTask(){
        System.out.print("Введите описание задачи:");
    }
}
