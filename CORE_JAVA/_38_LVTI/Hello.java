
//LVTI--->Local Variable Type Inference(it is applicable only for local variable)

public class Hello {
    // var num=10;//var can allowed only in local 
    public static void main(String[] args) {
        var a=10;//from java version 10 we can use an element without taking a type
        // a="kush"; //it will give error because while initializing the value it will assing a particular datatype to a variable
        System.out.println(a);

        int c;//no error
        // var d;//error(cannot infer type for local variable d)
        //for var keyword assigning the value is compulsory while declaring the variable

        
        
        // int[] nums=new int[10];
        var nums=new int[10];
        

        // Alien obj=new Alien();
        // var obj=new Alien();








    }
}
