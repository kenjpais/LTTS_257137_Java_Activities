
import java.util.*;

public class Innings {
	String teamname;
	String inningsname;
	int runs;
	
public int getUserInput() {
	
	System.out.println("Enter Team Name");
	Scanner sc = new Scanner(System.in);
	this.teamname = sc.nextLine();
	System.out.println("Enter Session");
	this.inningsname=sc.nextLine();
	System.out.println("Enter runs");
	this.runs = sc.nextInt();
	return 0;
}

public void display() {
	System.out.println("name "+this.teamname);
	System.out.println("innings "+this.inningsname);
	System.out.println(" runs to win "+(this.runs+1));
}
}