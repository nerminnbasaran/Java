package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;//IO is more general. IO is parent of FileNotFoundException

public class E04 {
    /*
        When you get exceptions you can handle it but when you get error it means you can do nothing.
        Errors have two parts    i)OutOfMemory
                                 ii)StackOutMemory

        Exceptions have two parts i)RunTimeExceptions
                                  -Arithmetic Exception
                                  -NullPointerException
                                  -NumberFormatException
                                  -ArrayIndexOutOfBoundException
                                  -StringOutOfBoundException
                                  -IllegalArgumentException

                                  ii)CompileTimeExceptions
                                  -FileNotFoundException
                                  -IOException

       1) FileNotFoundException and IOException are CompileTime Exceptions because when we type code we are getting red underlines
       2) FileNotFoundException is related with "file path" and "file existence"
       3) IO Exception is related with all ınput and Output Exceptions
       4) IO Exception is the parent of the FileNotFoundException
          It means if you are IO Exception no need to use FileNotFoundException unless there is no specific requirement
          If you use FileNotFoundException and IOException in multiple catch blocks, FileNotFoundException must be the first because it is child
     */
    public static void main(String[] args) throws IOException {

        readTextFile();

    }

    //Example 1: Create a method to read a text file.

    public static void readTextFile() throws IOException {

            FileInputStream fis = new FileInputStream("src/main/java/day28exceptions/MyText txt");

            int k = 0;

            while((k = fis.read())!=-1){
            System.out.print((char) k);// we use type-casting here for convert ascii value to character

            }

    }


}
