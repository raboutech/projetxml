package urouen.sepa.model;

public class MndtRltdInf {

	String MndtId;
	String DtOfSgntr;

	public MndtRltdInf(String mndtId, String dtOfSgntr) {
		this.MndtId = mndtId;
		this.DtOfSgntr = dtOfSgntr;
	}
	
	public String getMndtId() {
		return MndtId;
	}

	public void setMndtId(String mndtId) {
		this.MndtId = mndtId;
	}

	public String getDtOfSgntr() {
		return DtOfSgntr;
	}

	public void setDtOfSgntr(String dtOfSgntr) {
		this.DtOfSgntr = dtOfSgntr;
	}
	
}
