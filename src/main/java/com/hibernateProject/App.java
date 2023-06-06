package com.hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
       
        
//        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        user st=new user();
       //st.setId(103);
        st.setName("ragini");
        st.setCountry("london");
        //st.setCourse("java");
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
         session.save(st);
         
        tx.commit();
       
       
        
    }
}
