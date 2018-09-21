package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BranchDAO;
import VO.BranchVO;

/**
 * Servlet implementation class BranchController
 */
@WebServlet("/BranchController")
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BranchController() {
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
	     
	      if(flag.equals("InsertBranch"))
	         {
	    	  	insert(request, response);
	         }
	      }
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String BranchName=request.getParameter("BranchName");
		String BranchDescription=request.getParameter("BranchDescription");
		
		BranchVO branchVO=new BranchVO();
		 branchVO.setBranchName(BranchName);
		 branchVO.setBranchDescription(BranchDescription);
		 
		 BranchDAO branchDAO=new BranchDAO();
		 branchDAO.insert(branchVO);
		 
		 response.sendRedirect("ADMIN/Add_Branch.jsp");
    }

}
