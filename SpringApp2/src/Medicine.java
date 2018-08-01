
public class Medicine {
	private int batchno;
	private String medicinename;
	private String mnfDate,expDate;
	
	public Medicine(int batchno, String medicinename, String mnfDate, String expDate) {

		this.batchno = batchno;
		this.medicinename = medicinename;
		this.mnfDate = mnfDate;
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Medicine [batchno=" + batchno + ", medicinename=" + medicinename + ", mnfDate=" + mnfDate + ", expDate="
				+ expDate + "]";
	}
}
