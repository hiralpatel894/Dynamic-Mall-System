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
import DAO.ProfileDAO;
import DAO.RegistrationDAO;
import DAO.StateDAO;

import VO.CityVO;
import VO.CountryVO;
import VO.ProfileVO;
import VO.RegistrationVO;
import VO.StateVO;

/**
 * Servlet implementation class ProfileController
 */
@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");
		if(flag.equals("load"))
		{
			load(request,response);
		}
		if(flag.equals("searchprofile"))
		{
			searchProfile(request,response);
		}
		if(flag.equals("deleteProfile"))
		{
			deleteProfile(request,response);
		}
		if(flag.equals("editProfile"))
		{
			editProfile(request,response);
		}
	}
	
	protected void searchProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		ProfileDAO profileDAO = new ProfileDAO();
		List list = profileDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("searchpro", list);
		response.sendRedirect("Admin/searchProfile.jsp");
	}
	
	protected void deleteProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int i =Integer.parseInt(request.getParameter("Id"));
		ProfileVO profileVO = new ProfileVO();
		profileVO.setProfile_Id(i);
		ProfileDAO profileDAO = new ProfileDAO();
		profileDAO.delete(profileVO);
		
		HttpSession httpSession=request.getSession();
		List list=new ArrayList();
        list=profileDAO.search();
		httpSession.setAttribute("searchpro",list);	
		response.sendRedirect("Admin/searchProfile.jsp");
	}
	
	protected void editProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int i = Integer.parseInt(request.getParameter("Id"));
		
		ProfileVO profileVO = new ProfileVO();
		profileVO.setProfile_Id(i);
		
		ProfileDAO profileDAO = new ProfileDAO();
		List list5 = profileDAO.edit(profileVO);
		HttpSession httpSession4 = request.getSession();
		httpSession4.setAttribute("editpro", list5);
		
		CountryDAO countryDAO = new CountryDAO();
		List list = countryDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("country", list);
		
		StateDAO stateDAO = new StateDAO();
		List list1 = stateDAO.search();
		HttpSession httpSession1 = request.getSession();
		httpSession1.setAttribute("state", list1);
		
		CityDAO cityDAO = new CityDAO();
		List list2 = cityDAO.search();
		HttpSession httpSession2 = request.getSession();
		httpSession2.setAttribute("city", list2);
		
		
		
		response.sendRedirect("Admin/editProfile.jsp");
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag=request.getParameter("flag");
		if(flag.equals("insertprofile"))
		{
			profileinsert(request,response);
		}
		if(flag.equals("updateprofile"))
		{
			updateProfile(request,response);
		}
	}
	
	protected void profileinsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//Matcher matcher=new Matcher();
		
		int i = Integer.parseInt(request.getParameter("country_name"));
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		
		int j =Integer.parseInt(request.getParameter("state_name"));
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(j);
		
		int k = Integer.parseInt(request.getParameter("city_city"));
		CityVO cityVO = new CityVO();
		cityVO.setCity_Id(k);
		
		
		
		int pin_Code =Integer.parseInt(request.getParameter("pincode")); 
		long mobile =Long.parseLong(request.getParameter("mobile")); 
		long phone_Number = Long.parseLong(request.getParameter("phone"));
		String temp_addr = request.getParameter("temp_addrs");
		String perm_addr = request.getParameter("permnt_addrs");
		String shop_Name = request.getParameter("shop_name"); 
		String shop_Desc =request.getParameter("shop_desc");
		
		ProfileVO profileVO = new ProfileVO();
		profileVO.setCountryVO(countryVO);
		profileVO.setStateVO(stateVO);
		profileVO.setCityVO(cityVO);
		
		profileVO.setPin_Code(pin_Code);
		profileVO.setMobile(mobile);
		profileVO.setPhone_Number(phone_Number);
		profileVO.setTemp_Addr(temp_addr);
		profileVO.setPerm_Addr(perm_addr);
		profileVO.setShop_Name(shop_Name);
		profileVO.setShop_Desc(shop_Desc);
		
		ProfileDAO profileDAO = new ProfileDAO();
		profileDAO.insert(profileVO);
		response.sendRedirect("Admin/SellerProfile.jsp");	
	}

	protected void load(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		CountryDAO cd= new CountryDAO();
		List ls = cd.load();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("country",ls);
		
		StateDAO sd = new StateDAO();
		List ls1 = sd.load();
		//HttpSession httpSession1 = request.getSession();
		httpSession.setAttribute("state",ls1);	
		
		CityDAO ci = new CityDAO();
		List ls2 = ci.cityload();
		httpSession.setAttribute("city",ls2);
		
		
		response.sendRedirect("Admin/SellerProfile.jsp");
	}
	
	protected void updateProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub*/	
		
		
		int s = Integer.parseInt(request.getParameter("profileId"));
	
		int i = Integer.parseInt(request.getParameter("country_name"));
		CountryVO countryVO = new CountryVO();
		countryVO.setCountry_Id(i);
		
		int j =Integer.parseInt(request.getParameter("state_name"));
		StateVO stateVO = new StateVO();
		stateVO.setState_Id(j);
		
		int k = Integer.parseInt(request.getParameter("city_city"));
		CityVO cityVO = new CityVO();
		cityVO.setCity_Id(k);
		
		
		
		int pin_Code =Integer.parseInt(request.getParameter("pincode")); 
		long mobile =Long.parseLong(request.getParameter("mobile")); 
		long phone_Number = Long.parseLong(request.getParameter("phone"));
		String temp_addr = request.getParameter("temp_addrs");
		String perm_addr = request.getParameter("permnt_addrs");
		String shop_Name = request.getParameter("shop_name"); 
		String shop_Desc =request.getParameter("shop_desc");
		
		ProfileVO profileVO = new ProfileVO();
		profileVO.setProfile_Id(s);
		profileVO.setCountryVO(countryVO);
		profileVO.setStateVO(stateVO);
		profileVO.setCityVO(cityVO);
		
		profileVO.setPin_Code(pin_Code);
		profileVO.setMobile(mobile);
		profileVO.setPhone_Number(phone_Number);
		profileVO.setTemp_Addr(temp_addr);
		profileVO.setPerm_Addr(perm_addr);
		profileVO.setShop_Name(shop_Name);
		profileVO.setShop_Desc(shop_Desc);
		
		ProfileDAO profileDAO = new ProfileDAO();
		profileDAO.update(profileVO);
		
		HttpSession httpSession=request.getSession();
		List list=new ArrayList();
        list=profileDAO.search();
		httpSession.setAttribute("searchpro",list);	
		response.sendRedirect("Admin/searchProfile.jsp");	
	}
}
