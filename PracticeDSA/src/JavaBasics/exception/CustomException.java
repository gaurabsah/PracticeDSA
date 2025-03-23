package JavaBasics.exception;

/*
if a class is extending Exception then its a checked exception
if a class is extending RuntimeException then its a unchecked exception
 */

public class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}
