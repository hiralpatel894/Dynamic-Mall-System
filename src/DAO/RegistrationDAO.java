package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.RegistrationVO;

public class RegistrationDAO {
	
	public void insert(RegistrationVO registrationVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registrationVO);
			transaction.commit();
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
			Session session =sessionFactory.openSession();
			Query query = session.createQuery("from RegistrationVO");
			list = query.list();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return list;
	}
	
	public void delete(RegistrationVO registrationVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(registrationVO);
			transaction.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	public List edit(RegistrationVO registrationVO)
	{
		List list = new ArrayList();
		try
		{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				Query query = session.createQuery("from RegistrationVO where reg_Id='"+registrationVO.getReg_Id()+"'");
				list = query.list();
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			return list;
	}
	
	public void Update(RegistrationVO registrationVO)
	{
		try
		{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session =sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(registrationVO);
			transaction.commit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
