package com.qnx.springmodel;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
	 SessionFactory factory=new Configuration()
			 .configure()
			 .addAnnotatedClass(Account.class)
			 .buildSessionFactory();
	 Session session=factory.getCurrentSession();
    public int register(String name,String username,String password,String email) {
	
	 try {
		 session.beginTransaction();
		 Account a=new Account(name,username,password,email) ;
		 session.save(a);
		 
		 session.getTransaction().commit();
		 return 1;	 
		 }
	 catch(Exception e) {
		 e.printStackTrace();
		 return 0;
	 }
}
    public int login(String username,String password) {
   		 session.beginTransaction();
   		 List<Account> accounts=session.createQuery("from Account").list();
   		 
   		 for(Account x:accounts) {
   			 if(x.getUsername().equals(username)&&x.getPassword().equals(password)) {
   				 return 1;
   			 }
   		 }
   		 return 0;
    
}
}