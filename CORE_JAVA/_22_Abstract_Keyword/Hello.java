
abstract class Car{
    public abstract void drive();//abtract idea of car should have decide feature and some subclasses will implement it
    //for abstract method class should we abstract
    public abstract void flly();
    public void playMusic(){
        System.out.println("Play Music");
    }
}
abstract class Wagon extends Car{//Wagon class should implement all the abstract methods that are declare in their superclass Car
    @Override
    public void drive(){
        System.out.println("Driving.....");
    }
    // public void flly(){
    //     System.out.println("Flying.......");
    // }
}
//we can't create an object of abstract class
class UpdateWagon extends Wagon{// CONCREATE CLASS(WE CAN MAKE OBJECT OF CONCREATE CLASS ONLY)
    public void flly(){
        System.out.println("Flying........");
    }
}


public class Hello {
    
    public static void main(String[] args) {
        //We can't create an object of abstract class
        //Car obj=new Car();//error
        //but we can take reference of abstract class
        Car obj=new UpdateWagon();
        obj.drive();
        obj.playMusic();
        obj.flly();
        //is it compulsory to have a abstract method in the abstract class---> no, because abstract class have abstract method, normal method.
        //and for abstract methods we have to make child class in which we have to implement all the abstract method


    }
}

