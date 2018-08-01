import java.util.Scanner;

public class DynamicRecord {
	private int no;
	Scanner scan = new Scanner(System.in);
	
	public void setNo(int no)
	{
		this.no= no;
	}
	public void readNumber()
	{
		System.out.print("\n Enter Number :");
		no = scan.nextInt();
	}
	
	public String toString()
	{
		return "\n" + no;
	}
}
