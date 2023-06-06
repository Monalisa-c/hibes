package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchRecord {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
//		Address ad=session.get(Address.class, 1);
//		
//		System.out.println(ad.getAddressid()+": "+ad.getCity()+": "+ad.getStreet()+":"+ad.isOpen);
//		
//		
//    Address ad1=session.get(Address.class, 2);
//		
//		System.out.println(ad1.getAddressid()+": "+ad1.getCity()+": "+ad1.getStreet()+":"+ad1.isOpen);
		
		
  	Address a=session.load(Address.class, 1);
	System.out.println(a.getAddressid()+": "+a.getCity()+": "+a.getStreet()+":"+a.isOpen);
		
	
	}

}
