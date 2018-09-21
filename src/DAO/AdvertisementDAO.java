package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.AdvertisementVO;

public class AdvertisementDAO {

	public void insert(AdvertisementVO advertisementVO) {
		// TODO Auto-generated method stub
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(advertisementVO);
			  
			  tr.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}	
	}

	public List load() {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from AdvertisementVO");
			list =q.list(); 
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 return list;
	}

	public void delete(AdvertisementVO advertisementVO) {
		// TODO Auto-generated method stub
	
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(advertisementVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public List edit(AdvertisementVO advertisementVO) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from AdvertisementVO where Advertisement_Id='"+advertisementVO.getAdvertisement_Id()+"'");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;

	}

	public void update(AdvertisementVO advertisementVO) {
		// TODO Auto-generated method stub
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.saveOrUpdate(advertisementVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}

}
