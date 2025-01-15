interface A{    //bydefault every method in interface are public and abstract. 
    
    //methods---> public , abstract
    //variable---> final, static
    // int age;//it will give error because every variable in interfaces are bydefault final static so we have to initialize the variable while declaring
    int age=21;
    String area="Agra";
    void show();//bydefault every method in interface are public and abstract. 
    void config();
}

//can a class extends multiple interfaces --->yes
//so by the help of interfaces multiple inheritance is possible
interface X{
    void run();
}
interface Y extends X{
}
//class - class----------> extends
//class - interface------> implements
//interface-interface----> extends


class B implements A,Y{
    public void show(){
        System.out.println("In Show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("In Run");
    }

}



public class Hello {
    public static void main(String[] args) {
        // A obj=new A();//cannot instantiate the type A(interface)
        
        B obj=new B();//By A reference i can't execute run() because A has not having any idea regarding run method
        obj.show();
        obj.config();
        obj.run();
        System.out.println(A.area);//we don't need an object because every variable in interfaces are bydefault final and static
        // A.area="Mathura";//cannot assign a value to static final variable area

    }    
}
