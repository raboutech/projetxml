package urouen.sepaClient.model;

public class DrctDbtTx {
	
	MndtRltdInf mndtRltdInf;
	
	
	public DrctDbtTx(){
		super();
	
	}
	
	public DrctDbtTx(MndtRltdInf mndtRltdInf){
		this.mndtRltdInf=mndtRltdInf;
	}
	public MndtRltdInf getMndtRltdInf() {
		return mndtRltdInf;
	}
	public void setMndtRltdInf(MndtRltdInf mndtRltdInf) {
		this.mndtRltdInf = mndtRltdInf;
	}
	
}
