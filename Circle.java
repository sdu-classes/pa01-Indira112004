public class Circle {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double gerArea(){
        return Math.PI* radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circule radius= "+ radius +
             " \nArea = " + gerArea()+
                " \nCircumference = "+ getCircumference();
    }
}
