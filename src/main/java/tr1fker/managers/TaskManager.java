package tr1fker.managers;

import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;

import java.util.HashSet;
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
}
