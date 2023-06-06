package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class manyMappingDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session session=factory.openSession();
	Transaction tx=session.beginTransaction();	
	
		employee e1=new employee();
e1.setName("Ragini");
e1.setCity("chennai");
e1.setAddress("mg road");


account acc1=new account();
acc1.setAccountno(123);
acc1.setHoldername("ragini");
acc1.setAmount(12000);
acc1.setBranch("mg road");
acc1.setEmp(e1);

account acc2=new account();
acc2.setAccountno(1245);
acc2.setHoldername("ragini ravilla");
acc2.setAmount(24000);
acc2.setBranch("f.c road");
acc2.setEmp(e1);

account acc3=new account();
acc3.setAccountno(1234673);
acc3.setHoldername("ravilla");
acc3.setAmount(340000);
acc3.setBranch("c.r avenue");
acc3.setEmp(e1);

List<account> list=new ArrayList<account>();
list.add(acc1);
list.add(acc2);
list.add(acc3);

e1.setAcc(list);

session.save(e1);
session.save(acc1);
session.save(acc2);
session.save(acc3);

tx.commit();
		
		/*employee emp=session.get(employee.class, 1);
System.out.println(emp.getEid()+" "+emp.getName()+" "+emp.getAddress());

for(account a:emp.getAcc())
{
System.out.println(a.getAccountno()+" "+ 
a.getAmount()+" "+ a.getHoldername()+" "+a.getBranch());	
}*/




session.close();
factory.close();


	}

}
