package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.PackageVO;



public class PackageDAO {

	public void insert(PackageVO packageVO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(packageVO);
			  
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
			Query q = session.createQuery("from PackageVO");
			list =q.list(); 
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 return list;
	}

	public List edit(PackageVO packageVO) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from PackageVO where package_Id='"+packageVO.getPackage_Id()+"'");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	}



	public void delete(PackageVO packageVO) {
		// TODO Auto-generated method stub
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(packageVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}



	public List search(PackageVO packageVO) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from PackageVO");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	}



	public void update(PackageVO packageVO) {
		// TODO Auto-generated method stub
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(packageVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}


}
