package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CategoryDAO;
import DAO.PackageDAO;
import DAO.PackageDAO;
import VO.CategoryVO;
import VO.PackageVO;
import VO.PackageVO;

/**
 * Servlet implementation class PackageController
 */
@WebServlet("/PackageController")
public class PackageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PackageController() {
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
			if(flag.equals("loadPackage"))
			{
		    	  loadPackage(request,response);
		    }
			
			if(flag.equals("searchPackage"))
			{
		    	  searchPackage(request,response);
		    }
			
			if(flag.equals("editPackage"))
			{
		    	  editPackage(request,response);
		    }
			
			if(flag.equals("deletePackage"))
			{
		    	  deletePackage(request,response);
		    }

	}

	private void deletePackage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		int package_Id=Integer.parseInt(request.getParameter("Id"));
		PackageVO PackageVO=new PackageVO();
		PackageVO.setPackage_Id(package_Id);
	
		PackageDAO packageDAO=new PackageDAO();
		packageDAO.delete(PackageVO);
		
		List list = new ArrayList();
		list = packageDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("packageList",list);
		 response.sendRedirect("Admin/searchPackage.jsp");

	}

	private void editPackage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int package_Id=Integer.parseInt(request.getParameter("Id"));
		String p=request.getParameter("p");
		String package_Duration=request.getParameter("package_Duration");
		
		PackageVO packageVO=new PackageVO();
		packageVO.setPackage_Id(package_Id);
	
		PackageDAO PackageDAO=new PackageDAO();
		List list=PackageDAO.edit(packageVO);
		
		packageVO.getPackage_Duration();
		packageVO.setPackage_Duration(package_Duration);
		
		
		HttpSession httpSession1 = request.getSession();
		httpSession1.setAttribute("packageList",list);
		response.sendRedirect("Admin/editPackage.jsp");
	
	}

	private void searchPackage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		String package_Name=request.getParameter("package_Name");
		String package_Des=request.getParameter("package_Des");
		String package_Duration=request.getParameter("package_Duration");
		double package_Price=Double.parseDouble(request.getParameter("package_Price"));
		
		PackageVO packageVO=new PackageVO();
		packageVO.setPackage_Name(package_Name);
		packageVO.setPackage_Des(package_Des);
		packageVO.setPackage_Duration(package_Duration);
		packageVO.setPackage_Price(package_Price);
		System.out.println(package_Name + package_Des);
		
		PackageDAO packageDAO=new PackageDAO();
		packageDAO.search(packageVO);
		
		response.sendRedirect("Admin/searchPackage.jsp");
	
	}

	private void loadPackage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		 PackageDAO packageDAO=new PackageDAO();
		 list = packageDAO.load();
		 
		 System.out.println("sizeeeeeeee = = = " + list.size());
		 HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("packageList",list);
		 response.sendRedirect("Admin/searchPackage.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		if(flag.equals("InsertPackage"))
		{
			insert(request,response);
			
		}
		if(flag.equals("UpdatePackage"))
		{
			update(request,response);
			
		}
		
	}

	
	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String package_Name=request.getParameter("package_name");
		String package_Des=request.getParameter("package_des");
		String package_Duration=request.getParameter("package_duration");
		double package_Price=Double.parseDouble(request.getParameter("package_price"));
		
		
		PackageVO packageVO=new PackageVO();
		packageVO.setPackage_Des(package_Des);
		
		
		packageVO.setPackage_Duration(package_Duration);
		packageVO.setPackage_Name(package_Name);
		packageVO.setPackage_Price(package_Price);
		
		System.out.println(package_Des + package_Duration);
		
		PackageDAO packageDAO=new PackageDAO();
		packageDAO.insert(packageVO);
		
		response.sendRedirect("Admin/addPackage.jsp");
	
	}
	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		int package_Id=Integer.parseInt(request.getParameter("packageId"));
		String package_Name=request.getParameter("package_Name");
		String package_Des=request.getParameter("package_Des");
		String package_Duration=request.getParameter("package_Duration");
		double package_Price=Double.parseDouble(request.getParameter("package_Price"));
		
		PackageVO packageVO=new PackageVO();
		packageVO.setPackage_Id(package_Id);
		packageVO.setPackage_Name(package_Name);
		packageVO.setPackage_Des(package_Des);
		packageVO.setPackage_Duration(package_Duration);
		packageVO.setPackage_Price(package_Price);
		
		
		System.out.println(package_Name + package_Des);
		
		PackageDAO packageDAO=new PackageDAO();
		packageDAO.update(packageVO);
	
		
		List list = new ArrayList();
		list = packageDAO.load();
		HttpSession httpSession = request.getSession();
		 httpSession.setAttribute("packageList",list);
		 response.sendRedirect("Admin/searchPackage.jsp");
	}


}
