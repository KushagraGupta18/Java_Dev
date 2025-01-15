
import other.*;

class C extends A{
    
    public void abc(){
        System.out.println(num);//num can be accessed here because it is subclass of C class and num is made by protected access modifiers
    }
}

public class Hello{
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.marks);
        obj.show();

        B obj1=new B();
        System.out.println(obj1.marks);//we can access marks from obj1 because it is in same package
        //public---> it can be accessed from anywhere
        //private---> it can be accessed from the same class we can't access that variable or method from outside the class.
        //default---> it can be accessed from the same package only
        //protected---> it can be accessed from the same package and it can be accessed from the subclasseses of same package or other packages
        

        // System.out.println(obj1.age);//giving error because age variable is of private and it can be accessed from the same class

        C obj2=new C();
        obj2.abc();
    }
}