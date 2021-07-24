public class Cylinder
{
private double height;
double radius;

public double getHeight()
{
return height;
}
public double getRadius()
{
return radius;
}
public void setHeight(double value)
{
height=value;
}
public void setRadius(double value)
{
radius=value;
}
public static void main(String args[])
{
Cylinder c=new Cylinder();
c.setHeight(3.2);
c.setRadius(4.2);
System.out.println("Height of Cylinder: " +c.getHeight());
System.out.println("Radius of Cylinder: " +c.getRadius());
}
}









