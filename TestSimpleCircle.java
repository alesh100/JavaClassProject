public class TestSimpleCircle {
    public static void main(String [] args){
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("the area of the radius " + circle1.radius +
                " and the area " + circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("the area of the radius " + circle2.radius +
                " and the area " + circle2.getArea());
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("the area of the radius " + circle3.radius +
                " and the area " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("the area of the radius " + circle2.radius +
                " and the area " + circle2.getArea());
    }
}

class SimpleCircle{
    double radius;

    SimpleCircle(){
        radius = 1;
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
     double getArea(){
         return  radius * radius * Math.PI;
     }
    double getPerimeter(){
        return  2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
