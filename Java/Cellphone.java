public class Cellphone
{
void ring()
{
System.out.println("ringing...");
}
void vibrate()
{
System.out.println("vibrating...");
}
public static void main(String args[])
{
Cellphone cp=new Cellphone();
cp.ring();
cp.vibrate();
}
}