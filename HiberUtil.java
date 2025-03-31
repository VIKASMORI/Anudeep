package project.com.LibraryManagementSystem.Utility;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;


public class HiberUtil {
static private org.hibernate.SessionFactory sessionfactory;
	
	private HiberUtil()
	{
		
	}
	static public SessionFactory getSessionFactory()
	{
		if(sessionfactory==null)
		{
			return new Configuration().configure().buildSessionFactory();
		}
		return sessionfactory;	
	
	}

}
	
	