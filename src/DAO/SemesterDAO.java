package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.BranchVO;
import VO.SemesterVO;



public class SemesterDAO 

{
   public void insert(SemesterVO semesterVO)
         
	   {

			Session session = null;
			try 
			{

				SessionFactory sessionFactory = new Configuration().configure()
						.buildSessionFactory();
				session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				System.out.println("Inserting Record");
				session.save(semesterVO);
				tr.commit();
				System.out.println("Done");
				
			}
			
			catch (Exception exception) 
			{
				exception.printStackTrace();
			}
			

	   }
  
   public List search()
   
   {
	   List ls = new ArrayList();
		Session session = null;
		try 
		{

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
		//	Transaction tr = session.beginTransaction();

			Query query = session.createQuery("from SemesterVO");
			
			ls = query.list();
		}
		catch (Exception exception) 
		{
			exception.printStackTrace();
		}
		return ls;

	}

   

	}



