package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapdemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
       Questionn q3=new Questionn();
        q3.setQid(102);
        q3.setQuestion("what is java?");
        
        Questionn q4=new Questionn();
        q4.setQid(103);
        q4.setQuestion("what is hibernate?");
        
        Answerr a3=new Answerr();
        a3.setAid(312);
        a3.setAnswer("java is a programming language");
        q3.setAns(a3);
        a3.setQuestion(q3);
        
        Answerr a4=new Answerr();
        a4.setAid(313);
        a4.setAnswer("hibernate is a framework");
        q4.setAns(a4);
        a4.setQuestion(q4);
        
        
        session.save(q3);
        session.save(q4);
        session.save(a3);
        session.save(a4);
        tx.commit();
        
        
        //fetch data 
     /* Questionn q=session.get(Questionn.class, 102);
        System.out.println(q.getQuestion());
        System.out.println(q.getAns().getAnswer());*/
        
        session.close();
        factory.close();
        
	}

}
