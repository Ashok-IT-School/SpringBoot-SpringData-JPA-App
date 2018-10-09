package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is mapped to STUDENT_MASTER table
 * 
 * @author Ashok
 *
 */
@Entity
@Table(name = "STUDENT_MASTER")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6705205086708190718L;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String sname, String semail) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
	}

	@Id
	@GeneratedValue
	@Column(name = "S_ID")
	private Integer sid;

	@Column(name = "S_NAME")
	private String sname;

	@Column(name = "S_EMAIL")
	private String semail;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + "]";
	}

}
