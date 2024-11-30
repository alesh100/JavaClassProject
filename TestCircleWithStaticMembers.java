public class TestCircleWithStaticMembers {
    public static void main (String [] args){
        System.out.println("before creating object ");
        System.out.println("the number of circle object is "
                + CircleWithStaticMembers.numberOfObject);
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("\n after creating c1");
        System.out.println("c1 radius: " + c1.radius + " number of object " +
                c1.numberOfObject);

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        System.out.println("\n after modifying c1");
        System.out.println("c1 radius: " + c1.radius + " number of object " +
                c1.numberOfObject);
        System.out.println("c2 radius: " + c2.radius + " number of object " +
                c2.numberOfObject);


    }
}
class CircleWithStaticMembers{
    double radius;
    static  int numberOfObject = 0;

    CircleWithStaticMembers(){
        radius = 1;
        numberOfObject++;
    }
CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObject++;
}

static int getNumberOfObject(){
        return numberOfObject;
}
double getArea(){
        return  radius * radius * Math.PI;
}
}