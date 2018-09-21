package DAO;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;



import VO.CountryVO;

public class CountryDAO {
	
	public void insert(CountryVO countryVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(countryVO);
			
			tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public List load()
	{
		List list = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from CountryVO");
			list = q.list();
		}
	   catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 return list;
	}
	public List search()
	{
		List list = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from CountryVO");
			list = query.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public Boolean delete(CountryVO countryVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(countryVO);
			transaction.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			String s[]=exception.getCause()!=null?exception.getCause().toString().split(":"):null;
			
			if(s!=null && s[0].equals("java.sql.BatchUpdateException")){
			
			return false;
			}
		}
		return true;
	}
	
	public List edit(CountryVO countryVO)
	{
		List list = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from CountryVO where country_Id ='"+countryVO.getCountry_Id()+"'"); 
			list = query.list();
		}
		catch(Exception exception)
		{
		  exception.printStackTrace();	
		}
		return list;
	}
	
	public void update(CountryVO countryVO)
	{
		try
		{
			 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(countryVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
