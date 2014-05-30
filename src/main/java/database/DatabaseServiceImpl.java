package database;

import model.Player;
import model.User;

import java.util.ArrayList;
import java.util.List;


public class DatabaseServiceImpl implements DatabaseService {
    private List<Player> players = new ArrayList<Player>(){{
        add(new Player("Diego Сosta", "Atletico", 19, "Attacker"));
        add(new Player("David Villa", "Atletico", 9, "Attack1er"));
        add(new Player("Koke", "Atletico", 6, "Half back"));
        add(new Player("Arda Turan", "Atletico", 10, "Half back"));
        add(new Player("Gabi", "Atletico", 14, "Half back"));
        add(new Player("Raul Garcia", "Atletico", 8, "Half back"));
        add(new Player("Juanfran", "Atletico", 20, "Defender"));
        add(new Player("Miranda", "Atletico", 23, "Defender"));
        add(new Player("Godin", "Atletico", 2, "Defender"));
        add(new Player("Luis Fillipe", "Atletico", 3, "Defender"));
        add(new Player("Courtois", "Atletico", 13, "GoalKeeper"));
    }};

    private List<User> users = new ArrayList<User>() { {
        add(new User("maxwell", "velos", "Maidary Erdyneev", "fra@gmail.com", "webapp/img/Erdyneev.jpg"));
        add(new User("pavlov", "1234", "Maxim Pavlov", "baresco@gmail.com", "webapp/img/bar.jpg"));
    }};


    @Override
    public String addUser(String userName, String password, String FIO, String email, String img) {
        if (!findUser(userName, password)) {
            users.add(new User(userName, password, FIO, email, img));
            return "Added Successfuly";
        }
        else {
            return "Such user exists";
        }

    }

    @Override
    public boolean findUser(String userName, String password) {
        boolean result = true;
        System.out.println(userName);
        System.out.println(password);
        System.out.println("Seatching....");
        for(User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("name is ok");
                System.out.println(user.getPassword());
                if (user.getPassword().equals(password)) {
                    result = true;
                } else {
                    result = false;
                }
            }
            else {
                result = false;
            }
        }
        return result;
    }

    @Override
    public User getUser(String userName, String Password) {
        User result = null;
        for(User user : users) {
            if (user.getUserName().equals(userName)) {
                if (user.getPassword().equals(Password)) {
                    result = user;
                } else {
                    result = null;
                }
            }
            else {
                result = null;
            }
        }
        return result;
    }

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public String addPlayer(String name, String club, int number, String role) {
        players.add(new Player(name, club, number, role));
        return "Added successfuly";
    }
}
