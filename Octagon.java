public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable
{
    private double side;
    @Override protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public double getArea()
    {
        double rtn = (2 + 4/(Math.sqrt(2)))*side*side;
        return rtn;
    }

    @Override
    public int compareTo(Octagon o)
    {
        if(o.getSide() == side && o.getArea() == getArea() && o.getPerimeter() == getPerimeter())
            return 1;
        else
            return 0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter()
    {
        return 8*side;
    }
}
