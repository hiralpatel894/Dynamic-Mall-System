package DAO;

import java.util.List;

import lscd.MyUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VO.AuctionMappingVO;
import VO.ProductMappingVO;

public class ProductMappingDAO {

	public void insert(ProductMappingVO productVO) {
		// TODO Auto-generated method stub
		
		
		Session session = null;
		
		 try{
			  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static 
			  
			  Transaction t= session.beginTransaction();
			
			  session.save(productVO);
			  
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

	public List showAll() {
		// TODO Auto-generated method stub
		Session session = null;
		List temp = null;
		  try{
		  
			  session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
			  Query q = session.createQuery("FROM ProductMappingVO ");
		 
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

	public List getElementByID(ProductMappingVO productVO) {
		// TODO Auto-generated method stub
		Session session = null;
		List temp = null;
		
		
		try{
		  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
		    Transaction tr = session.beginTransaction();
		 
		    Query q = session.createQuery("FROM ProductMappingVO WHERE productVO = '"+productVO.getProductVO().getProduct_Id()+"'");
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

	
	  public void update(ProductMappingVO productVO){
		  
			Session session = null;
			
			  try{
			  
				  session = MyUtility.getSession();// Static Method  which makes only one object as method is static
			
				  Transaction tr = session.beginTransaction();
			 
				  session.update(productVO);
			 
				  tr.commit();
			 
			  }catch(Exception e){
				  				
				  				System.out.println(e.getMessage());
			  					}finally{
			  						    session.close();
			  							}
			  
			}
}
