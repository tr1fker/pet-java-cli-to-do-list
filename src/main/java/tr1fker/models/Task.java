package tr1fker.models;

public class Task implements Comparable<Task> {
    private int id;
    private String name;
    private Priority priority;
    private String description;
    private Status status;

    public Task(String name, Priority priority, String description, Status status) {
        this.id = 0;
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }
    

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Priority getPriority() {
        return this.priority;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int compareTo(Task task){
        return Integer.compare(this.id, task.id);
    }

    @Override
    public String toString() {
        return  " №:" + this.id + " Название:" + this.name + " Приоритет:" + this.priority.getValue() + " Описание:" + this.description + " Статус:" + this.status.getValue();
    }
}
