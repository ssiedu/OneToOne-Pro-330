package com.ssi;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {
		Session session=DataUtility.getSF().openSession();
		Emp emp=session.get(Emp.class, 113);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop().getLcode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		session.close();
	}

}
