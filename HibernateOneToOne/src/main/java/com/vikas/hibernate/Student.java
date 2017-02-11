package com.vikas.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
public int student_Id;
public String name;
public String email;

public Student(){}

public Student(int student_Id, String name, String email) {
	super();
	this.student_Id = student_Id;
	this.name = name;
	this.email = email;
}

@Id
@Column(name = "STUDENT_ID")
@GeneratedValue
public int getStudent_Id() {
	return student_Id;
}
public void setStudent_Id(int student_Id) {
	this.student_Id = student_Id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
