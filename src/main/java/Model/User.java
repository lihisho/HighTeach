package Model;

import Model.myModel;

import java.util.List;

public class User {
    //region Fields:
    private String userName;
    private String password;
    private String privateName;
    private String lastName;
    private int teacherId;
    //endregion


    public User(String userName, String password, String privateName, String lastName, int teacherId) {
        this.userName = userName;
        this.password = password;
        this.privateName = privateName;
        this.lastName = lastName;
        this.teacherId = teacherId;
    }

    //region Getters&Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    //endregion Getters&Setters


}
