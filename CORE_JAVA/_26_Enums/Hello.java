
public class Hello {

    public static void main(String[] args) {
       
        Status s=Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());//print the index of status 

        Status[] ss=Status.values();//Status.values() gives an array so we have to store in array
        for(Status item:ss){
            System.out.println(item+" "+item.ordinal());
        }

        Status s1=Status.Pending;
        if(s1==Status.Running)
            System.out.println("All Good");
        else if(s1==Status.Failed)
            System.out.println("Try Again");
        else if(s1==Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
        
        
        switch(s1){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;    
        }

        //bydefault in enum in java extends the enum class
        System.out.println(s1.getClass().getSuperclass());//class java.lang.Enum
        //when we write s1. it gives many extra methods that are available in Enum class
 
    
        
        // Laptop lap=Laptop.Macbook;
        // System.out.println(lap);
        // System.out.println(lap.getPrice());

        for(Laptop lap1:Laptop.values()){
            lap1.setPrice(lap1.getPrice()+100); 
            System.out.println(lap1+" "+ lap1.getPrice());
        }

        
    }
}
//enum is a class // but we can't extend any other class in enums
enum Status{//we can define all the constant status in enums
    Running, Failed, Pending, Success;//inbuild//we are making and calling an object inside the class
    //Status is a class here and all these 4 words Running, Failed, Pending, Success are objects
}


enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad;
    private int price;

    private Laptop(){//for Thinkpad laptop there is no price given in parameter so we have to make default constructor so that it can give values bydefault and not given any error
        this.price=500;
        System.out.println("Default constructor  "+this.name());
    }
    //As macbook,  XPS, Surface, Thinkpad are objects they will call the constructor 4 times, 1 times default constructor and 3 times parameterized constructor will call.
    private Laptop(int price) {
        this.price = price;
        System.out.println("Parameterized constructor  "+this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }    
}