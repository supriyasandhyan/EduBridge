import java.util.*;
class Prime
{ 
public static void main(String argd[])
{
int n, r;
boolean isPrime=false;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
r=n/2;
for(int i=2; i<=r; i++) 
{
if (n%i == 0)
{
isPrime=true;
break;
}
}
if (!isPrime)
{
System.out.println("prime number");
}
else
{
System.out.println("is not prime number");
}
}
}
