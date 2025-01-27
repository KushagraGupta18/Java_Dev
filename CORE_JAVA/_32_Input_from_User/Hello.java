
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Hello {
    public static void main(String[] args) throws IOException {
        

        System.out.println("Enter a number: ");
        //println() is a method of PrintSream class. 
        //For using println() method you first have to create object of PrintStream. 
        //The beauty is object is already created i.e. out. out is a object of PrintStream. 
        //out is a static variable inside a System class thats why we can use directly by dot i.e System.out

        // int num=System.in.read();//it gives the asccii value of the number that you entered
        // System.out.println(num);
        //by this read() method we can get the values only of one character at a time

        //solution for this---> so we have one class BufferedReader that works with package IO

        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf=new BufferedReader(in);
        
        //bufferedreader try to access inputstreamreader the beauty is that it can also take input from the file, network and all the other stuff
        //bufferedreader is actually a resource because when we try to access a file , file is a resource . so we have to close the resources . if we are not doing this it will not give errors but give good practices to close the resources
        
        // int num=Integer.parseInt(bf.readLine());//it gives in string we have to parse it into integer
        // System.out.println(num);

        // bf.close();



        //later on new class is introduced Scanner
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1);

    }
}
