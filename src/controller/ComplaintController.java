package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.ComplaintVO;
import DAO.ComplaintDAO;


/**
 * Servlet implementation class ComplaintController
 */
@WebServlet("/ComplaintController")
public class ComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplaintController() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
	    
	     System.out.println(flag);
	     
	      if(flag.equals("insert"))
	         {
	    	  System.out.println("inside doget if");
	    	  	insert(request, response);
	         }
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		
		String email=request.getParameter("email");
		String complaint_Subject=request.getParameter("complaint_Subject");
		String complaint_Message=request.getParameter("complaint_Message");
		
				
		ComplaintVO complaintVO = new ComplaintVO();
	
		complaintVO.setEmail(email);
		complaintVO.setComplaint_Subject(complaint_Subject);
		complaintVO.setComplaint_Message(complaint_Message);
		
		
		ComplaintDAO  complaintDAO= new ComplaintDAO();
		complaintDAO.insert(complaintVO);
		 response.sendRedirect("Admin/addcomplaint.jsp");

		
	}

	}


