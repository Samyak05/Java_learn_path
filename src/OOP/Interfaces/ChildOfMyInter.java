package OOP.Interfaces;

public class ChildOfMyInter implements MyInter{

    @Override
    public void sayHello() {
        System.out.println("This is child class of MyInter");
    }
}
