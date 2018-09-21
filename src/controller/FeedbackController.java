package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FeedbackDAO;

import VO.FeedbackVO;

/**
 * Servlet implementation class FeedbackController
 */
@WebServlet("/FeedbackController")
public class FeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object feedback_Message;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackController() {
      
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
		
		
		String email=request.getParameter("email");
		
		String feedback_Message=request.getParameter("feedback_Message");
		
		
		
		
		
		FeedbackVO feedbackVO = new FeedbackVO();
	
		feedbackVO.setEmail(email);
		
	
		feedbackVO.setFeedback_Message(feedback_Message);
	
		
		FeedbackDAO  feedbackDAO= new FeedbackDAO();
		feedbackDAO.insert(feedbackVO);
		 response.sendRedirect("Admin/addfeedback.jsp");

		
	}
	}


