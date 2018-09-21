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

import VO.AdvertisementVO;
import VO.CategoryVO;
import VO.SubcategoryVO;
import DAO.AdvertisementDAO;
import DAO.CategoryDAO;
import DAO.SubcategoryDAO;

/**
 * Servlet implementation class AdvertisementController
 */
@WebServlet("/AdvertisementController")
public class AdvertisementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvertisementController() {
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
		if(flag.equals("load"))
		{
	    	  load(request,response);
	    }
		if(flag.equals("searchAdvertisement"))
		{
			searchAdvertisement(request,response);
	    }
		if(flag.equals("editAdvertisement"))
		{
			editAdvertisement(request,response);
	    }
		
		if(flag.equals("deleteAdvertisement"))
		{
			deleteAdvertisement(request,response);
	    }

	
	}

	private void deleteAdvertisement(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int advertisement_Id=Integer.parseInt(request.getParameter("Id"));
		AdvertisementVO advertisementVO=new AdvertisementVO();
		advertisementVO.setAdvertisement_Id(advertisement_Id);
	
		AdvertisementDAO advertisementDAO=new AdvertisementDAO();
		advertisementDAO.delete(advertisementVO);
		
		List list = new ArrayList();
		list = advertisementDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("advertisementList",list);
		 response.sendRedirect("Admin/searchAdvertisement.jsp");	
	}

	private void editAdvertisement(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int advertisement_Id=Integer.parseInt(request.getParameter("Id"));
		
		AdvertisementVO advertisementVO=new AdvertisementVO();
		advertisementVO.setAdvertisement_Id(advertisement_Id);
	
		List ls = new ArrayList();
		CategoryDAO categoryDAO = new CategoryDAO();
		ls= categoryDAO.load();
		HttpSession ht = request.getSession();
		ht.setAttribute("categoryList", ls);

		List ls1 = new ArrayList();
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		ls1= subcategoryDAO.load();
		HttpSession ht1 = request.getSession();
		ht1.setAttribute("subcategoryList", ls1);

		
		AdvertisementDAO advertisementDAO=new AdvertisementDAO();
		List list=advertisementDAO.edit(advertisementVO);
		
		HttpSession httpSession1 = request.getSession();
		 httpSession1.setAttribute("advertisementList",list);
		 response.sendRedirect("Admin/editAdvertisement.jsp");
		
	}

	private void searchAdvertisement(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		AdvertisementDAO advertisementDAO=new AdvertisementDAO();
		 list = advertisementDAO.load();
		 
		 System.out.println("sizeeeeeeee = = = " + list.size());
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("advertisementList",list);
		 response.sendRedirect("Admin/searchAdvertisement.jsp");	
	}

	

	private void load(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		 CategoryDAO categoryDAO=new CategoryDAO();
		 list = categoryDAO.load();
		 
		 List list1 = new ArrayList();
		 SubcategoryDAO subcategoryDAO=new SubcategoryDAO();
		 list1 = subcategoryDAO.load();
		 
		 System.out.println("sizeeeeeeee = = = " + list.size());
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("categoryList",list);
		 
		 System.out.println("sizeeeeeeee = = = " + list1.size());
		 HttpSession httpSession1 = request.getSession();
		 httpSession1.setAttribute("subcategoryList",list1);
		 response.sendRedirect("Admin/addAdvertisement.jsp");	
		 	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");
	    
	     System.out.println(flag);
	     
	      if(flag.equals("insertAdvertisement"))
	         {
	    	  System.out.println("inside doget if");
	    	  	insert(request, response);
	         }
	    
	      if(flag.equals("updateAdvertisement"))
	         {
	    	  	update(request, response);
	         }
	    
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
String advertisement_Name=request.getParameter("advertisement_Name");
		
		String advertisement_Des=request.getParameter("advertisement_Des");
		
		int cat_Id = Integer.parseInt(request.getParameter("cat_Id"));
		int subcat_Id = Integer.parseInt(request.getParameter("subcat_Id"));
		int advertisement_Id = Integer.parseInt(request.getParameter("advertisement_Id"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(subcat_Id);
		
		AdvertisementVO advertisementVO = new AdvertisementVO();
		advertisementVO.setAdvertisement_Id(advertisement_Id);
		advertisementVO.setAdvertisement_Name(advertisement_Name);
		advertisementVO.setAdvertisement_Des(advertisement_Des);
		advertisementVO.setCategoryVO(categoryVO);
		advertisementVO.setSubcategoryVO(subcategoryVO);
		
		AdvertisementDAO advertisementDAO = new AdvertisementDAO();
		advertisementDAO.update(advertisementVO);
		 response.sendRedirect("Admin/searchAdvertisement.jsp");

	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("inside controller insert");
		String advertisement_Name=request.getParameter("advertisement_Name");
		
		String advertisement_Des=request.getParameter("advertisement_Des");
		
		int cat_Id = Integer.parseInt(request.getParameter("cat_Id"));
		int subcat_Id = Integer.parseInt(request.getParameter("subcat_Id"));
		
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(cat_Id);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(subcat_Id);
		
		AdvertisementVO advertisementVO = new AdvertisementVO();
		advertisementVO.setAdvertisement_Name(advertisement_Name);
		advertisementVO.setAdvertisement_Des(advertisement_Des);
		advertisementVO.setCategoryVO(categoryVO);
		advertisementVO.setSubcategoryVO(subcategoryVO);
		
		AdvertisementDAO advertisementDAO = new AdvertisementDAO();
		advertisementDAO.insert(advertisementVO);
		 response.sendRedirect("Admin/addAdvertisement.jsp");

	}

}
