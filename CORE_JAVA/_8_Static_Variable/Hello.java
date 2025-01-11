
class Mobile{
    String brand;//instance variable
    int price;
    static String name;//class member not a object member //by making static it is common to all the objects.  static variable are directly associated with the class. if we do changes in one object in the static variable it will change the value of static variable in all the object
    
    
    public Mobile(){
        brand="";
        price=2000;
        System.out.println("In constructor");
    }


    //CLASS LOADS AND OBJECTS ARE INSTANTIATED
    //class loader is the memory in jvm
    //static block run when our class is loads so it is run only once
    //static block always run first before constructor
    static{//static block (we can initialize the static variable) because static block will be called only once irrespective how many times you have made an object.
        name="Phone";
        System.out.println("In static block");//if we make an object it calls the constructor every time while creating the object but static block always run one time only once.
    }
    
    public void show(){//in non static methods we can use static variables there is no harm in that. but in static method we cant use non instance variables in static method.
        System.out.println(this.brand+" "+ this.price+" "+name);
    }
}


public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {

        //if we dont want to make any objects and want to run static block then we have to use 'Class' class that is available in java
        // Class.forName("Mobile");//for run only static block from any class

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        // obj1.name="Iphone15";//for static variables we have to use directly with class name otherwise it will give warning like in this line

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        // obj2.name="Samsung S23";//if name is static it will change the name of objects in all the previous ones.
        
        obj1.show();
        obj2.show();
        

    }
}
