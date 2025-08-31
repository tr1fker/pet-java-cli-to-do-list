package tr1fker.handlers;

import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.views.OutputConsole;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner;

    protected OutputConsole outputConsole;

    static{
        scanner = new Scanner(System.in);
    }

    public InputHandler(OutputConsole outputConsole){
        this.outputConsole = outputConsole;
    }

    public int inputInteger(){
        int number = scanner.nextInt();
        scanner.nextLine(); // '\n' считываем
        return number;
    }

    public String inputString(){
        return scanner.nextLine();
    }

    public Priority inputPriority(){
        Priority[] priorities = Priority.values();

        int choice = this.inputInteger();

        return priorities[choice - 1];
    }

    public Status inputStatus(){
        Status[] statuses = Status.values();

        int choice = this.inputInteger();

        return statuses[choice - 1];
    }
}
