package com.yash.test;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.yash.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Employee employee=(Employee) session.get(Employee.class, 1);	
		
		
		session.getTransaction().commit();
		session.close();
		
		Session session2=sessionFactory.openSession();
		session2.beginTransaction();
		Employee employee2=(Employee) session2.get(Employee.class, 1);
		session2.getTransaction().commit();
		session2.close();
			
	}
}
