import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
        int nums[]={3,7,2,4};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        nums[1]=6;
        System.out.println(nums[1]);

        int [] num=new int[4];
        num[0]=4;
        num[1]=8;
        num[2]=3;
        num[3]=9;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("----------------");

        //random values
        int temp=(int)(Math.random()*100);


        //2d arrays
        int[][] arr=new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] a=new int[3][];//jagged array
        a[0]=new int[2];
        a[1]=new int[3];
        a[2]=new int[4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //for each loop
        for(int[] n:arr){
            for(int val:n){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        //drawbacks of array
        int [] numm=new int[4];
        //Arrays are stroed in heap and it takes the space in heap continuously.
        //Size of array cant be change in future if we want to expand the array we can't.
        //everytime for searching the element we have to traverse the full array.
        //we can't put different data type element in one array.
         
        
    }
}
