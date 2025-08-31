package tr1fker.handlers;

import tr1fker.managers.TaskManager;
import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;
import tr1fker.views.OutputConsole;

import java.util.Set;

public class FilterTasksUIHandler {
    private InputHandler inputHandler;

    private TaskManager taskManager;

    private OutputConsole outputConsole;

    private boolean isRunning;

    public FilterTasksUIHandler(InputHandler inputHandler, TaskManager taskManager, OutputConsole outputConsole){
        this.inputHandler = inputHandler;

        this.taskManager = taskManager;

        this.outputConsole = outputConsole;

        this.isRunning = false;
    }

    public void start(){
        this.isRunning = true;

        while(this.isRunning){
            this.outputConsole.printFilterTasksMenu();
            this.outputConsole.printINumberOption();

            int option = this.inputHandler.inputInteger();

            switch(option){
                case 1:
                    this.showAllTasks();
                    break;
                case 2:
                    this.showAllTasksByPriority();
                    break;
                case 3:
                    this.showAllTasksByStatus();
                    break;
                case 4:
                    this.stop();
                    break;
            }
        }
    }

    public void showAllTasks(){
        Set<Task> tasks = this.taskManager.getTasks();
        this.outputConsole.printAllTasks(tasks);
    }

    public void showAllTasksByPriority(){
        Priority[] priorities = Priority.values();
        this.outputConsole.printPriorities(priorities);
        this.outputConsole.printINumber();
        Priority priority = this.inputHandler.inputPriority();

        Set<Task> tasks = this.taskManager.getTasks();
        for(Task task : tasks){
            if (task.getPriority() == priority){
                System.out.println(task);
            }
        }
    }

    public void showAllTasksByStatus(){
        Status[] statuses = Status.values();
        this.outputConsole.printStatuses(statuses);
        this.outputConsole.printINumber();
        Status status = this.inputHandler.inputStatus();

        Set<Task> tasks = this.taskManager.getTasks();
        for(Task task : tasks){
            if (task.getStatus() == status){
                System.out.println(task);
            }
        }
    }

    public void stop(){
        this.isRunning = false;
    }
}
