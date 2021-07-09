import java.util.*;
public class Interest 
{  
public static void main (String args[])  
{   
float p, r,  t,  si; 
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principle Amount: ");
p=sc.nextFloat(); 
System.out.println("Enter rate: ");
r=sc.nextFloat();
System.out.println("Enter Time period: ");
t=sc.nextFloat();
si  = (p*r*t)/100;   
System.out.println("Simple Interest is: " +si);  
}
}