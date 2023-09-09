package com.ex;

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
//		Transaction tx=session.beginTransaction();
		NativeQuery qr=session.createNativeQuery("select * from student");
		List li=qr.list();
		Iterator i=li.iterator();
		
		while(i.hasNext()) {
			Object[] s=(Object[])i.next();
//			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getBranch()+" "+s.getSection()+" ");
			System.out.print(s[0]+" "+s[1]+" "+s[2]+" "+s[3]+"\n");
		}
//		tx.commit();
		
		
		}

}
