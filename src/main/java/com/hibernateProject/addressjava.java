package com.hibernateProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class addressjava {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Address ad=new Address();
		ad.setStreet("101,mg road");
		ad.setCity("kolkata");
		ad.setOpen(true);
		ad.setAddedDate(new java.util.Date());
		
		try {
			FileInputStream fis=new FileInputStream("src/main/java/flower.jpg");
		      byte[] data=new byte[fis.available()];
		      fis.read(data);
		      ad.setImage(data);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
Session session=factory.openSession();

session.save(ad);
Transaction tx=session.beginTransaction();
tx.commit();

session.close();
factory.close();
	}

}
