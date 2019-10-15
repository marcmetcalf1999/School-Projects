import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        DecimalFormat df = new DecimalFormat("#.##");

        Octagon o = new Octagon();
        o.setSide(4.0);
        Octagon o2 = (Octagon) o.clone();
        Octagon o3 = new Octagon();
        o3.setSide(5.0);

        System.out.println("Octagon 1: Side Length: " +o.getSide() + "Area: " + df.format(o.getArea()) + "Perimeter: " + o.getPerimeter());
        System.out.println("Octagon 2: Side Length: " +o2.getSide() + "Area: " + df.format(o2.getArea()) + "Perimeter: " + o2.getPerimeter());
        System.out.println("Octagon 3: Side Length: " +o3.getSide() + "Area: " + df.format(o3.getArea()) + "Perimeter: " + o3.getPerimeter());

        System.out.println("Comapring Octogons 1 and 2");
        if(o.compareTo(o2) == 1)
            System.out.println("The two Octogons are the same");
        else
            System.out.println("The two Octogons are different");
        System.out.println("Comparing Octogons 1 and 3");
        if(o.compareTo(o3) == 1)
            System.out.println("The two Octogons are the same");
        else
            System.out.println("The two Octogons are different");





    }
}
