package DAO;

import java.util.ArrayList;
import java.util.List;

import lscd.MyUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import VO.PostingVO;

public class PostingDAO {

		public void insert(PostingVO VO_obj){
		
			Session session = null;
		
		 try{
			  
			 session = MyUtility.getSession();// Static Method which makes only one object as method is static 
			  
			  Transaction t= session.beginTransaction();
			
			  session.save(VO_obj);
			  
			  t.commit();	
	    }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		}
		 finally
		 {
			 session.close(); 
		 }
    }
		
	
		 public List showAll(){
				
				Session session = null;
				List temp = new ArrayList();
				  try{
				  
					  session = MyUtility.getSession();// Static Method which makes only one object as method is static
				
					  Query q = session.createQuery("FROM PostingVO ");
				 
					  temp = q.list();
				  	
				  }catch(Exception e){
					  				  System.out.println(e.getMessage());
				  					 }finally{
				  						     session.close();
				  					 		 }
				 return temp;
				
				}
		 
		 public void delete(PostingVO VO_obj){
				
				Session session = null;
				
				 try{
					  
					 session = MyUtility.getSession();// Static Method which makes only one object as method is static
					 
					  Transaction t= session.beginTransaction();

		/*			 
		 *          Method 1 
		 *          Query q = session.createQuery("from AttachmentVO where dID = :dID ");
					  q.setParameter("dID", VO_obj.getdID());
					  AttachmentVO dvo = (AttachmentVO)q.list().get(0);
		*/
					
					 /* Method 2 */ 
					  PostingVO dvo = (PostingVO)session.get(PostingVO.class, VO_obj.getSell_Id());

					  session.delete(dvo);
					
					  t.commit();
					  
					  }catch(Exception e){
						  	e.printStackTrace();
						  				//System.out.println(e.getMessage());
					  					}finally
					  					{
					  						session.close();	  
					  					}	
			}
		 
		 public List getElementByID(PostingVO VO_obj){
				
				Session session = null;
				List temp = null;
				try{
				  
					 session = MyUtility.getSession();// Static Method which makes only one object as method is static
				
				    Transaction tr = session.beginTransaction();
				 
				    Query q = session.createQuery("FROM PostingVO WHERE sell_Id = '"+VO_obj.getSell_Id()+"'");
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
		 
		 public void update(PostingVO VO_obj){
			  
				Session session = null;
				
				  try{
				  
					  session = MyUtility.getSession();// Static Method which makes only one object as method is static
				
					  Transaction tr = session.beginTransaction();
				 
					  session.update(VO_obj);
				 
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