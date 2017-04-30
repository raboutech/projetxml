package urouen.sepaClient.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DrctDbtTxInf")
public class SEPA {
	
	Collection<DrctDbtTx> DrctDbtTx;
	String PmtId;
	double InstdAmt;
	DbtrAgt DbtrAgt;
	Dbtr Dbtr;
	DbtrAcct DbtrAcct;
	String RmtInf;
	
	public SEPA(){	}

	public SEPA(String PmtId, double InstdAmt, Collection<DrctDbtTx> DrctDbtTx, 
			DbtrAgt DbtrAgt, Dbtr Dbtr, DbtrAcct DbtrAcct, String RmtInf) {
		this.PmtId=PmtId;
		this.InstdAmt=InstdAmt;
		this.DrctDbtTx=DrctDbtTx;
		this.DbtrAgt=DbtrAgt;
		this.Dbtr=Dbtr;
		this.DbtrAcct=DbtrAcct;
		this.RmtInf=RmtInf;
	}
	/*************************PmtId**********/
	public String getPmtId() {
		return PmtId;
	}
	@XmlElement
	public void setPmtId(String PmtId) {
		this.PmtId = PmtId;
	}

	/*************************InstdAmt**********/
	public double getInstdAmt() {
		return InstdAmt;
	}
	@XmlElement
	public void setInstdAmt(double InstdAmt) {
		this.InstdAmt = InstdAmt;
	}
	
	/*************************Collection<DrctDbtTx>**********/
	public Collection<DrctDbtTx> getDrctDbtTx() {
		return DrctDbtTx;
	}
	@XmlElement
	public void setDrctDbtTx(Collection<DrctDbtTx> DrctDbtTx) {
		this.DrctDbtTx = DrctDbtTx;
	}

	/*************************FinInstnId**********/

	public DbtrAgt getDbtrAgt() {
		return DbtrAgt;
	}
	@XmlElement
	public void setDbtrAgt(DbtrAgt DbtrAgt) {
		this.DbtrAgt = DbtrAgt;
	}
	
	/*************************Dbtr**********/
	public Dbtr getDbtr() {
		return Dbtr;
	}
	@XmlElement
	public void setDbtr(Dbtr Dbtr) {
		this.Dbtr = Dbtr;
	}

	/*************************DbtrAcct**********/
	public DbtrAcct getDbtrAcct() {
		return DbtrAcct;
	}
	@XmlElement
	public void setDbtrAcct(DbtrAcct DbtrAcct) {
		this.DbtrAcct = DbtrAcct;
	}
	
	/*************************RmtInf**********/
	public String getRmtInf() {
		return RmtInf;
	}
	@XmlElement
	public void setRmtInf(String RmtInf) {
		this.RmtInf = RmtInf;
	}	
} 