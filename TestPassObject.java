public class TestPassObject {
    public static void main(String [] args){
        CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(1);
        int n = 5;
        printArea(myCircle, n);
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printArea(CircleWithPrivateDataField c, int times){
        System.out.println("Radius \t\t Area");
        while(times >= 1){
            System.out.println((c.getRadius() + "\t\t" + c.getArea()));
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
