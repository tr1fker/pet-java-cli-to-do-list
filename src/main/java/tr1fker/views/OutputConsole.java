package tr1fker.views;

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
}
