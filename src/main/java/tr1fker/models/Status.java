package tr1fker.models;

public enum Status {
    NEW("Новая"), IN_PROGRESS("В прогрессе"), COMPLETED("Завершена");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getValue() {
        return this.status;
    }

    public void setValue(Status status){
        this.status = status.getValue();
    }
}
