package com.aadhar.aadharform.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aadhar.aadharform.entity.AadharRegistration;

public class RegisterDao {
	
      public void saveUser(AadharRegistration aadharaRegistration)
	{
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(AadharRegistration.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(aadharaRegistration);
		transaction.commit();
	}

	public AadharRegistration getUserById(long id) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(AadharRegistration.class, id);
	}

}
