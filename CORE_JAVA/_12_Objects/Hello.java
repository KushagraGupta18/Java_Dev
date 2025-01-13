


class A{
    public A(){
        System.out.println("Object is created");
    }
    public void show(){
        System.out.println("In show");
    }
}

public class Hello {
 
    public static void main(String[] args) {
        
        // new A();// anonymous object(there is no reference) problem of this is that we can't reuse them
        //new A().show();

        A obj;//Reference creation(in stack obj is stored)
        obj=new A();//by this line object is created and assigning the value to obj.(first in some address on heap object is created and then obj in stack is point out the address of the object that is created in heap)
        
        
    
    }
}
