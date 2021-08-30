package OrderingSystem;
import java.util.*;

public class Order1 {
  
  public static Scanner input = new Scanner(System.in);
  public static String again;
  public static int choose, quantity=1;
  public static double total=0, pay;
  
public static void menu(){
	
	System.out.println("\t\t******************************************************************************************************************");
	System.out.println("\t\t**                                     ____                        ___                                          **");
	System.out.println("\t\t** ||           ||    ||              ||                   ||    //   )                                         **");
	System.out.println("\t\t** ||___   ___  ||___ ||___           ||___  ___   ___  ___||   ||       ___        `\\___   ____                **");
	System.out.println("\t\t** ||   | |   | ||   |||   |\\  //     ||    |   | |   ||   ||   ||      |   | ||//` ||  || ||__)) ||//`         **");
	System.out.println("\t\t** ||___| |___| ||___|||___| \\//      ||    |___| |___||___||     \\___/ |___| ||    ||  || \\____  ||            **");
	System.out.println("\t\t**                           //                                                                                 **");
	System.out.println("\t\t**                         _//                                                                                  **");
	System.out.println("\t\t******************************************************************************************************************");	
	
  System.out.println("\t\t\t\t                     _______________________________________");
  System.out.println("\t\t\t\t                    |               MENU CARD               |");
  System.out.println("\t\t\t\t                    |---------------------------------------|");
  System.out.println("\t\t\t\t                    |    ---A.BIRYANINS---                  |");
  System.out.println("\t\t\t\t                    |   1. Chicken Biryani            Rs.210|");
  System.out.println("\t\t\t\t                    |   2. Egg Biryani                Rs.150|");
  System.out.println("\t\t\t\t                    |   3. Veg Biryani                Rs.100|");
  System.out.println("\t\t\t\t                    |                                       |");
  System.out.println("\t\t\t\t                    |    ---B.STARTERS---                   |");
  System.out.println("\t\t\t\t                    |   4. Chicken Crispy             Rs.200|");
  System.out.println("\t\t\t\t                    |   5. Paneer 65                  Rs.190|");
  System.out.println("\t\t\t\t                    |   6. Veg.Manchurian             Rs.150|");
  System.out.println("\t\t\t\t                    |                                       |");
  System.out.println("\t\t\t\t                    |    ---C.BEVERAGES---                  |");
  System.out.println("\t\t\t\t                    |   7. Thums Up                   Rs.45 |");
  System.out.println("\t\t\t\t                    |   8. Diet Coke                  Rs.70 |");
  System.out.println("\t\t\t\t                    |   9. Mineral Water              Rs.30 |");
  System.out.println("\t\t\t\t                    |_______________________________________|");
  }

public static void order(){
  
  System.out.print("ENTER YOUR CHOICE: ");
  choose = input.nextInt();
  
  //conditions
  if(choose==1){
      System.out.println("Chicken Biryani");
      System.out.println("How many plates you want to order?: ");
      quantity =input.nextInt();
      total = total +(quantity*210);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try{
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
          }catch(Exception e){
    	  System.exit(0);
          }finally
      {
       if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
       }else 
          sample();
            	  
      }    
      }
  else if(choose==2){
      System.out.println("Egg Biryani");
      System.out.print("How many plates you want to order?: ");
      quantity =input.nextInt();
      total = total +(quantity*150);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try{
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
          }catch(Exception e){
    	  System.exit(0);
          }finally
      {
    	 if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
         }else 
              sample();
            	  
      }    
      
    }else if(choose==3){
      System.out.println("Veg Biryani");
      System.out.print("How many plates you want to order? :");
      quantity =input.nextInt();
      total = total +(quantity*100);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==4){
      System.out.println("Chicken Crispy");
      System.out.print("How many plates you want to order? :");
      quantity =input.nextInt();
      total = total +(quantity*200);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==5){
      System.out.println("Panner 65");
      System.out.print("How many plates you want to order? :");
      quantity =input.nextInt();
      total = total +(quantity*190);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==6){
      System.out.println("veg manchurian");
      System.out.print("How many plates you want to order? :");
      quantity =input.nextInt();
      total = total +(quantity*150);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==7){
      System.out.println("Thums Up");
      System.out.print("How many Bottles you want? :");
      quantity =input.nextInt();
      total = total +(quantity*45);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==8){
      System.out.println("Diet Coke");
      System.out.print("How many bottles you want? :");
      quantity =input.nextInt();
      total = total +(quantity*70);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose==9){
      System.out.println("Mineral Water");
      System.out.print("How many bottles you want? :");
      quantity =input.nextInt();
      total = total +(quantity*30);
      System.out.println("Bill= " +total);
      
      System.out.println("You want to order more? ");
      again = input.next();
      
      if(again.equalsIgnoreCase("Y")){
          order();//call the method you to create 
      }else if(again.equalsIgnoreCase("N")){
          sample();
      }else
    	  try
      {
    		  System.out.println("Enter Y for yes and N for no");
    		  again = input.next();
      }catch(Exception e)
      {
    	  System.exit(0);
      }
      finally
      {
    	  if(again.equalsIgnoreCase("Y")){
              order();//call the method you to create 
          }else 
              sample();
            	  
      }    
      
  }else if(choose>9){
	  System.out.println("Not Available"); 
	  order();
  }else{
		order();
	   }
  }
public static void sample(){
	
	System.out.println("Make payment: ");
    pay = input.nextDouble();
    
    if(pay <total){
      System.out.println("Not enough payment...Sorry your Order has been Cancelled!");
      System.out.println("PlEASE TRY AGAIN");
      order();
    }else{
    System.out.println("Your Final Bill is: " + total);
    total = pay-total;
    System.out.println("Take change: " + total);
    
    System.out.println("");
    System.out.println("***Thanks For visiting Bobby Food Corner***");
    System.out.println("***Enjoy Your Food***");
}
}     
public static void main(String[] args) 
{
menu();
order();
} 
}

