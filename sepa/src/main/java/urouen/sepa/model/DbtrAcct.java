package urouen.sepa.model;

public class DbtrAcct {
	Id id;
	
	
	public DbtrAcct(){
		super();
	}

	public DbtrAcct(Id id) {
		this.id=id;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
}
