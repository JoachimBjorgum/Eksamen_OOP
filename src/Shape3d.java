public class Shape3d {

    protected double width = 20;
    protected double height = 30;
    protected double radius = 20;

    Shape3d() {
        System.out.println("\tCube, Width: " + getWidth() +
                           ", area: " + areaOfCube(getWidth()) +
                           ", Volume: " + volumeOfCube(getWidth()));
        System.out.println("\tPyramid, Width: " + getWidth() +
                           ", Height: " + getHeight() +
                           ", area: " + areaOfPyramid(getWidth(),getHeight()) +
                           ", Volume: " + volumeOfPyramid(getWidth(),getHeight()));
        System.out.println("\tCylinder, Radius: " + getRadius() +
                           ", Height: " + getHeight() +
                           ", Area: " + areaOfCylinder(getRadius(),getHeight()) +
                           ", Volume: " + volumeOfCylinder(getRadius(),getHeight()));
        System.out.println("\tCone, radius: " + getRadius() +
                           ", Height: " + getHeight() +
                           ", area: " + areaOfCone(getRadius(),getHeight()) +
                           ", Volume: " + volumeOfCone(getRadius(),getHeight()));
        System.out.println("\tSphere, radius: " + getRadius() +
                           ", Area: " + areaOfSphere(getRadius()) +
                           ", Volume: " + volumeOfSphere(getRadius()));
    }

    public double getWidth() {
        return width = 20;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double areaOfCube(double width) {
        return 6 * (Math.pow(width,2));
    }
    public double volumeOfCube(double width) {
        return (Math.pow(width,2)) * width;
    }

    public double areaOfPyramid(double width, double height) {
        double sqrt = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        return (width * width) + (width * sqrt) + (width * sqrt);
    }

    public double volumeOfPyramid(double width, double height) {
        return (Math.pow(width,2) * height) / 3;
    }

    public double areaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volumeOfCylinder(double radius, double height) {
        return Math.PI *Math.pow(radius,2) * height;
    }

    public double areaOfCone(double radius, double height) {
        double length = Math.sqrt(radius * radius + height * height);
        return (Math.PI * Math.pow(radius,2)) + Math.PI * radius * length;
    }

    public double volumeOfCone(double radius, double height) {
        return Math.PI * Math.pow(radius,2) * height/3;
    }

    public double areaOfSphere(double radius) {
        return 4 * Math.PI * Math.pow(radius,2);
    }

    public double volumeOfSphere(double radius) {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }

}
