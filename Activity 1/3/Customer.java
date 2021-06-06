import java.util.*;
public class Customer 
{
private string name;
private string address;
private string mobile;

public void getInput()
{
Scanner in = new Scanner (System.in);
System.out.print(“Enter the name:”);
name=in.next();
System.out.print(“Enter the address:”);
address=in.next();
System.out.print(“Enter the mobile:”);
mobile=in.next();
}

public void display()
{
System.out.println(“Enter the  Details”);
System.out.println(“Name: ” +name);
System.out.println(“Adress : ” +address);
System.out.println(“Mobile: ” +mobile);
}
}