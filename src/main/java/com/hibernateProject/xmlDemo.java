package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class xmlDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Person person=new Person();
        person.setName("aarti");
         person.setAddress("bangalore");
        
         
         
         Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
          session.save(person);
          tx.commit();
          session.close();
          factory.close();

	}

}
