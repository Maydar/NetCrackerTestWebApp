package beans;

import database.DatabaseService;
import database.DatabaseServiceImpl;
import model.Player;

import java.util.List;


public class PlayerBean {
    private DatabaseService db = new DatabaseServiceImpl();
    private List<Player> players;


    public  PlayerBean() {
        players = db.getPlayers();
    }

    public Player getPlayer(String name , int number) {
       Player result = null;
       for (Player player: players) {
           System.out.println(player.getName());
           System.out.println(player.getNumber());
           if (player.getName().equals(name) && player.getNumber() == number) {
               result = player;
           }
       }
       return result;
    }

    public List<Player> getAllPlayers() {
        return players;
    }
}
