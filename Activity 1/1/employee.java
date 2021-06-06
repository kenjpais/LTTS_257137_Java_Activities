import java.util.*

public class employee
{
private string name;
private string address;
private string mobile;
public void getInput()
{
Scanner in = new Scanner (System.in);
System.out.print(“Enter the name:”);
this.name=in.next();
System.out.print(“Enter the address:”);
this.address=in.next();
System.out.print(“Enter the mobile:”);
this.mobile=in.next();
}
public void display()
{
System.out.println(“Employee Details”);
System.out.println(“Name=” +name);
System.out.println(“Adress=” +address);
System.out.println(“Mobile=” +mobile);
}


