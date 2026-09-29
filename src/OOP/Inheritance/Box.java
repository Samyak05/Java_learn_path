package OOP.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

}
