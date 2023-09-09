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
		LaptopUsers l1=new LaptopUsers();
		l1.setLaptop_id(101);
		l1.setLaptop_name("Dell");
		
		LaptopOwner o1=new LaptopOwner();
		o1.setOwner_id(202);
		o1.setOwner_name("Shreya");
		
		LaptopOwner o2=new LaptopOwner();
		o2.setOwner_id(203);
		o2.setOwner_name("Kavya");
		o1.setLu(l1);
		o2.setLu(l1);
		session.save(l1);
		session.save(o1);
		session.save(o2);
		tx.commit();		
		}

}
