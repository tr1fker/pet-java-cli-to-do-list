package tr1fker.managers;

import tr1fker.models.Priority;
import tr1fker.models.Status;
import tr1fker.models.Task;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskManager {
    Set<Task> tasks;

    public TaskManager(){
        this.tasks = new TreeSet<>();
    }
}
