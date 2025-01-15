

class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class Hello {
    public static void main(String[] args) {
        
        // A obj=new A();
        // obj.show1();
        
        
        // A obj=(A) new B(); //upcasting(upcast the child reference to parent reference)
        // obj.show1();


        A obj=new B();
        B obj1= (B) obj;//downcasting(downcast the parent reference to child reference)
        obj1.show2();

        


    }  
}
