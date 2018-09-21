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

import DAO.CityDAO;
import DAO.CountryDAO;
import DAO.StateDAO;
import VO.CityVO;
import VO.CountryVO;
import VO.StateVO;

/**
 * Servlet implementation class CityController
 */
@WebServlet("/CityController")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
		 String flag= request.getParameter("flag");
		 if(flag.equals("load"))
		 {
			 load(request,response);  
		}
		 if(flag.equals("searchcity"))
		 {
			 searchcity(request,response);
		 }
		 if(flag.equals("deleteCity"))
		 {
			 deletecity(request,response);
		 }
		 if(flag.equals("editCity"))
		 {
			 editcity(request,response);
		 }
	    
	}
	protected void searchcity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		CityDAO cityDAO = new CityDAO();
		List list = cityDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("city", list);
		response.sendRedirect("Admin/searchCity.jsp");
	}
	
	protected void deletecity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("Id"));
		CityVO cityVO = new CityVO();		
		cityVO.setCity_Id(i);
		
		CityDAO cityDAO = new CityDAO();
		cityDAO.delete(cityVO);
		 searchcity(request,response);
	}
	
	protected void editcity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		CityVO cityVO = new CityVO();
		cityVO.setCity_Id(i);
		
		CountryDAO countryDAO = new CountryDAO();
		List list1 = countryDAO.search();
		HttpSession httpSession1 = request.getSession();
		httpSession1.setAttribute("country1", list1);
		
		StateDAO stateDAO = new StateDAO();
		List list2 = stateDAO.search();
		HttpSession httpSession2 = request.getSession();
		httpSession2.setAttribute("state1", list2);
		
		CityDAO cityDAO = new CityDAO();
		List list = cityDAO.edit(cityVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("edit", list);
		response.sendRedirect("Admin/editCity.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		System.out.println(flag);
		if(flag.equals("InsertCity"))
		{
			insert(request,response);
		}
		if(flag.equals("UpdateCity"))
		{
			cityupdate(request,response);
		}
		
		
	}

	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		String city_Name=request.getParameter("city_Name");
		String city_Des=request.getParameter("city_Des");
		int state_Id = Integer.parseInt(request.getParameter("state_Id"));
		int country_Id = Integer.parseInt(request.getParameter("country_Id"));
		
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(country_Id);
		
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(state_Id);
		
		CityVO cityVO = new CityVO();
		cityVO.setCity_Name(city_Name);
		cityVO.setCity_Des(city_Des);
		cityVO.setCountryVO(countryVO);
		cityVO.setStateVO(stateVO);

		CityDAO cityDAO = new CityDAO();
		cityDAO.insert(cityVO);

		response.sendRedirect("Admin/addCity.jsp");
   }
	
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		CountryDAO cd= new CountryDAO();
		List ls = cd.load();
		 
		StateDAO sd = new StateDAO();
		List ls1 = sd.load();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("country",ls);
		//HttpSession httpSession = request.getSession();
		httpSession.setAttribute("state",ls1);
	//	response.sendRedirect("cityform.jsp");
		
		response.sendRedirect("Admin/addCity.jsp");
	}
	protected void cityupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int country_Id=Integer.parseInt(request.getParameter("city_country"));
		int state_Id=Integer.parseInt(request.getParameter("city_state"));
		int city_Id=Integer.parseInt(request.getParameter("cityId"));	
		
		
		String city_Name=request.getParameter("city_Name");
		String city_Des=request.getParameter("city_Des");
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(country_Id);
		
		StateVO stateVO  = new StateVO();
		stateVO.setState_Id(state_Id);
		
		CityVO cityVO = new CityVO();
		cityVO.setCity_Id(city_Id);
		cityVO.setCity_Name(city_Name);
		cityVO.setCity_Des(city_Des);
		cityVO.setCountryVO(countryVO);
		cityVO.setStateVO(stateVO);
		
		CityDAO cityDAO = new CityDAO();
		cityDAO.update(cityVO);
		 searchcity(request,response);
		
	}
}
