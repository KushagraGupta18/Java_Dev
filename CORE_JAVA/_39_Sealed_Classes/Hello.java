

public class Hello {
    public static void main(String[] args) {
        //Sealed Classes---> Which are the subclasses/subinterface which can inherit from this particular class/interface and we can do with the help of sealed keyword

        //Idea is if you want to restrict the subclasses for the particular classes you make it sealed.

    }
}
// sealed class A extends Thread implements Clonable permits B,C {} //permits always comes in last after implements
sealed class A permits B,C {//it normally permit some other classes to extends the class A
                            //classes that we permit should be either final, sealed or non sealed class

}

final class B extends A{

}

sealed class C extends A permits E{

}


// class D extends A{//error(The class D cannot extend the class A as it is not a permitted subtype of A)

// }

non-sealed class E extends C{//we can make subclasses non-sealed that can be extended by any other classes
    
}

// sealed interface X permits Y{

// }
// sealed interface Y extends X{//we cannot make interface as a final so there are only two option sealed and non-sealed

// }