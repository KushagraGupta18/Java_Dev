

class Laptop{
    String model;
    int price;

    //while printing object i want the material according to my condtion so i have to override toString() method

    public String toString(){
        return model+" : "+price;
    }
    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price==that.price?true:false;
    }
}
public class Hello {
    public static void main(String[] args) {
        
        //every class in java extends the object class
        Laptop obj=new Laptop();
        obj.model="Lenovo Yoga";
        obj.price=1000;
        System.out.println(obj);//Laptop@38364841
        System.out.println(obj.toString());//everytime yo print the object bydefault it will run toString() method
        //while printing object it return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //toString() method is present in Object class

        Laptop obj2=new Laptop();
        obj2.model="Lenovo Yoga";
        obj2.price=1000;
        boolean result= obj==obj2;
        System.out.println(result);//false

        boolean res=obj.equals(obj2);
        // System.out.println(res);//false
        //by .equals() it checks the hexadecimal value and it is not same for checking of an value in objects we have to override the method .equals()

        System.out.println(res);//true

    }
}
