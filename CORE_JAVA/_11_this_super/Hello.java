
class A extends Object{//by default it extends the Object class without mentioned it//every class in java extends the object class.Object is also class in java which have many methods 
    public A(){
        super();//calling a constructor of the Object class
        System.out.println("In A");
    }
    public A(int n){
        this();
        System.out.println("In A int");
    }
}
class B extends A{
    //Every constructor has a method present there even if we not mentioned that. and that method is super().
    public B(){
        super(5);//by default at every constructor first statement is super even if we not mentioned it.super will run first
        System.out.println("In B");
    }
    public B(int n){
        // super();//it will run bydefault if we not mentioned it. super() means calls the constructor of a super class.
        this();//this() will execute the constructor of same class
        System.out.println("In B int");
    }
}

public class Hello {
    public static void main(String[] args) {
        B obj=new B(5);
        
        //with one object can i execute both the constructor of b. for this we use this() in one constructor so that it will run the other constructor of same class
        


        //------------Convention
        //Java follows the convetion of Camel Casing
        //For class and interface----> Starting with capital letter(Calc,Runable)
        //variable and method--->Starting with small letter(marks,show());
        // constants----> all characters are capital(PIE, BRAND)
        //for combination in words---->  showMyMarks()   //camel casing
        //for combination in class-----> ClassName
        
        //e.g--->
        //age--->variable
        //DATA--->Constant
        //Human()--->constructor(first is capital that represent the className and ()  are represent it is constructor method)
    }
}
