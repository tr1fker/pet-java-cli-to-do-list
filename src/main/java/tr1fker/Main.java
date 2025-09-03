package tr1fker;

import tr1fker.handlers.InputHandler;
import tr1fker.handlers.UIHandler;
import tr1fker.managers.TaskManager;
import tr1fker.repositories.TaskStorage;
import tr1fker.views.OutputConsole;

public class Main {
    public static void main(String[] args) {
        OutputConsole outputConsole = new OutputConsole();

        InputHandler inputHandler = new InputHandler(outputConsole);

        TaskStorage taskStorage = new TaskStorage();

        TaskManager taskManager = new TaskManager(taskStorage);

        UIHandler uIHandler = new UIHandler(inputHandler, taskManager, outputConsole);

        taskManager.loadTasks();
        uIHandler.startConsole();
        taskManager.saveTasks();
    }
}