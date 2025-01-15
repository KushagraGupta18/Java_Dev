//final-----> variable(to make it constant), method(to stop method overiding), class(to stop inheritance)
//by final once you assign the vale you can't change it
//whenever you have value which you dont want to change try to make final


// final class Calc{//Once you make the class final you are stopping to make the inheritance and this class cannot be inherited anywhere
class Calc{
    public final void show(){//for stop method overriding and no one can use our method than we have to make method final
        System.out.println("in Calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{ //The type AdvCalc cannot subclass the final class Calc if the class Calc is final
    // public void show(){//error(Cannot override the final method from Calc)
    //     System.out.println("In AdvCalc");
    // }

}

public class Hello {
    
    public static void main(String[] args) {
        final int num=8;
        // num=9;//error(cannot assign a value to final variable num)
        System.out.println(num);


        // Calc obj=new Calc();
        // obj.show();
        // obj.add(4, 5);


        AdvCalc obj=new AdvCalc();
        obj.show();
        obj.add(4, 5);

    }
}
