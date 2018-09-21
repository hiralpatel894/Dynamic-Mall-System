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
import javax.swing.text.DefaultEditorKit.InsertContentAction;





import DAO.CategoryDAO;

import VO.CategoryVO;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");
		System.out.println("searched");
		if(flag.equals("loadCategory"))
		{
	    	  loadCategory(request,response);
	    }
		
		if(flag.equals("searchCategory"))
		{
	    	  searchCategory(request,response);
	    }
		
		if(flag.equals("editCategory"))
		{
	    	  editCategory(request,response);
	    }
		
		if(flag.equals("deleteCategory"))
		{
	    	  deleteCategory(request,response);
	    }
	
	
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
		 response.sendRedirect("Admin/searchCategory.jsp");
	
	}

	private void searchCategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String cat_Name=request.getParameter("cat_name");
		String cat_Des=request.getParameter("cat_des");
		
		
		CategoryVO categoryVO=new CategoryVO();
		categoryVO.setCat_Name(cat_Name);
		categoryVO.setCat_Des(cat_Des);
		System.out.println(cat_Des + cat_Name);
		
		CategoryDAO categoryDAO=new CategoryDAO();
		categoryDAO.search(categoryVO);
		
		response.sendRedirect("Admin/searchCategory.jsp");
	
	
	
	
	}
	private void deleteCategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		
		int cat_Id=Integer.parseInt(request.getParameter("Id"));
		CategoryVO categoryVO=new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
	
		CategoryDAO categoryDAO=new CategoryDAO();
		categoryDAO.delete(categoryVO);
		
		List list = new ArrayList();
		list = categoryDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("categoryList",list);
		 response.sendRedirect("Admin/searchCategory.jsp");
		
		
	}

	private void editCategory(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int cat_Id=Integer.parseInt(request.getParameter("Id"));
		
		CategoryVO categoryVO=new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
	
		CategoryDAO categoryDAO=new CategoryDAO();
		List list=categoryDAO.edit(categoryVO);
		
		HttpSession httpSession1 = request.getSession();
		 httpSession1.setAttribute("categoryList",list);
		 response.sendRedirect("Admin/editCategory.jsp");
		
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String flag = request.getParameter("flag");
	
	if(flag.equals("InsertCategory"))
	{
		insert(request,response);
		
	}
	if(flag.equals("UpdateCategory"))
	{
		update(request,response);
		
	}
	
	
	}

	
	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		String cat_Name=request.getParameter("cat_name");
		String cat_Des=request.getParameter("cat_des");
		
		
		CategoryVO categoryVO=new CategoryVO();
		categoryVO.setCat_Name(cat_Name);
		categoryVO.setCat_Des(cat_Des);
		System.out.println(cat_Des + cat_Name);
		
		CategoryDAO categoryDAO=new CategoryDAO();
		categoryDAO.insert(categoryVO);
		
		response.sendRedirect("Admin/addCategory.jsp");
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		int cat_Id=Integer.parseInt(request.getParameter("categoryId"));
		
		String cat_Name=request.getParameter("cat_name");
		String cat_Des=request.getParameter("cat_des");
		CategoryVO categoryVO=new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
		categoryVO.setCat_Name(cat_Name);
		categoryVO.setCat_Des(cat_Des);
		System.out.println(cat_Des + cat_Name);
		
		CategoryDAO categoryDAO=new CategoryDAO();
		categoryDAO.update(categoryVO);
		
		List list = new ArrayList();
		list = categoryDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("categoryList",list);
		 response.sendRedirect("Admin/searchCategory.jsp");
		
	}


}
