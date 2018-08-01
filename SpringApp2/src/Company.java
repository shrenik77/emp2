
public class Company extends Medicine{
	private String companyname;
	
	public Company(String companyname,int batchno, String medicinename, String mnfDate, String expDate)
	{
		super(batchno,medicinename,mnfDate,expDate);
		this.companyname=companyname;
	}
	
	public String toString()
	{
		 return companyname + ", " + super.toString();
	}
}
