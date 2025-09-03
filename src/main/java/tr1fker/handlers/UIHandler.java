package tr1fker.handlers;

import tr1fker.managers.TaskManager;
import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;
import tr1fker.views.OutputConsole;

public class UIHandler {
    private InputHandler inputHandler;

    private TaskManager taskManager;

    private OutputConsole outputConsole;

    private boolean isRunning;

    public UIHandler(InputHandler inputHandler, TaskManager taskManager, OutputConsole outputConsole){
        this.inputHandler = inputHandler;

        this.taskManager = taskManager;

        this.outputConsole = outputConsole;

        this.isRunning = false;
    }


    public void startConsole(){
        this.isRunning = true;

        while(this.isRunning){
            this.outputConsole.printCustomMenu();
            this.outputConsole.printINumberOption();

            int option = this.inputHandler.inputInteger();

            switch(option){
                case 1:
                    this.createTask();
                    break;
                case 2:
                    this.switchToFilterTasksMenu();
                    break;
                case 3:
                    this.switchToUpdateTaskMenu();
                    break;
                case 4:
                    this.removeTask();
                    break;
                case 5:
                    this.searchTask();
                    break;
                case 6:
                    this.stopConsole();
                    break;
            }
        }
    }

    public void createTask(){
        this.outputConsole.printINameTask();
        String name = this.inputHandler.inputString();

        this.outputConsole.printPriorities(Priority.values());
        this.outputConsole.printINumber();
        Priority priority = this.inputHandler.inputPriority();

        this.outputConsole.printIDescTask();
        String description = this.inputHandler.inputString();

        Task newTask = new Task(name, priority, description, Status.NEW);

        this.taskManager.add(newTask);
    }

    public void switchToFilterTasksMenu(){
        FilterTasksUIHandler filterTasksUIHandler = new FilterTasksUIHandler(this.inputHandler,
                this.taskManager, this.outputConsole);
        filterTasksUIHandler.start();
    }

    public void switchToUpdateTaskMenu(){
        UpdateTaskUIHandler updateTaskUIHandler = new UpdateTaskUIHandler(this.inputHandler,
                this.taskManager, this.outputConsole);
        updateTaskUIHandler.start();
    }

    public void removeTask(){
        this.outputConsole.printINumberTask();
        int taskId = this.inputHandler.inputInteger();
        this.taskManager.removeTask(taskId);
        this.outputConsole.printSuccessRemoveTask();
    }

    public void searchTask(){
        this.outputConsole.printINameTask();
        String name = this.inputHandler.inputString();
        Task task = this.taskManager.getTask(name);
        this.outputConsole.printTask(task);
    }

    public void stopConsole(){
        this.isRunning = false;
        this.outputConsole.printSuccessExit();
    }
}