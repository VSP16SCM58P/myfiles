package com.vikas.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
         
        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Company company=new Company();
        company.setDescription("S.E");
//        company.setEmp_Id(12);
        company.setTitle("MR");
        //company.setDOJ("ok");
        company.setDOJ(new Date());
        
        company.setStudent(new Student(4,"vikas","f@g.com"));
        
        Integer emp_id=(Integer) session.save(company);
        
        Company comp = (Company) session.get(Company.class, emp_id);
        System.out.println("Companys Title: " + comp.getTitle());
        System.out.println("Company's Description: " + comp.getDescription());
         
        Student student = comp.getStudent();
        System.out.println("Student's Name: " + student.getName());
        System.out.println("Student's Email: " + student.getEmail());
         
        session.getTransaction().commit();
        session.close();       

	}

}
