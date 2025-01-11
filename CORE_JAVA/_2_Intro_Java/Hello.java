package _2_Intro_Java;

public class Hello {
    
    public static void main(String[] args) {
    
        //--------conditional statement
        
        int x=8;
        if(x<10)
            System.out.println("hello");
        else if(x==8)
            System.out.println("bye");
        else
            System.out.println("hii");
        System.out.println("byeee");

        //ternary operator
        x = x%2==0 ? 10:20;
        System.out.println(x);
        
        x = x%2==0 ? x==10?100:200 :20;
        System.out.println(x);
    
        
        //switch statement
        int n=2;// it checks till the case will match with switch and after that print all the values of cases without checking it.(it will execute all the cases after finding out the matching case for this problem we use break statement)
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            System.out.println("enter a valid number");
        }

    
        //-----------loops(while, do while, for)

        int i=5;
        do{
            System.out.println("hello"+i);
            i++;
        }
        while (i<=4);


        for(int j=1;j<=5;j++){
            System.out.println("ello"+j);
        }
        

        int k=1;
        for(;k<=5;){
            System.out.println("hello"+k);
            k++;
        }

    
    
    } 
}
