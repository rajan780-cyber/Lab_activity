package com.sts.demo.SpringExample;

//import javax.security.auth.login.Configuration;

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
    	
    	//SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session=factory.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	Employee emp1=new Employee();
    	emp1.setEmpName("vanitha");
    	emp1.setAddress("tamilnadu");
    	session.save(emp1);
    	session.getTransaction().commit();
    	session.close();
    	factory.close();
    }
}
