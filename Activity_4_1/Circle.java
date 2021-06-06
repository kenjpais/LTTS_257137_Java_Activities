package test;

public class Circle extends Shape{
	
	   // private instance variables
	   private double radius;

	
	   public Circle(double radius) {
	      this.radius = radius;
	      System.out.println("Construced a Circle with Circle(radius)");  // for debugging
	   }
	  
	   // public getters and setters for the private variables
	   public double getRadius() {
	      return this.radius;
	   }
	   
	   public void setRadius(double radius) {
	      this.radius = radius;
	   }
	  

	 
 public double calculateArea() {
	
	 return radius * radius * Math.PI;
		
	}

}
