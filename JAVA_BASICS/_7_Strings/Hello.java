package _7_Strings;

public class Hello {
    public static void main(String[] args) {
        String name=new String("kush");
        name=name+"Gupta";
        // System.out.println(name.hashCode());
        System.out.println("Hello"+name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat("Gupta"));
        

        String s1="kush";//created in constant pool
        String s2="kush";//created in constant pool
        System.out.println(s1==s2);//true    
        String s=new String("kush");//created in heap
        System.out.println(s1==s);//false
        String s5="gupta";
        s1=s1+s5;//created in heap
        String s3="kushgupta";
        System.out.println(s1==s3);//false



        //For mutable strings
        //---------String Buffer---------(It is thread safe)
        StringBuffer sb=new StringBuffer("Kush");//convert string to stringbuffer
        System.out.println(sb.capacity());// By default, a string buffer has a 16 character capacity.
        System.out.println(sb.length());
        sb.append(" Gupta");
        System.out.println(sb);
        // String str=sb.toString();//convert string buffer to string
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1,"u");
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb.length());


        //--------String builder------(It is not thread safe)
        //mostly methods are same ass stringbuffer


        


    }
}
