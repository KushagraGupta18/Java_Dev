
public class Hello {
    public static void main(String[] args) {
        A obj=new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}


class A{
    //throws =--> it is used for ducking the exception that means the particular method is not responsible for the exception handling. it throws the exception to whom this method calls
    public void show() throws ClassNotFoundException{
        // try{
        //     Class.forName("Calc");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Not able to find the class");
        // }

        //if i dont want to handle the exception by removing try catch block by this this method is not responsible for the exception
        Class.forName("Calc");
    }
}
class Demo{
    static{
        System.out.println("Class Loaded");
    }
}