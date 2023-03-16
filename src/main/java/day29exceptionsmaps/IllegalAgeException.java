package day29exceptionsmaps;

public class IllegalAgeException extends RuntimeException {

    public IllegalAgeException(String message){//If you want use the constructor with a message, or if you want use the constructor without message
        super(message);
    }

    public IllegalAgeException(){
        super();
    }


}
