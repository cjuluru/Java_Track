package com.yash.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.EscapeTokenizer;
import com.yash.model.Employee;
import com.yash.model.ExternalProject;
import com.yash.model.InternalProject;
import com.yash.model.Project;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Project project=new Project();
		project.setName("Test");
		InternalProject internalProject=new InternalProject();
		ExternalProject externalProject=new ExternalProject();
		
		internalProject.setName("Interview Scheduler");	
		internalProject.setManagerName("Narendra Patidar");
		
		externalProject.setName("Jhon-Deer Tractor Monitoring");
		externalProject.setClientName("Jhon-Deer");	
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();		
		session.save(project);
		session.save(internalProject);
		session.save(externalProject);
		session.getTransaction().commit();
		session.close();
		
	}

}
