//ENCAPSULATION
//binding our data with the methods so that no one from the outside the world use the data directly.
class Human{
    private int age;//by private variable the age is only accessed within the class
    private String name;
   
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
        Human obj=new Human();
        // obj.age=21;
        // obj.name="kush";
        // System.out.println(obj.name);
        obj.setAge(21);
        obj.setName("kush");
        System.out.println(obj.getName()+" "+obj.getAge());



    }
}
