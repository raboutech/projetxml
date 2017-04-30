package urouen.sepa.model;

public class Id {
	String IBAN;
	
	
	
	public Id(){
		super();
	}
    public Id(String iban) {
		this.IBAN=iban;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iban) {
		this.IBAN = iban;
	}
}
