package urouen.sepaClient.model;

public class DbtrAcct {
	Id Id;
	
	
	public DbtrAcct(){
		super();
	}
	public DbtrAcct(Id id) {
		this.Id=id;
	}
	public Id getId() {
		return Id;
	}
	public void setId(Id id) {
		this.Id = id;
	}
}
