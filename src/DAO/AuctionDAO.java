package DAO;

import java.util.ArrayList;
import java.util.List;

import lscd.MyUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VO.AuctionVO;
import VO.PostingVO;

public class AuctionDAO {

	public void insert(AuctionVO auctionVO) {

		Session session = null;

		try {

			session = MyUtility.getSession();// Static Method which makes only
												// one object as method is
												// static

			Transaction t = session.beginTransaction();

			session.save(auctionVO);

			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List showAll() {
		// TODO Auto-generated method stub
		Session session = null;
		List temp = new ArrayList();
		try {

			session = MyUtility.getSession();// Static Method which makes only
												// one object as method is
												// static

			Query q = session.createQuery("FROM AuctionVO ");

			temp = q.list();

		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			//session.close();
		}
		return temp;
	}

	public List getElementByID(AuctionVO auctionVO) {
		// TODO Auto-generated method stub
		Session session = null;
		List temp = null;
		try {

			session = MyUtility.getSession();// Static Method which makes only
												// one object as method is
												// static

			Transaction tr = session.beginTransaction();

			Query q = session.createQuery("FROM AuctionVO WHERE auction_Id = '"
					+ auctionVO.getAuction_Id() + "'");
			temp = q.list();

			tr.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
		return temp;

	}

	public void update(AuctionVO auctionVO) {
		// TODO Auto-generated method stub
		Session session = null;
		
		  try{
		  
			  session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
			  Transaction tr = session.beginTransaction();
		 
			  session.update(auctionVO);
		 
			  tr.commit();
		 
		  }catch(Exception e)
		  {  				
			System.out.println(e.getMessage());
		  }
		  finally
		  {
		    session.close();
		   }
	
	}

}
