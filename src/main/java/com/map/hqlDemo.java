package com.map;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hqlDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session s=factory.openSession();
Transaction tx=s.beginTransaction();

/*laptop l1=new laptop();
l1.setLid(101);
l1.setLname("hp");
l1.setModel("asc34");

laptop l2=new laptop();
l2.setLid(102);
l2.setLname("asus");
l2.setModel("asgj87c34");

laptop l3=new laptop();
l3.setLid(103);
l3.setLname("dell");
l3.setModel("vbfde678yt");

s.save(l1);
s.save(l2);
s.save(l3);
tx.commit();
*/


//hql select query
/*int id;
Scanner sc=new Scanner(System.in);
System.out.println("enter id");
id=sc.nextInt();

String q1="from laptop l where l.lid=:x and l.lname=:n"; 
Query query=s.createQuery(q1);
query.setParameter("x", id);
query.setParameter("n", "hp");

List<laptop> list=query.getResultList();

for(laptop l:list)
{
	
System.out.println(l.getLid()+":laptop name:"+
l.getLname()+":laptop model:"+l.getModel());
}*/

//delete query

/*Query delete=s.createQuery("delete from laptop where lid=:i");
delete.setParameter("i", 102);
int row=delete.executeUpdate();
System.out.println(row+" object is deleted!");
tx.commit();*/

//update query

Query update=s.createQuery("update laptop set model=:m,lname=:ln where lid=:id");
update.setParameter("m", "asus1234");
update.setParameter("ln", "asus");
update.setParameter("id", 103);
int u=update.executeUpdate();
System.out.println(u+ "object updated successfully");
tx.commit();
s.close();
factory.close();
	}

}
