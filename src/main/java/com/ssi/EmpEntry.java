package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {


		Emp e1=new Emp(111,"AAA",50000,new Laptop("L111"));
		Emp e2=new Emp(112,"BBB",60000,new Laptop("L112"));
		Emp e3=new Emp(113,"CCC",70000,new Laptop("L113"));
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Employees Data Stored");
		

	}

}
