package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PermanentEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int peid;
	private String pename;
	private String pemobileno;
	private String pemail;
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress addr;
	public int getPeid() {
		return peid;
	}
	public void setPeid(int peid) {
		this.peid = peid;
	}
	public String getPename() {
		return pename;
	}
	public void setPename(String pename) {
		this.pename = pename;
	}
	public String getPemobileno() {
		return pemobileno;
	}
	public void setPemobileno(String pemobileno) {
		this.pemobileno = pemobileno;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public PermanentAddress getAddr() {
		return addr;
	}
	public void setAddr(PermanentAddress addr) {
		this.addr = addr;
	}
}
