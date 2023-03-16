package day27enumexception;

public class E01 {
    /*
        1)Exception means "un-expected issue" in coding
        2)When we have Exception we have two ways
            i)We can handle the Exception by using "try-catch block"
            ii)We "Throw Exception" and block the application
        3)We handle the Exception mostly, if you do not handle the Exception
            i)Exception will be stooped
            ii)Application will be blocked
     */

    public static void main(String[] args) {

        System.out.println("divide(6,5) = " + divide(6, 5));//NoException
        System.out.println("divide(0,5) = " + divide(0, 5));//NoException
        System.out.println("divide(6,0) = " + divide(6, 0));//ArithmeticExceptions Create breakpoint: / by zero

        System.out.println("Hi this is me!");//that code will not be executed. because of that when your code has an issue you have to fix it
                                            //divide(6,0) throw ArithmeticException that is why this code cannot be executed
                                            //When you break any mathematical rule like dividing by zero, java throws "ArrayIndexOutOfBoundException
        System.out.println("divide2(8,0) = " + divide2(8, 0));//"Do not use zero divisor..."
    }

    //Example 1: Create a method divide two integers

    //1.Way: Use if-else but using if-else is not recommended
    public static int divide(int a, int b){
       if(b==0){        //we fix the issue with if statement
           return 0;
       }else{
           return a/b;
       }

    }

    //2.Way:Use try-catch

    public static int divide2(int a,int b){

        int result = 0;

        try{
           result = a/b;
        }catch(ArithmeticException e){//"catch block" executed just for Exceptions, if "try block" does not throw any Exception
                                    //"catch block" will not be executed.
            System.out.println("Do not use zero divisor...");
        }
        return result;

    }
}








