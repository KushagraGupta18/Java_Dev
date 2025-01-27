


public class Hello {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            //Throw--->throw keyword is used to throw the Exception and the catch block is catching the exception 
            if(j==0){
                // throw new ArithmeticException("I don't want to print zero");
                
                //if we want to create our own exception
                throw new MyException("I don't want to print zero");
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("Thats the default output.  "+e);
        }
        catch(MyException e){
            j=18/1;
            System.out.println("Thats myException. "+e);
        }
        catch(Exception e){
            System.out.println("Something Went Wrong. "+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }    
}
class MyException extends Exception{//extends RuntimeException
    public MyException(String string){
        super(string);//even exception has a constructor which accepts string and for calling constructor of exception we have to call the super class constructor
    }
}