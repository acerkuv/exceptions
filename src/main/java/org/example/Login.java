package org.example;

public class Login{
    public String login;
    public String password;
    public String confirmPassword;

    Login(String login,String password, String confirmPassword){
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public void createUser() throws WrongPasswordException, WrongLoginException{

        if (login.length()!= 6) throw new WrongLoginException();
        if (!password.equals(confirmPassword)) throw new WrongPasswordException();

        else System.out.println("The user is created!");
    }


}
