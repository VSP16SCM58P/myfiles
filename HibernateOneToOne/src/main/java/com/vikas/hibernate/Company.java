package com.vikas.hibernate;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COMPANY")
public class Company {

	public int emp_Id;
	public String title;
	public String description;
	public Date DOJ;
	
	public Student student;
	
	public Company(){}

	public Company(int emp_Id, String title, String description, Date dOJ, int student_Id) {
		super();
		this.emp_Id = emp_Id;
		this.title = title;
		this.description = description;
		DOJ = dOJ;
	}
	 @Id
	 @Column(name = "EMP_ID")
	 @GeneratedValue
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Temporal(TemporalType.DATE)
    @Column(name = "DOJ")
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		this.DOJ = dOJ;
	}
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "STUDENT_ID")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
