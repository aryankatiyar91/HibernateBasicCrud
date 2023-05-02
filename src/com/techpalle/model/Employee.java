package com.techpalle.model;

import javax.persistence.*;

@Entity
public class Employee 
{
	//private variables pointing to the columns in table
	@Id  // declaring primary key for particular
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increment property
	@Column(name = "id")	//customizing column name from [eno] to [id]
	private int eno;
	@Column(unique = true)
	private String ename,edesignation;
	@Column(nullable = false)	// For not null value in column
	private int esal;
	
	
	// Constructor for above private variables
	public Employee() 
	{
		super();
	}
	public Employee(String ename, int esal, String edesignation) 
	{
		super();
		this.ename = ename;
		this.esal = esal;
		this.edesignation = edesignation;
	}
	public Employee(int eno, String ename, int esal, String edesignation) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.edesignation = edesignation;
	}
	
	
	// Getters and setters for private variables
	public int getEno() 
	{
		return eno;
	}
	public void setEno(int eno) 
	{
		this.eno = eno;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public int getEsal() 
	{
		return esal;
	}
	public void setEsal(int esal) 
	{
		this.esal = esal;
	}
	public String getEdesignation() 
	{
		return edesignation;
	}
	public void setEdesignation(String edesignation) 
	{
		this.edesignation = edesignation;
	}
}
