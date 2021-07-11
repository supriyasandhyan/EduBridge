import java.util.*;
public class Reverse
{
public static void main(String args[])
{
int n,rev=0,rem;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Entered number is: " +n);

while(n>0)
{    
   rem=n%10;
   rev=(rev*10)+rem;    
   n=n/10;    
}

System.out.println("its Rev num is: " +rev);


}
}