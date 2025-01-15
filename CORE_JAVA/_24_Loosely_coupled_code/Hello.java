

// abstract class Computer{
interface Computer{
    public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile , run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile , run : fast");
    }
}

class Developer{//developer is loosely coupled he can choose either laptop or desktop
    public void devApp(Computer comp){
        comp.code();
    }
}

public class Hello {
    public static void main(String[] args) {
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer kush=new Developer();
        kush.devApp(lap);
        kush.devApp(desk);

    }    
}
