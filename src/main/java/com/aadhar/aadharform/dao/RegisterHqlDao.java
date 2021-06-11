package com.aadhar.aadharform.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.aadhar.aadharform.entity.AadharRegistration;

public class RegisterHqlDao {
	
	public List<AadharRegistration> getUsers()
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "from AadharRegistration";
		Query query = session.createQuery(hql);
		return query.list();
		
	}
	
	public void deleteUserId(int id)
	{
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "delete from AadharRegistration where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		int rows = query.executeUpdate();
		transaction.commit();
		if(rows!=0)
		{
			System.out.println("delete operation sucessful");
		}else
		{
			System.out.println("delete operation failed");
		}
	}
	
	
	public void updateUserDetails(String newphoneno,String name,int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "update AadharRegistration set phoneno=:phoneno,name=:name where id=:id";
	    Query query = session.createQuery(hql);
	    query.setParameter("id", id);
	    query.setParameter("phoneno", newphoneno);
	    query.setParameter("name", name);
	    int rows = query.executeUpdate();
	    transaction.commit();
	    if(rows!=0)
	    {
	    	System.out.println("updated sucessful");
	    }else
	    {
	    	System.out.println("updated not sucessful");
	    }
	}

}
