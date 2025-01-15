
class A{
    public char[] marks;
    public void show(){
        System.out.println("In A Show");

    }
    public void config(){
        System.out.println("In A config");
    }
}


class B extends A{
 
    @Override
    public void show(){//i want some changes in show() method so i do overriding in this case.
        System.out.println("In B Show");
    }
}

public class Hello {
    
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        obj.config();
    }
}
