package tech.joaovitor.employeemanager.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mesage){
        super(mesage);
    }
}
