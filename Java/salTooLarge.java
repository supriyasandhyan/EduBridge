import java.util.*;
public class salTooLarge
{
public static void main(String[] args)
{

int sal=0,shifts=0;
double sav=0;

Scanner sc=new Scanner(System.in);
System.out.print("Salary: ");
sal = sc.nextInt();
System.out.print("Shifts: ");
shifts = sc.nextInt();

if(sal > 8000)
System.out.println("Salary is too large ");
else if(shifts < 0)
System.out.println("Shifts too small");
else if(sal<0)
System.out.println("Salary too small");
else
{
sav = (sal*0.5)+(sal*0.02*shifts);
System.out.println(sav);
}
}
}