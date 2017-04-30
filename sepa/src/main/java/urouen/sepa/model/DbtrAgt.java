package urouen.sepa.model;

public class DbtrAgt {
	FinInstnId FinInstnId;
	
	
	
	
	public DbtrAgt(){
		super();
	}
	public DbtrAgt(FinInstnId FinInstnId) {
		this.FinInstnId=FinInstnId;
	}

	public FinInstnId getFinInstnId() {
		return FinInstnId;
	}

	public void setFinInstnId(FinInstnId finInstnId) {
		this.FinInstnId = finInstnId;
	}
	
}
