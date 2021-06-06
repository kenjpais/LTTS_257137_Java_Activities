
public class company
{
private string name;
private string employes;
private string Teamlead;
public void getInput()
{
Scanner in = new Scanner (System.in);
System.out.print(“Enter the name:”);
name=in.next();
System.out.print(“Enter the employes:”);
address=in.next();
System.out.print(“Enter the Teamlead:”);
Mobile=in.next();
}
public void display()
{

System.out.println(“Name: ” +name);
System.out.println(“employes: ” +employes);
System.out.println(“Teamlead : ” +Teamlead);
}
public static void main(String[]args)
{
Employee e[] = new Employee[5];
for(int i=0;i<5;i++)
{
e[i]=new employee();
e[i].getInput();
}
for(int i=0;i<5;i++)
{
e[i].display();
}
}
}


