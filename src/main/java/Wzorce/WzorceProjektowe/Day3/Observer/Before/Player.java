package Wzorce.WzorceProjektowe.Day3.Observer.Before;

public class Player {
    private String name;
    private Status status;

    public Player(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
