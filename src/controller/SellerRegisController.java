package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;



import VO.RegistrationVO;
import DAO.RegistrationDAO;

/**
 * Servlet implementation class SellerRegisController
 */
@WebServlet("/SellerRegisController")
public class SellerRegisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerRegisController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		if(flag.equals("searchregis"))
		{
			searchregis(request,response);
		}
		if(flag.equals("deleteRegis"))
		{
			deleteregis(request,response);
		}
		if(flag.equals("editRegis"))
		{
			Editregis(request,response);
		}
	}
	
	protected void searchregis(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		RegistrationDAO registrationDAO = new RegistrationDAO();
		List list = registrationDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("regis", list);
		response.sendRedirect("Admin/searchRegister.jsp");
	}
	
	protected void deleteregis(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		RegistrationVO registrationVO = new RegistrationVO();
		registrationVO.setReg_Id(i);
		
		RegistrationDAO registrationDAO = new RegistrationDAO();
		registrationDAO.delete(registrationVO);
		
		List list1 = new ArrayList();
		list1 = registrationDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("regis", list1);
		response.sendRedirect("Admin/searchRegister.jsp");
	}
	
	protected void Editregis(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("Id"));
		RegistrationVO registrationVO = new RegistrationVO();
		registrationVO.setReg_Id(i);
		
		RegistrationDAO registrationDAO = new RegistrationDAO();
		List list = registrationDAO.edit(registrationVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("edit", list);
		response.sendRedirect("Admin/editRegister.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		if(flag.equals("insert"))
		{
			reginsert(request,response);
		}
		if(flag.equals("update"))
		{
			regUpdate(request,response);
		}
		
	}
	
	protected void reginsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//Matcher matcher=new Matcher();
		String f_Name = request.getParameter("firstname");
		String l_Name = request.getParameter("lastname");
		String u_Name = request.getParameter("username");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String pass = request.getParameter("password"); 
		String repass =request.getParameter("passwordConfirm");
		
		System.out.print(f_Name);
		
		RegistrationVO registrationVO = new RegistrationVO();
		registrationVO.setF_Name(f_Name);
		registrationVO.setL_Name(l_Name);
		registrationVO.setU_Name(u_Name);
		registrationVO.setEmail(email);
		registrationVO.setPass(pass);
		registrationVO.setRepass(repass);
		registrationVO.setGender(gender);
		
		RegistrationDAO registrationDAO = new RegistrationDAO();
		registrationDAO.insert(registrationVO);
		response.sendRedirect("Admin/extra-signup.jsp");
	}

	protected void regUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int i = Integer.parseInt(request.getParameter("regId"));
		
		String f_Name = request.getParameter("firstname");
		String l_Name = request.getParameter("lastname");
		String u_Name = request.getParameter("username");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String pass = request.getParameter("password"); 
		String repass =request.getParameter("passwordConfirm");
		
		RegistrationVO registrationVO = new RegistrationVO();
		registrationVO.setReg_Id(i);
		registrationVO.setF_Name(f_Name);
		registrationVO.setL_Name(l_Name);
		registrationVO.setU_Name(u_Name);
		registrationVO.setEmail(email);
		registrationVO.setPass(pass);
		registrationVO.setRepass(repass);
		registrationVO.setGender(gender);
		
		RegistrationDAO registrationDAO = new RegistrationDAO();
		registrationDAO.Update(registrationVO);
		
		List list = new ArrayList();
		list = registrationDAO.search();
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("edit", list);
		searchregis(request,response);
	}

}
