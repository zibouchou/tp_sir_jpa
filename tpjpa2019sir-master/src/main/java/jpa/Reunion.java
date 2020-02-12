package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reunion {
	private long id;

	private String intitule;

	private String resume;

	public Reunion() {
	}

	public Reunion(String intitule, String resume) {
		this.intitule = intitule;
		this.resume = resume;
	}


	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Réunion [id=" + id + ", intitulé=" + intitule + ", resumé="
				+ resume + "]";
	}

}
