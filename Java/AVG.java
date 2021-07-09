import java.util.*;
class AVG
{   
public static void main(String[] args)  
{  
int a, b, c, d, e, sum, avg;   
Scanner sc = new Scanner(System.in);  
   
System.out.println("Enter the value of a: ");  
a=sc.nextInt();  
      
System.out.println("Enter the value of b: ");  
b=sc.nextInt();  

System.out.println("Enter the value of c: ");  
c=sc.nextInt();  

System.out.println("Enter the value of d: ");  
d=sc.nextInt();  

System.out.println("Enter the value of e: ");  
e=sc.nextInt();  

sum=a+b+c+d+e;
System.out.println("sum of number is: " +sum);

avg=sum/5;
System.out.println("Average of number is: " +avg);
             
}   
                  
}    
  