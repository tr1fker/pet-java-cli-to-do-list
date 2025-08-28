package tr1fker.models;

public enum Priority {
    LOW("низкая"), MEDIUM("средняя"), HIGH("высокая");

    private String value;

    Priority(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(Priority priority){
        this.value = priority.getValue();
    }
}
