public class TestCircleWithPrivateDataFields {
    public static  void main (String [] args){
        CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(5.0);
        System.out.println("the area of te circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("the area of te circle of radius " + myCircle.getRadius() +
                " is " + myCircle.getArea());

        System.out.println("The number of object created is " + CircleWithPrivateDataField.getNumberOfObject() );

    }
}
