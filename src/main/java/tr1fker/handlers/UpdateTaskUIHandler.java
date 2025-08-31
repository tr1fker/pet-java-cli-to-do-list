package tr1fker.handlers;

import tr1fker.managers.TaskManager;
import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;
import tr1fker.views.OutputConsole;

public class UpdateTaskUIHandler {
    private InputHandler inputHandler;

    private TaskManager taskManager;

    private OutputConsole outputConsole;

    private boolean isRunning;

    public UpdateTaskUIHandler(InputHandler inputHandler, TaskManager taskManager, OutputConsole outputConsole){
        this.inputHandler = inputHandler;

        this.taskManager = taskManager;

        this.outputConsole = outputConsole;

        this.isRunning = false;
    }

    public void start(){
        this.isRunning = true;

        this.outputConsole.printINumberTask();
        int numberTask = this.inputHandler.inputInteger();

        Task task = taskManager.getTask(numberTask);

        while(this.isRunning){
            this.outputConsole.printUpdateTaskMenu();
            this.outputConsole.printINumberOption();

            int option = this.inputHandler.inputInteger();

            switch(option){
                case 1:
                    task.setName(this.resetName());
                    break;
                case 2:
                    task.setPriority(this.resetPriority());
                    break;
                case 3:
                    task.setDescription(this.resetDescription());
                    break;
                case 4:
                    task.setStatus(this.resetStatus());
                    break;
                case 5:
                    this.stop();
                    break;
            }
        }
        taskManager.putTask(task);
        this.outputConsole.printSuccessUpdateTask();
    }

    public String resetName(){
        this.outputConsole.printINameTask();
        String name = this.inputHandler.inputString();
        return name;
    }

    public Priority resetPriority(){
        Priority[] priorities = Priority.values();
        this.outputConsole.printPriorities(priorities);
        this.outputConsole.printINumber();
        int choice = this.inputHandler.inputInteger();
        Priority priority = priorities[choice - 1];
        return priority;
    }

    public String resetDescription(){
        this.outputConsole.printIDescTask();
        String description = this.inputHandler.inputString();
        return description;
    }

    public Status resetStatus(){
        Status[] statuses = Status.values();
        this.outputConsole.printStatuses(statuses);
        this.outputConsole.printINumber();
        int choice = this.inputHandler.inputInteger();
        Status status = statuses[choice - 1];
        return status;
    }

    public void stop(){
        this.isRunning = false;
    }
}
