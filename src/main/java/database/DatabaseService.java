package database;
import model.Player;
import model.User;

import java.util.ArrayList;
import java.util.List;


public interface DatabaseService {
    public String addUser(String userName, String password, String FIO, String email, String img);

    public boolean findUser(String userName, String password);

    public List<Player> getPlayers();
    public List<User> getUsers();

    public User getUser(String userName, String Password);


    public String addPlayer(String name, String club, int number, String role);
}
