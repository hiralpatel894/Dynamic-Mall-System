package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.CategoryVO;
import VO.CountryVO;
import VO.StateVO;
import DAO.CountryDAO;
import DAO.StateDAO;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String flag=request.getParameter("flag");  
			System.out.println("load");
			if(flag.equals("load"))
			{
			  load(request,response);
	    	}
			if(flag.equals("statesearch"))
			{
				searchstate(request,response);
			}
			if(flag.equals("deleteState"))
			{
				deletestate(request,response);
			}
			if(flag.equals("editState"))
			{
				editstate(request,response);
			}
		  
		
	}
	protected void searchstate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		StateDAO stateDAO = new StateDAO();
		List list = stateDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("state",list);
		response.sendRedirect("Admin/searchState.jsp");
	}
	
	protected void deletestate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(i);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.delete(stateVO);
		searchstate(request,response);
	}
	
	protected void editstate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(i);
		
		CountryDAO countryDAO = new CountryDAO();
		List ls = countryDAO.search();
		HttpSession httpSession1 = request.getSession();
		httpSession1.setAttribute("edit",ls);
		
		
		StateDAO stateDAO = new StateDAO();
		List list = stateDAO.edit(stateVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("state",list);
		response.sendRedirect("Admin/editState.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");
		if(flag.equals("InsertState"))
		{
		  System.out.println("insert");
		  insert(request,response);
		} 
		if(flag.equals("UpdateState"))
		{
			update(request,response);
		}
	
	
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int country_Id = Integer.parseInt(request.getParameter("country_Id"));
		String state_Name = request.getParameter("state_Name");
		String state_Des = request.getParameter("state_Des");
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(country_Id);
		
		
		StateVO stateVO = new StateVO();
		stateVO.setState_Name(state_Name);
		stateVO.setState_Des(state_Des);
		stateVO.setCountryVO(countryVO);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.insert(stateVO);
		response.sendRedirect("Admin/addState.jsp");
		
		
	}
	

	
	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CountryDAO l=new CountryDAO();
		List ls=l.load();
		
		HttpSession r = request.getSession();
		r.setAttribute("country",ls);
		response.sendRedirect("Admin/addState.jsp");
	
	}
	
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int i = Integer.parseInt(request.getParameter("country_name"));
		int s= Integer.parseInt(request.getParameter("stateId"));
		String state_Name = request.getParameter("state_name");
		String state_Des = request.getParameter("state_des");
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(s);
		
		stateVO.setCountryVO(countryVO);
		stateVO.setState_Name(state_Name);
		stateVO.setState_Des(state_Des);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.update(stateVO);
		searchstate(request,response);
	}
	
	

}
