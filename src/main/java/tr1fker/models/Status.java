package tr1fker.models;

public enum Status {
    NEW("Новая"), IN_PROGRESS("В прогрессе"), COMPLETED("Завершена");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(Status status){
        this.status = status.getStatus();
    }
}
