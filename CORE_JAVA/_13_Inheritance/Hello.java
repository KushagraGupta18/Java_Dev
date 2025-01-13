
class Calc{

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
     

}
class AdvCalc extends Calc{//AdvCalc isA relationship with Calc
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc{
    public double power(int a, int b){
        return Math.pow(a,b);
    } 
}


public class Hello {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(5, 3);
        int r2=obj.sub(5, 3);
        int r3=obj.mul(5, 3);
        int r4=obj.div(15, 3);
        double r5=obj.power(4, 2);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
