package DAO;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.BranchVO;
import VO.SubjectVO;

public class SubjectDAO
{
	   public void insert(SubjectVO subjectVO)
       
	   {

			Session session = null;
			try 
			{

				SessionFactory sessionFactory = new Configuration().configure()
						.buildSessionFactory();
				session = sessionFactory.openSession();
				Transaction tr = session.beginTransaction();
				System.out.println("Inserting Record");
				session.save(subjectVO);
				tr.commit();
				System.out.println("Done");
				
			}
			
			catch (Exception exception) 
			{
				exception.printStackTrace();
			}
			

		}
    }

