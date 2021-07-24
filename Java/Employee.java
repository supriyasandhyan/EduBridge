public class Employee
{
protected int salary=50000;
private String name;
public int getSalary()
{
return salary;
}
public String getName()
{
return name;
}
public void setName(String newName)
{
name=newName;
}
public static void main(String args[])
{
Employee emp=new Employee();
emp.setName("Supriya");
System.out.println("Employee name: " +emp.getName());

System.out.println("Employee salary: " +emp.getSalary());
}
}