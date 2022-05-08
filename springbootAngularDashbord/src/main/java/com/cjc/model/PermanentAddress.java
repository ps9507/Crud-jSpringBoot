package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PermanentAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int peaid;
    private String areaname;
    private String cityname;
    private String citypin;
	public int getPeaid() {
		return peaid;
	}
	public void setPeaid(int peaid) {
		this.peaid = peaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCitypin() {
		return citypin;
	}
	public void setCitypin(String citypin) {
		this.citypin = citypin;
	}
	
}

