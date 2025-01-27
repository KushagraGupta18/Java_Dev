import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws IOException{
        
        int i=0;
        // int j=8/i;//critical statement because if the value of i is 0 then it will give error
        int j=0;
        int[] nums= new int[5];
        try{
            j=18/i;//this line throws an error from this line my code will not run and throws an exception that is catch by catch block
            j=9;
        }
        catch(Exception e){//Exception is the class and whenever try catch through the exceptions it is throughing you an object and you are catch that as an Exception class
            j=10;
            System.out.println("Something Went Wrong. "+e);
        }
        System.out.println(j);
        System.out.println("Bye");



        String str=null;
        i=2;
        j=0;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){//Exception is the class and whenever try catch through the exceptions it is throughing you an object and you are catch that as an Exception class
            
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch(NullPointerException e){
            System.out.println("Give the values");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
        

        int a=0;
        int b=0;
        try{
            b=18/a;
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{//irrespective if you got the exception or not . finally block is always executed.
            System.out.println("Bye");
        }


        //below code is done after the _32_infut_from_User file
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=0;
        try{  
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{//Whenever you want to close the connection or resources always use finally block . Finally block is used to close the resource it will be either file, network, connection or any other resources
            br.close();
        }


        //try with resources
        //we can also remove finally in this because once the try gets over , resource will be close automatically
        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){  
            num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }

    }
}
