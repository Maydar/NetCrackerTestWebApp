package model;

public class User {
    private String userName;
    private String password;
    private String FIO;
    private String email;
    private String img;


    public User(String userName, String password, String FIO, String email, String img) {

        this.userName = userName;
        this.password = password;
        this.FIO = FIO;
        this.email = email;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
