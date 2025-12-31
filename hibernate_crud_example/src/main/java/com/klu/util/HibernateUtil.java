package com.klu.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtil {
	private static SessionFactory factory;
	
	static {
		factory=new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}