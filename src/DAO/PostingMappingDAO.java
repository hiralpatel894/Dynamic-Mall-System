package DAO;

import java.util.List;

import lscd.MyUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VO.PostingMappingVO;


public class PostingMappingDAO 
{

		public void insert(PostingMappingVO VO_obj){
		
		Session session = null;
		
		 try{
			  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static 
			  
			  Transaction t= session.beginTransaction();
			
			  session.save(VO_obj);
			  
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
		
			  Query q = session.createQuery("FROM PostingMappingVO ");
		 
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
  
  public void delete(PostingMappingVO VO_obj){
		
		Session session = null;
		
		 try
		 {
			  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static
			 
			  Transaction t= session.beginTransaction();

			  Query q = session.createQuery("delete from PostingMappingVO where postingVO="+VO_obj.getPostingVO().getSell_Id());
			  
			  q.executeUpdate();
			  
			  t.commit();
			
			  }catch(Exception e)
		 		{  	
				  System.out.println(e.getMessage());
			  	}
		 		finally
		 		{
		 			session.close();
			  	}
	   }
  
  public List getElementByID(PostingMappingVO VO_obj){
		
		Session session = null;
		List temp = null;
		
		
		try{
		  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
		    Transaction tr = session.beginTransaction();
		 
		    Query q = session.createQuery("FROM PostingMappingVO WHERE postingVO = '"+VO_obj.getPostingVO().getSell_Id()+"'");
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
  
  public void update(PostingMappingVO VO_obj){
	  
		Session session = null;
		
		  try{
		  
			  session = MyUtility.getSession();// Static Method which makes only one object as method is static
		
			  Transaction tr = session.beginTransaction();
		 
			  session.update(VO_obj);
		 
			  tr.commit();
		 
		  }catch(Exception e){
			  				
			  				System.out.println(e.getMessage());
		  					}finally{
		  						    session.close();
		  							}
		  
		}
}