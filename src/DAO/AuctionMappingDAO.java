package DAO;

import java.util.List;

import lscd.MyUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VO.AuctionMappingVO;


public class AuctionMappingDAO {
	
public void insert(AuctionMappingVO auctionVO){
		
		Session session = null;
		
		 try{
			  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static 
			  
			  Transaction t= session.beginTransaction();
			
			  session.save(auctionVO);
			  
			  t.commit();
		 	}
		 	catch(Exception e)
		 	{
			  System.out.println(e.getMessage()); 
			}  
		  finally
		 {	        
		   session.close();  
	     }	  
   }

  
  public List showAll(){
		
		Session session = null;
		List temp = null;
		  try{
		  
			  session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
			  Query q = session.createQuery("FROM AuctionMappingVO ");
		 
			  temp = q.list();
		  	
		  }catch(Exception e)
		  {
			System.out.println(e.getMessage());
		   }
		  finally
		  {
			  session.close();
		  }
		 return temp;
		}	
  
 
  
  public List getElementByID(AuctionMappingVO auctionVO){
		
		Session session = null;
		List temp = null;
		
		
		try{
		  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
		    Transaction tr = session.beginTransaction();
		 
		    Query q = session.createQuery("FROM AuctionMappingVO WHERE auctionVO = '"+auctionVO.getAuctionVO().getAuction_Id()+"'");
		    temp = q.list();
		
		    tr.commit();
		 }
		 catch(Exception e)
		 {
	      System.out.println(e.getMessage());
		 }
		 finally
		 {				
		  	 session.close();
		  }
		 return temp;
	}
  
  public void update(AuctionMappingVO auctionVO){
	  
		Session session = null;
		
		  try{
		  
			  session = MyUtility.getSession();// Static Method  which makes only one object as method is static
		
			  Transaction tr = session.beginTransaction();
		 
			  session.update(auctionVO);
		 
			  tr.commit();
		 
		  }catch(Exception e){
			  				
			  				System.out.println(e.getMessage());
		  					}finally{
		  						    session.close();
		  							}
		  
		}


public void insert1(AuctionMappingVO auctionVO) {
	// TODO Auto-generated method stub

	Session session = null;
	
	 try{
		  
		 session = MyUtility.getSession();// Static Method which makes only one object as method is static 
		  
		  Transaction t= session.beginTransaction();
		
		  session.save(auctionVO);
		  
		  t.commit();
	 	}
	 	catch(Exception e)
	 	{
		  System.out.println(e.getMessage()); 
		}  
	  finally
	 {	        
	   session.close();  
    }	  
	
}

}
