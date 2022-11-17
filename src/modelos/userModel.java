package modelos;

public class userModel {
    //Modelo del usuario para la traida de los datos y creacion del mismo
    private int id;

    private String userName;

    private String userEmail;

    private String userSurname;

    private String userPassword;

    public userModel() {

    }

    public userModel(String userName, String userEmail, String userSurname, String userPassword) {

        this.userName = userName;
        this.userEmail = userEmail;
        this.userSurname = userSurname;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
