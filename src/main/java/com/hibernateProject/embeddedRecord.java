package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embeddedRecord {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
      
      
        
        //transient state
        user u5=new user();
        u5.setCountry("london");
        u5.setName("jaya");
       
        
        Certificate c5=new Certificate();
        c5.setCourse("dotnet");
        c5.setDuration("1 months");
        u5.setCertificate(c5);
        
        user u6=new user();
        u6.setCountry("india");
        u6.setName("sreekirtana");
    
        
        Certificate c6=new Certificate();
        c6.setCourse("php");
        c6.setDuration("1.5 months");
        u6.setCertificate(c6);
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(u5);
        session.save(u6);
        //persistent
        tx.commit();
        
        session.close();
        
        factory.close();
	}

}
