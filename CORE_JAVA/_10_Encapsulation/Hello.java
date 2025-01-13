//ENCAPSULATION
//binding our data with the methods so that no one from the outside the world use the data directly.
class Human{
    private int age;//by private variable the age is only accessed within the class
    private String name;

    //Constructor//name of constructor should be same as class name
    public Human(){//default constructor//if we do not write this constructor it will run behind the scene while making an object
        // System.out.println("In Constructor");
        age=12;
        name="John";
    }

   
    public Human(int age, String name) {//parameterised constructor
        this.age=age;
        this.name=name;
    }
    
    
    //getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // age=age;//we cant decide on left side which age it is?
        //and age will print zero if we print the age
        //preference is given to local variable so left hand side age is a local variable age not a instance variable age


        //in order to remove this problem we use this keyword
        //this is a keyword which represent the current object . current object means the object which is calling the method.
        this.age = age; // age on left side is instance variable and on right side it is local variable
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
    
    
public class Hello {
    
    public static void main(String[] args) {
        Human obj=new Human(21,"kush");//everytime when we create the new object constructor will be called.
    // System.out.println(obj.getName()+" "+obj.getAge());  //null 0
    
    // obj.setAge(21);
    // obj.setName("kush");
    System.out.println(obj.getName()+" "+obj.getAge());
    }
}
