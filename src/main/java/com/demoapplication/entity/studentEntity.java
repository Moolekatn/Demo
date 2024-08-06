package com.demoapplication.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class studentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	@Column(name = "student_firstName")
	private String fristName;
	@Column(name = "student_lastName")
	private String lastName;
	@Column(name = "student_percentage")
	private float percentage;
	@Column(name = "student_branch")
	private String branch;

	public studentEntity() {

	}

	public studentEntity(String fristName, String lastName, float percentage, String branch) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.percentage = percentage;
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fristName=" + fristName + ", lastName=" + lastName + ", percentage="
				+ percentage + ", branch=" + branch + "]";
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
