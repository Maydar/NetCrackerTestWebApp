package beans;

import database.DatabaseService;
import database.DatabaseServiceImpl;
import model.Player;
import model.User;
import sun.rmi.runtime.Log;

import java.util.List;


public class LoginBean {
    private DatabaseService db = new DatabaseServiceImpl();
    private User user = new User("eric", "atl", "dsad", "dsadas", null);

    public void setPassword(String password) {
        this.user.setPassword(password);
    }


    public void setUserName(String userName) {
        this.user.setUserName(userName);
    }

    public boolean validate() {
       System.out.println(db.findUser(user.getUserName(), user.getPassword()));
       if (db.findUser(user.getUserName(), user.getPassword())) {

           user = db.getUser(user.getUserName(), user.getPassword());
           return true;
       }
       else {

           return false;
       }
    }


    public String getImg() {
        return this.user.getImg();
    }

    public String getEmail() {
        return this.user.getEmail();
    }

    public void setEmail(String email) {
        this.user.setEmail(email);
    }

    public String getFIO() {
        return this.user.getFIO();
    }

    public void setFIO(String FIO) {
        this.user.setFIO(FIO);
    }

    public String getPassword() {
        return this.user.getPassword();
    }



    public String getUserName() {
        return user.getUserName();
    }

    public void setImg(String img) {
        this.user.setImg(img);
    }
}
