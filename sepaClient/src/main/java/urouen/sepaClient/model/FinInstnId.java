package urouen.sepaClient.model;

public class FinInstnId {
	String BIC;
	
	
	
	
	public FinInstnId(){
		super();
	}
	public FinInstnId(String bic){
		this.BIC=bic;
	}

	public String getBic() {
		return BIC;
	}

	public void setBic(String bic) {
		this.BIC = bic;
	}
}
