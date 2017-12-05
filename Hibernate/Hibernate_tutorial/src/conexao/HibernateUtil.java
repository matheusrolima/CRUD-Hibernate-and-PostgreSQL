package conexao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Pessoa.Person;

public class HibernateUtil {

	private static final SessionFactory factory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(Person.class);
		
		configuration.configure("/META-INF/hibernate.cfg.xml");
		
		return configuration.buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
}

