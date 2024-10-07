package org.example;

public class Main {
    public static void main(String[] args){
        /*
        Если количество символов в поле "login" !=6, то появится исключение
        "The length of the login must have 6 symbols!"

        Если пароли password и confirmPassword будут отличаться, то появться исключение
         "All passwords must be equals!"

         Если все данные верные в косоль выведется сообщение
         "The user is created!"
        */

        Login login = new Login("sysadmin", "qwerty", "qwerty");
        try{
            login.createUser();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}