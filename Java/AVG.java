import java.util.*;  
public class AVG {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  F, avg, sum=0;   
      Scanner sc = new Scanner(System.in);     
      System.out.println("Numbers: ");  
      n = sc.nextInt();  
      while (count <= n)   
             {   
                  System.out.println("Enter the "+count+" number: ");  
                  F = sc.nextInt();  
                  sum += F;   
                  ++count;   
             }   
                  avg = sum/n;   
        System.out.println("The Average is: " +avg);  
    }    
}  
