package com.ty_one_to_one_pancard_bi_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Pancard {
	@Id
	private String panNo;
	private String holder_name;
	private String address;
	
	@OneToOne(mappedBy = "panCard")
	private Person person;
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getHolder_name() {
		return holder_name;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Pancard [panNo=" + panNo + ", holder_name=" + holder_name + ", address=" + address + ", person="
				+ person + "]";
	}
	
}

