public class SodaCan {

    private double height;
    private double radius;

    public SodaCan(double heights, double diameters) {

        height = heights;
        radius = diameters / 2;
    }

    public double getVolume() {


        return (Math.PI * (radius) * (radius * height));
    }

    public double getSurfaceArea()  {

        return (2 * Math.PI * (radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
    }


}
