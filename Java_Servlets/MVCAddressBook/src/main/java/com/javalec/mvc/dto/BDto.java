package com.javalec.mvc.dto;

public class BDto {

	//검색 리턴으로 BDto 를 해줬으므로 검색 결과에 맞는 모양 만들기
	int aId;
	String aName;
	String aTel;
	String aEmail;
	String aAddress;
	String aRela;
	
	public BDto() {
		
	}

	public BDto(int aId, String aName, String aTel, String aEmail, String aAddress, String aRela) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aTel = aTel;
		this.aEmail = aEmail;
		this.aAddress = aAddress;
		this.aRela = aRela;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaTel() {
		return aTel;
	}

	public void setaTel(String aTel) {
		this.aTel = aTel;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaRela() {
		return aRela;
	}

	public void setaRela(String aRela) {
		this.aRela = aRela;
	}
}
