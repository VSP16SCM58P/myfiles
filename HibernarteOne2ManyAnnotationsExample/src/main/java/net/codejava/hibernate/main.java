package net.codejava.hibernate;

import java.util.HashSet;
import java.util.Set;

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

		User user=new User("Vikas");
		user.setUser_id(12);
		Account account1=new Account("Saving");
		Account account2=new Account("Checking");
		Set<Account> accounts = new HashSet<Account>();
		accounts.add(account1);
		accounts.add(account2);
		account1.setAccountId(12345667);

		user.setAccount(accounts);

		session.save(user);

		session.getTransaction().commit();
		session.close();

	}

}
