

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
    public static void show1(Mobile obj1){
        System.out.println("in static method");
        // System.out.println(brand+" "+price+" "+name);//it will give error(we can use static variable inside a non static method but we can't use non static variable inside a static method)
        //we cant access brand in static variable because there is a confusion that brand is associated with which object it means if there are multiple object then which object's  brand it will take
        //for resolving this type of problem we have to pass the partcular object in parameters so that it can understand which object we have to use
        System.out.println(obj1.brand+" "+obj1.price+" "+name);//it will give error(we can use static variable inside a non static method but we can't use non static variable inside a static method)
        
    }
}


public class Hello {
    public static void main(String[] args) {
        //main method is always static because if main method is non-static then we have to make first object of demo and then by that object we will use main method
        
        // Mobile.show();//Cannot make a static reference to the non-static method show() from the type Mobile
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1900;
        Mobile.name="Smartphone";
        
        // Mobile.show1();
        Mobile.show1(obj1);

    }
}