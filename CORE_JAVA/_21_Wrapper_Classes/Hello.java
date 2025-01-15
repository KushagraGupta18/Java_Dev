


public class Hello {
    
    public static void main(String[] args) {
        
        //Java is not purely object oriented language becuase in java there are primitive data types that are not refer to an object . and for an object oriented language everything should be refer to an object
        //its good because of performance

        int num=7;
        // Integer num1=new Integer(8);//(deprecated)
        //Auto-boxing---> taking a primitive value and storing that in a Wrapper object automatically
        Integer num1=num;
        System.out.println(num1);
        
        //Auto-unboxing---> Getting a value of object type to primitive type automatically
        // int num2=num1.intValue();
        int num2=num1;
        System.out.println(num2);


        String str="12";
        int num3=Integer.parseInt(str);//to convert string into integer
        System.out.println(num3*2);
        //Integer.toString();//to convert integer to string
        

    }
}
