
public class Square extends Shape{
	
	private int l;
	
	public Square(int l) {
		
		this.l = l;
		
		
	}
	
	//setter
	
	public void setDimensions(int l) {
		
		this.l = l;

	  
	}
	  
	//getter
	
	public int getLength() {
		
		return this.l;
	}

	public double calculateArea() {
		
		 return l*l;
			
		}

}
