package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

//import VO.AreaVO;
import VO.ProfileVO;

public class ProfileDAO {
	
	public void insert(ProfileVO profileVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(profileVO);
			
			tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	public List search()
	{
		List list = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from ProfileVO");
			list = query.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public void delete(ProfileVO profileVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(profileVO);
			transaction.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	public List edit(ProfileVO profileVO)
	{
		List list = new ArrayList();
		try
		{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Query query = session.createQuery("from ProfileVO where profile_Id='"+profileVO.getProfile_Id()+"'");
				list = query.list();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
	}
	
	public void update(ProfileVO profileVO)
	{
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.saveOrUpdate(profileVO);
			  
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
