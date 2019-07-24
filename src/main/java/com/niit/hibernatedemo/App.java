package com.niit.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.niit.hibernatedemo.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Employee e = new Employee();
		e.setEmpid(2);
		e.setEmpname("achu");
		e.setEmploc("cbe");
		
		Session s=sessionFactory.openSession();
		Transaction txt=s.beginTransaction();
		
		s.save(e);
		txt.commit();
		s.close();
		sessionFactory.close();
    }
}
