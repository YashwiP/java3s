//  Base class, Parent class, Super class
class Parent{
    public void method1(){
        System.out.println("Parent class");
    }
}

// Derived class, Child class, Sub class
// By using the extends keyword, the Child class inherits all the attributes and methods of the Parent class.
class Child extends Parent{
    public void method2(){
        System.out.println("Child class");
    }
}


public class Demo{
    public static void main(String[] args){
        // Parent p = new Parent();
        // p.method1();   //accessable
        // p.method2();   //  not-accessable

        // Child c = new Child();
        // c.method1();   //accessable
        // c.method2();   //accessable

    //    Parent p = new Child();
    //    p.method1();    //accessable
    //    p.method2();    //not-accessable
        
        Child c = new Parent();  //conventionally wrong..... not valid




    }
    


}