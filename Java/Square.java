public class Square
{
int side=3;
void Area()
{
int area=this.side*this.side;
System.out.println("Area of Square: "+area);
}
void perimeter()
{
int peri=4*this.side;
System.out.println("Perimeter of Square: "+peri);
}
public static void main(String args[])
{
Square s=new Square();
s.Area();
s.perimeter();
}
}
