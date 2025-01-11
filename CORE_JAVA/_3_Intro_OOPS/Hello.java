//Object Oriented Programming
//Object---> Properties and behaviours
class Calc{
    int num=5;//instance variable(Stored in heap memory)
    //Method Overloading
    public int sum(int num1,int num2) {//num1, num2 are local variable
        // System.out.println(num);//num is stored in heap memory 
        return num1+num2;
    }
    public int sum(int num1,int num2, int num3) {
        return num1+num2;
    }
    public double sum(double num1,int num2) {
        return num1+num2;
    }
    
}
public class Hello {
    public static void main(String[] args) {
        int data=10;
        Calc obj=new Calc();
        obj.num=8;
        Calc obj1=new Calc();
        System.out.println(obj.num);
        System.out.println(obj1.num);//Objects are referenced type(while changing the value of one object it will not change the value of other objects.)
        int r1=obj.sum(4, 5);
        System.out.println(r1);
        
    }
}
