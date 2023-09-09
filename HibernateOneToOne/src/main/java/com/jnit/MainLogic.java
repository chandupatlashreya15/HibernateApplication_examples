package com.jnit;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		College c=new College();
		c.setCid(101);
		c.setName("Shreya");
		c.setMarks(456);
		Address a=new Address();
		a.setAid(201);
		a.setPincode(505001);
		a.setPlace("Hyderabad");
		a.setSt(c);
		session.save(a);
		tx.commit();
		
		
		}

}
