package model;

/**
 * Created by maydar on 30.05.14.
 */
public class Player {
    private String name;
    private String club;
    private int number;
    private String role;

    public Player(String name, String club, int number, String role) {
        this.name = name;
        this.club = club;
        this.number = number;
        this.role = role;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
