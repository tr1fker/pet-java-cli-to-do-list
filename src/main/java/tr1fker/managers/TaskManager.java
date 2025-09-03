package tr1fker.managers;

import tr1fker.models.Task;
import tr1fker.repositories.TaskStorage;

import java.util.Set;
import java.util.TreeSet;

public class TaskManager {
    private Set<Task> tasks;
    private int maxId;

    private TaskStorage taskStorage;

    public TaskManager(TaskStorage taskStorage){
        this.tasks = new TreeSet<>();
        this.maxId = 0;
        this.taskStorage = taskStorage;
    }

    public void add(Task task){
        task.setId(++maxId);
        this.tasks.add(task);
    }

    public Set<Task> getTasks(){
        return this.tasks;
    }

    public Task getTask(int id){
        return this.tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }

    public Task getTask(String name){
        return this.tasks.stream().filter(task -> task.getName().equals(name)).findFirst().orElse(null);
    }

    public void putTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(int id){
        this.tasks.removeIf(task -> task.getId() == id);
    }

    public void loadTasks(){
        this.tasks = this.taskStorage.loadTasks();
        for(Task task : this.tasks){
            task.setId(++this.maxId);
        }
    }

    public void saveTasks(){
        this.taskStorage.saveTasks(this.tasks);
    }
}
