package com.jnit;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		Configuration cf= new Configuration();
		
		Properties pr=new Properties();
		pr.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		pr.put(Environment.URL, "jdbc:mysql://localhost:3306/school");
		pr.put(Environment.USER,"root");
		pr.put(Environment.PASS,"root");
		pr.put(Environment.SHOW_SQL,"true");
		pr.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		pr.put(Environment.HBM2DDL_AUTO,"create");
		cf.setProperties(pr);
		cf.addAnnotatedClass(LaptopUsers.class);
		cf.addAnnotatedClass(LaptopOwner.class);
//		cf.a
		
		sessionFactory=cf.buildSessionFactory();
		return sessionFactory;
	}
	
	
}
