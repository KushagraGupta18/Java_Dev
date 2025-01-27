
public class Hello {
    public static void main(String[] args) {
        B obj=new B();
        obj.showTheDataWhichBelongsToThisClass();;
    }
}
//Annotations---> @Override, @Deprecated
//we can also create our annotations
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    // public void showTheDataWhichBelongToThisClass(){//this is a bug the class name is not same as in A class . this is the problem arrises during you write the code for this we should give intension to the compiler so that if there is any logical error it will give you error
    //     System.out.println("In B Show");
    // }
    @Override  //Annotation , by this if there is any problem in writting the word it will save us from that
    public void showTheDataWhichBelongsToThisClass(){//this is a bug the class name is not same as in A class . this is the problem arrises during you write the code for this we should give intension to the compiler so that if there is any logical error it will give you error
        System.out.println("In B Show");
    }
}