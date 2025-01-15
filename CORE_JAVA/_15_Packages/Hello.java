import tools.Calc;
import tools.AdvCalc;
import java.util.ArrayList;
import java.lang.*;
//by star all the files available in folder can be use

public class Hello {
    public static void main(String[] args) {
        Calc obj=new Calc();
        AdvCalc obj1=new AdvCalc();
        System.out.println(obj.add(2, 3));
        System.out.println(obj1.mul(2, 3));
        
        //internally java have many classes
        ArrayList list=new ArrayList<>();
        
        
        System.out.println();
        //In above line System is also a class and it is present in the package java.lang.*
        //Every java file is having a bydefault package that is java.lang.* thats why we don't need to import java.lang.* while using of System.out.println() 
        
    }
}
