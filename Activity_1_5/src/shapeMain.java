
import java.util.Scanner;

public class shapeMain{
	
   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
			  
	   System.out.println("Enter the Shape");
	   
	   String shape = sc.nextLine();
	   
	   int radius,length;
	   

	   if(shape == "Circle") {
		   
		   System.out.println("Enter the Radius");
		   
		   radius = sc.nextInt();
		   
		   Circle c = new Circle(radius);
		   
		   System.out.println("Circle Area is " + c.calculateArea());
		   
		   }
	   
	   else {
		   
		   System.out.println("Enter the dimensions");
		
		   length = sc.nextInt();
		
		   Square s = new Square(length);

		   System.out.println("Square Area is " + s.calculateArea());
	   }   
	   sc.close();
      }

}