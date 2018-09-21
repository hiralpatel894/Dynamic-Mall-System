package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CategoryVO;
import VO.SubcategoryVO;

public class SubcategoryDAO {

	public void insert(SubcategoryVO subcategoryVO) {
		// TODO Auto-generated method stub
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.save(subcategoryVO);
			  
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
			Query q = session.createQuery("from SubcategoryVO");
			list =q.list(); 
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	 return list;
	}

	public void delete(SubcategoryVO subcategoryVO) {
		// TODO Auto-generated method stub
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.delete(subcategoryVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}



	public List edit(SubcategoryVO subcategoryVO) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Query q=session.createQuery("from SubcategoryVO where subcat_Id='"+subcategoryVO.getSubcat_Id()+"'");
			  
			  list=q.list();
			  
			  
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	
	}

	public void update(SubcategoryVO subcategoryVO) {
		// TODO Auto-generated method stub
		
		try
		{
			  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			  
			  Session session =sessionFactory.openSession();
		   
			  Transaction tr = session.beginTransaction();
			  
			  session.saveOrUpdate(subcategoryVO);
			  
			  tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


}
