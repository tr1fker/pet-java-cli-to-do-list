package tr1fker.managers;

import tr1fker.models.Task;

import java.util.HashSet;
import java.util.Set;

public class TaskManager {
    Set<Task> tasks;

    public void TaskManager(){
        this.tasks = new HashSet<>();
    }
}
