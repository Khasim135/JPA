package org.SRK;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class PersonID implements Serializable{

	private long phon;
	private String mail;
	public long getPhon() {
		return phon;
	}
	public void setPhon(long phon) {
		this.phon = phon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
