import java.util.*;
class Marks
{
public static void main(String args[])
{
float Phy, chem, bio, maths, comps;
double percentage, total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of Phy: ");
Phy=sc.nextFloat();
System.out.println("Enter marks of chem: ");
chem=sc.nextFloat();
System.out.println("Enter marks of bio: ");
bio=sc.nextFloat();
System.out.println("Enter marks of maths: ");
maths=sc.nextFloat();
System.out.println("Enter marks of comps: ");
comps=sc.nextFloat();

total= Phy+chem+bio+maths+comps;
percentage=(total/500)*100;
System.out.println("Percentage: " +percentage);

if(percentage>=90)
{
System.out.println("Grade A");
}
else if(percentage>=80)
{
System.out.println("Grade B");
}

else if(percentage>=70)
{
System.out.println("Grade C");
}

else if(percentage>=60)
{
System.out.println("Grade D");
}

else if(percentage>=40)
{
System.out.println("Grade E");
}

else
{
System.out.println("Grade F");
}

}
}