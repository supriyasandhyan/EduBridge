import java.util.*;
class DayToSec
{
public static void main(String[] args) 
{		
Scanner scanner = new Scanner(System.in);
System.out.println("Enter days to convert it in seconds: ");
int days = scanner.nextInt();
int sec = days*24*60*60;
System.out.println(sec);
}
}