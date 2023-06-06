package secondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class cacheDemo {

	public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Session session1=factory.openSession();
Transaction tx=session1.beginTransaction();
/*Book b1=new Book();
b1.setbName("let us c");
b1.setBprice(560);
b1.setBauthon("yashwant kanithkar");

Book b2=new Book();
b2.setbName("java complete reference");
b2.setBprice(780);
b2.setBauthon("mc grew");

session1.save(b1);
session1.save(b2);
tx.commit();
*/

Book book1=session1.get(Book.class, 1);
System.out.println(book1.getBid()+" "+book1.getbName()+" "+book1.getBprice()+" "+
book1.getBauthon());
	
	session1.close();
	
	//open another session
	Session session2=factory.openSession();
	Book book2=session2.get(Book.class, 1);
	System.out.println(book1.getBid()+" "+book1.getbName()+" "+book1.getBprice()+" "+
	book1.getBauthon());
	
	}

}
