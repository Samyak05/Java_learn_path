package OOP.Interfaces;

public class Main {
    static void main() {

        // 1. Creating separate child class and implementing the Interface
        // Here if we want to create another object we have to create another child class too with separate implementation
        MyInter obj = new ChildOfMyInter();
        obj.sayHello();


        // 2. Implementing the interface without creating a child class
        // Here we don't have to create another child classes, we provide implementation here only
        MyInter i = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("First Implementation");
            }
        };
        i.sayHello();

        // Another Implementation
        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("Another Implementation");
            }
        };
        i2.sayHello();


        // 3. Using Lambda Expression
        MyInter i3 = ()->{
            System.out.println("First Lambda");
        };

        MyInter i4 = ()->{
            System.out.println("Second Lambda");
        };

        i3.sayHello();
        i4.sayHello();
    }
}
