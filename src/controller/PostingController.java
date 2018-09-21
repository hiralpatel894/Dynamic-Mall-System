package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CategoryDAO;
import DAO.PostingDAO;
import DAO.PostingMappingDAO;
import DAO.SubcategoryDAO;
import VO.CategoryVO;
import VO.PostingMappingVO;
import VO.PostingVO;
import VO.SubcategoryVO;



/**
 * Servlet implementation class PostingController
 */
@WebServlet("/PostingController")
public class PostingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag = request.getParameter("flag");
		if(flag.equals("load"))
		{
			load(request,response);
		}
		if(flag.equals("searching"))
		{
			show(request,response);
		}
		if(flag.equals("deletePost"))
		{
			delete(request,response);
		}
		if(flag.equals("editPost"))
		{
			edit(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String mode = request.getParameter("mode");
		String flag = request.getParameter("flag");
		
//		if(mode!=null && mode.equals("6"))
//		{
//		   deleteSelected(request, response);	
//		}
		if(mode!=null && mode.equals("1"))
		{
		   insert(request, response);		
		}
		
		if(flag!=null && flag.equals("update"))
		{
		   update(request, response);		
		}
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int phone =Integer.parseInt(request.getParameter("phone")); 
		String ads_Desc = request.getParameter("ads_Desc");
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		PostingVO postingVO = new PostingVO();
		postingVO.setCategoryVO(categoryVO);
		postingVO.setSubcategoryVO(subcategoryVO);
		postingVO.setPhone(phone);
		postingVO.setAds_Desc(ads_Desc);
		
		PostingDAO postingDAO = new PostingDAO();
		postingDAO.insert(postingVO);
		
		PostingMappingVO postingMappingVO = new PostingMappingVO();	
		postingMappingVO.setPostingVO(postingVO);		
		
		PostingMappingDAO postingMappingDAO = new PostingMappingDAO();
		
		
		//getting file from Session
		
		HttpSession session =request.getSession();
		
		List myList=(List)session.getAttribute("fileList");
		
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         int i =0;
         while (itr.hasNext()) 
         {
        	 postingMappingVO.setAds_Name("Photo"+i);
        	 postingMappingVO.setPath((String)itr.next());
        	 
        	 postingMappingDAO.insert(postingMappingVO);
        	 
        	 i++;
			}
		
         session.removeAttribute("fileList");
       //show(request, response);
         response.sendRedirect("Admin/PostingAds.jsp");
     	

	}
	
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CategoryDAO l=new CategoryDAO();
		List ls=l.load();
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List list1 = subcategoryDAO.load();
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("category",ls);
		httpSession.setAttribute("subcat",list1);
		response.sendRedirect("Admin/PostingAds.jsp");
	}
	
	protected void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		System.out.println("11111111111");
		PostingDAO postingDAO = new PostingDAO();
		List list = postingDAO.showAll();
		
		HttpSession session1 = request.getSession();
		session1.setAttribute("List",list);	
	
		PostingMappingDAO postingMappingDAO = new PostingMappingDAO();
		List myList = postingMappingDAO.showAll();
		session1.setAttribute("myList", myList);
		response.sendRedirect("Admin/SearchPhoto.jsp");	
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sellId = Integer.parseInt(request.getParameter("id"));	
		
		PostingVO postingVO = new PostingVO();
		postingVO.setSell_Id(sellId);
		
		PostingMappingVO postingMappingVO = new PostingMappingVO();
		postingMappingVO.setPostingVO(postingVO);
			
		PostingMappingDAO postingMappingDAO = new PostingMappingDAO();
		postingMappingDAO.delete(postingMappingVO);
		
		PostingDAO pd = new PostingDAO();
		pd.delete(postingVO);
		
		show(request, response);
	
	}
	
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sellId = Integer.parseInt(request.getParameter("Id"));
		CategoryDAO categoryDAO = new CategoryDAO();
		List cat = categoryDAO.load();
		HttpSession httpSession3 = request.getSession();
		httpSession3.setAttribute("category", cat);
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List subcat = subcategoryDAO.load();
		HttpSession httpSession4 = request.getSession();
		httpSession4.setAttribute("subcat1", subcat);
		
		PostingVO postingVO = new PostingVO();
		postingVO.setSell_Id(sellId);
		
		PostingDAO postingDAO = new PostingDAO();
		List list = postingDAO.getElementByID(postingVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("set", list);
		
		PostingMappingVO postingMappingVO = new PostingMappingVO();
		postingMappingVO.setPostingVO(postingVO);
		
		PostingMappingDAO postingMappingDAO = new PostingMappingDAO();
		HttpSession httpSession2 = request.getSession();
		List list1 = postingMappingDAO.getElementByID(postingMappingVO);
		httpSession2.setAttribute("map",list1);
		
		response.sendRedirect("Admin/editPhoto.jsp");
			
//		show(request, response);
	
	}

	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int s = Integer.parseInt(request.getParameter("Id"));
		
		int phone =Integer.parseInt(request.getParameter("phone")); 
		String ads_Desc = request.getParameter("ads_Desc");
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		PostingVO postingVO = new PostingVO();
		postingVO.setCategoryVO(categoryVO);
		postingVO.setSubcategoryVO(subcategoryVO);
		postingVO.setPhone(phone);
		postingVO.setAds_Desc(ads_Desc);
		postingVO.setSell_Id(s);
		
		PostingDAO postingDAO = new PostingDAO();
		postingDAO.update(postingVO);
		
		PostingMappingVO postingMappingVO = new PostingMappingVO();	
		postingMappingVO.setPostingVO(postingVO);		
		
		PostingMappingDAO postingMappingDAO = new PostingMappingDAO();
		
		
		//getting file from Session
		
		HttpSession session =request.getSession();
		
		List myList=(List)session.getAttribute("fileList");
		
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         int i =0;
         while (itr.hasNext()) 
         {
        	 postingMappingVO.setAds_Name("Photo"+i);
        	 postingMappingVO.setPath((String)itr.next());
        	 
        	 postingMappingDAO.update(postingMappingVO);
        	 
        	 i++;
			}
		
         session.removeAttribute("fileList");
       //show(request, response);
         show(request, response);
       
	}
}
