package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import VO.StateVO;
public class StateDAO {
	
	public void insert(StateVO stateVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.save(stateVO);
			
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
			Query q = session.createQuery("from StateVO");
			list =q.list();
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
			Query query = session.createQuery("from StateVO");
			list = query.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public void delete(StateVO stateVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(stateVO);
			transaction.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	public List edit(StateVO stateVO)
	{
		List list = new ArrayList();
		try
		{					
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from StateVO where state_Id='"+stateVO.getState_Id()+"'");
			list = query.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public void update(StateVO stateVO)
	{
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(stateVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
