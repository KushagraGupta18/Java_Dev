

class A{

    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{

    public void show(){
        System.out.println("In B Show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C Show");
    }
}


public class Hello {
    
    public static void main(String[] args) {
        
        // B obj=new B();
        A obj=new B();//reference of A and object of B(obj type is A and the implementation is done by B)
        //we can mention the type as parent and object as the child but the vice versa of this is not possible
        //reference of a super class and object of the subclass
        obj.show();
        
        
        
        //Run time polymorphism /    Dynamic Method Dispatch(which method it will call we are not sure)
        A obj1=new A();
        obj1.show();//in A Show
        obj1=new B();
        obj1.show();//in B Show
        obj=new C();
        obj.show();//in C Show
        //Irrespective of what type of reference you have it only depends on the what object you have it will run that method which is present in that object

        // B obj=new A();//gives error(cannot convert from A to B)

    }
}
