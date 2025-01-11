class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
        
        int num1=10;
        int num2=20;
        int result=num1+num2;
        System.out.println(result);
        
        //-------datatype-----------------
        int num=100;

        // byte by=129;//error
        byte by=127;
        System.out.println(by);
        
        long l=876663l;
        System.out.println(l);

        float f=5.8f;
        double d=5.8;

        char c='k';

        boolean b=true;



        //------------------literals(values are literal e.g. 8, 9 , 0x7E, 10_00, ob101)
        int x=9;//decimal
        int x1=0b101;//binary
        int x2=0x7E;//hexadecimal
        int x3=100_00_00_00;
        System.out.println(x3);

        double y=56;
        double z=12e10;//very big number
        System.out.println(z);

        //boolean c=1;//error

        char ch='a';
        System.out.println(ch);
        //ch=ch+1; //error
        // ch=(char)(ch+1);//it works
        ch++;//it directly changes a to b without typecasting
        System.out.println(ch);


        //---------------type casting
        int h=129;// -128 to 127 total=> 256 so for first 128 it will be from 0 to 127 then for next 128 it will be from -128 to -1
        //int h=257; //1  // for this first take mod by 256 then check for same if it is from 0 to 127 then value will be same and next 128 values will be negative from -128 to -1
        //int h=383;// 127
        //int h=384;// -128
        byte k=(byte)h;
        System.out.println(k);

        float fl=5.6f;
        int xx=(int)fl;
        System.out.println(xx);


        //----------type promotion(implicit type casting)
        byte aa=10;
        byte bb=30;
        int result1=aa*bb;// it directly type cast from byte to int
        System.out.println(result1);



        //-------------operators( +, -, *, /, %, +=, -=, *=, /=, ++, --, <, >, <=, >=, ==, =, !=,  &&, ||, !, &, | )
        int nn=1;
        int mm=2;
        mm+=1;
        nn++;
        int rr=nn+mm;
        System.out.println(rr);

        int nnn=1;
        int p1=nnn++;//post increment(fetch the value and then increment it)
        int p2=++nnn;//pre increment(first increment it and then fetch the value)
        System.out.println(p1);
        System.out.println(p2);

        

        


    }
}