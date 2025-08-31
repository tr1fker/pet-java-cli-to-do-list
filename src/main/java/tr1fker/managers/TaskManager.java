package tr1fker.managers;

import tr1fker.models.Task;

import java.util.Set;
import java.util.TreeSet;

public class TaskManager {
    private Set<Task> tasks;
    private int maxId;

    public TaskManager(){
        this.tasks = new TreeSet<>();
        this.maxId = 0;
    }

    public void add(Task task){
        task.setId(++maxId);
        this.tasks.add(task);
    }

    public Set<Task> getTasks(){
        return this.tasks;
    }
}
