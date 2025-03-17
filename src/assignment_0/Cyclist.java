package assignment_0;

public class Cyclist {

    public Cyclist() {
    }

    public Cyclist(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;
    private String team;
    private int jerseyNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
