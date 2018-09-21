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

import DAO.CountryDAO;
import VO.CountryVO;


/**
 * Servlet implementation class CountryController
 */
@WebServlet("/CountryController")
public class CountryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("searchCountry"))
		{
			SearchCountry(request,response);
		}
		
		if(flag.equals("deleteCountry"))
		{
			deleteCountry(request,response);
		}
		
		if(flag.equals("editCountry"))
		{
			editCountry(request,response);
		}
	}

	protected void SearchCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		CountryVO countryVO = new CountryVO();
		
		CountryDAO countryDAO = new CountryDAO();
		List list = countryDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("country",list);
		response.sendRedirect("Admin/searchCountry.jsp");
	}
	
	protected void deleteCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession httpSession=request.getSession();
		int i = Integer.parseInt(request.getParameter("Id"));
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		
		CountryDAO countryDAO = new CountryDAO();
		
		
		
		if(!countryDAO.delete(countryVO)){
		
			httpSession.setAttribute("errorMsg","Please remove child rows first");
			
		}
		else{
			//httpSession.invalidate();
			httpSession.removeAttribute("errorMsg");
		}
		
		
		SearchCountry(request, response);
	}
	 
	protected void editCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		
		CountryDAO countryDAO = new CountryDAO();
		List ls = countryDAO.edit(countryVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("editcountry",ls);
		response.sendRedirect("Admin/editCountry.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String flag=request.getParameter("flag");
	 if(flag.equals("InsertCountry"))
	 {
		 insert(request,response);
	 }
	 if(flag.equals("UpdateCountry"))
	 {
		 update(request,response);
	 }
	}
    
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String country_Name = request.getParameter("country_Name");
		String country_Des = request.getParameter("country_Des");
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Name(country_Name);
		countryVO.setCountry_Des(country_Des);
		
		CountryDAO countryDAO = new CountryDAO();
		countryDAO.insert(countryVO);
		 response.sendRedirect("Admin/addCountry.jsp");
			
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("countryId"));
		String country = request.getParameter("add_country");
		String country_Des = request.getParameter("country_Des");
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		countryVO.setCountry_Name(country);
		countryVO.setCountry_Des(country_Des);

		CountryDAO countryDAO = new CountryDAO();
		
		countryDAO.update(countryVO);
		
		SearchCountry(request, response);
		 
	
		
	}
}
