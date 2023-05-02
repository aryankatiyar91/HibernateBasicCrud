package com.techpalle.controller;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

public class MyProgram 
{

	public static void main(String[] args) 
	{
		SessionFactory sf=new Configuration().configure("aryan.cfg.xml").buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		// insert values in Employee table:- 
//		Employee e1=new Employee("naveen",5000,"Java Developer");
//		Employee e2=new Employee("bala",7000,"DB Developer");
//		Employee e3=new Employee("dev",6000,"Developer");
//		Employee e4=new Employee("b",7000,"Python");
//		
//		s.save(e1);
//		s.save(e2);
//		s.save(e3);
//		s.save(e4);
		
		// Read data from DB [Only one row at a time]
//		Employee emp1=s.get(Employee.class, 2);
//		
//		System.out.println(emp1.getEno());
//		System.out.println(emp1.getEname());
//		System.out.println(emp1.getEsal());
//		System.out.println(emp1.getEdesignation());
		
		
		// Update data in DB
//		Employee empUpdate=s.get(Employee.class, 2);
//		// Change Designation from DB to full stack
//		empUpdate.setEdesignation("Full Stack Developer");
//		
//		// Save the updated employee object in DB
//		s.update(empUpdate);
		
		//Delete data in database
		//Fetch the row which we need to eliminate from table:-
		Employee empDel=s.get(Employee.class, 6);
		
		s.delete(empDel);
		
		
		t.rollback();	//is used to free the resources in memory
		t.commit();
		
		s.close();
		sf.close();
	}

}
