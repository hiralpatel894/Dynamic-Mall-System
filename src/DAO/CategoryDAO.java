package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CategoryVO;



public class CategoryDAO {

	public void insert(CategoryVO categoryVO){
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(categoryVO);
			  
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
			Query q = session.createQuery("from CategoryVO");
			list =q.list(); 
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 return list;
	}



	public List search(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from CategoryVO");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	
	}



	public void delete(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(categoryVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}



	public List edit(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from CategoryVO where cat_Id='"+categoryVO.getCat_Id()+"'");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	
	}



	public void update(CategoryVO categoryVO) {
		// TODO Auto-generated method stub
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.update(categoryVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	
	
	}
