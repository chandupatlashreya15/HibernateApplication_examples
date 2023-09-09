package com.ex;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class MainLogics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Query qr=session.createQuery("update Student s set s.marks=600 where s.id=2");
		int res= qr.executeUpdate();
		System.out.println(res);
		tx.commit();
		
		
		}

}
