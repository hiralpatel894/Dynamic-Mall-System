package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.BranchVO;
import VO.CategoryVO;
import VO.SemesterVO;
import VO.SubcategoryVO;
import DAO.BranchDAO;
import DAO.CategoryDAO;
import DAO.SemesterDAO;

import DAO.SubcategoryDAO;

/**
 * Servlet implementation class SubcategoryController
 */
@WebServlet("/SubcategoryController")
public class SubcategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubcategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		System.out.println("loaded");
		if(flag.equals("loadCategory"))
		{
	    	  loadCategory(request,response);
	    }
		if(flag.equals("searchSubcategory"))
		{
			searchSubcategory(request,response);
	    }
		if(flag.equals("editSubcategory"))
		{
	    	  editSubcategory(request,response);
	    }
		
		if(flag.equals("deleteSubcategory"))
		{
	    	  deleteSubcategory(request,response);
	    }
		
	}
	    

	private void searchSubcategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		 SubcategoryDAO subcategoryDAO=new SubcategoryDAO();
		 list = subcategoryDAO.load();
		 
		 System.out.println("sizeeeeeeee = = = " + list.size());
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("subcategoryList",list);
		 response.sendRedirect("Admin/searchSubcategory.jsp");
	
	}
	private void deleteSubcategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		
		int subcat_Id=Integer.parseInt(request.getParameter("Id"));
		SubcategoryVO subcategoryVO=new SubcategoryVO();
		subcategoryVO.setSubcat_Id(subcat_Id);
	
		SubcategoryDAO subcategoryDAO=new SubcategoryDAO();
		subcategoryDAO.delete(subcategoryVO);
		
		List list = new ArrayList();
		list = subcategoryDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("subcategoryList",list);
		 response.sendRedirect("Admin/searchSubcategory.jsp");
		
		
	}

	private void editSubcategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int subcat_Id=Integer.parseInt(request.getParameter("Id"));
		
		SubcategoryVO subcategoryVO=new SubcategoryVO();
		subcategoryVO.setSubcat_Id(subcat_Id);
	
		List ls = new ArrayList();
		CategoryDAO categoryDAO = new CategoryDAO();
		ls= categoryDAO.load();
		HttpSession ht = request.getSession();
		ht.setAttribute("categoryList", ls);

		
		SubcategoryDAO subcategoryDAO=new SubcategoryDAO();
		List list=subcategoryDAO.edit(subcategoryVO);
		
		HttpSession httpSession1 = request.getSession();
		 httpSession1.setAttribute("subcategoryList",list);
		 response.sendRedirect("Admin/editSubcategory.jsp");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 String flag=request.getParameter("flag");
		    
	     System.out.println(flag);
	     
	      if(flag.equals("insertSubcategory"))
	         {
	    	  	insert(request, response);
	         }
	    
	      if(flag.equals("UpdateSubcategory"))
	         {
	    	  	update(request, response);
	         }
	    
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int cat_Id=Integer.parseInt(request.getParameter("cat_Id"));
		int subcat_Id=Integer.parseInt(request.getParameter("subcategoryId"));
		
		String subcat_Name=request.getParameter("subcat_Name");
		String subcat_Des=request.getParameter("subcat_Des");
		
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(subcat_Id);
		subcategoryVO.setCategoryVO(categoryVO);
		subcategoryVO.setSubcat_Name(subcat_Name);
		subcategoryVO.setSubcat_Des(subcat_Des);
		System.out.println(subcat_Des + subcat_Name);
		
		 SubcategoryDAO subcategoryDAO=new SubcategoryDAO(); 
		 subcategoryDAO.update(subcategoryVO);
		 response.sendRedirect("Admin/searchSubcategory.jsp");
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String subcat_Name=request.getParameter("subcat_Name");
		String subcat_Des=request.getParameter("subcat_Des");
		int cat_Id = Integer.parseInt(request.getParameter("cat_Id"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Name(subcat_Name);
		subcategoryVO.setSubcat_Des(subcat_Des);
		subcategoryVO.setCategoryVO(categoryVO);
		
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		subcategoryDAO.insert(subcategoryVO);
		 response.sendRedirect("Admin/addSubcategory.jsp");
	
	
	}

	
	private void loadCategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		List list = new ArrayList();
		 CategoryDAO categoryDAO=new CategoryDAO();
		 list = categoryDAO.load();
		 
		 System.out.println("sizeeeeeeee = = = " + list.size());
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("categoryList",list);
		 response.sendRedirect("Admin/addSubcategory.jsp");
	
	}

}
