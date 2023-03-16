package day29exceptionsmaps;

public class IllegalGradeException extends Exception {//Just  Exception Class will make your class CompileTime Exception

    public IllegalGradeException(String message){

        super(message);//super() is for calling constructor from parent

    }

    public IllegalGradeException(){// when we create our own constructor Java will remove default constructor.but we may need default constructor
        super();
    }


}
