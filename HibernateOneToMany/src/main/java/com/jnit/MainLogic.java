package com.jnit;

import org.hibernate.SessionFactory;
import java.util.*; 
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
		Customer cl=new Customer();
		cl.setCustomer_id(102);
		cl.setCustomer_name("Shreya");
		Customer c2=new Customer();
		c2.setCustomer_id(103);
		c2.setCustomer_name("Kavya");
		Vendors vn=new Vendors();
		vn.setVendor_id(103);
		vn.setVendor_name("Amazon");
		
		Set s=new HashSet();
		s.add(cl);
		s.add(c2);
		
		vn.setCustomer(s);
		session.save(vn);
		tx.commit();
//		tx.commit();
		
		
		}

}
