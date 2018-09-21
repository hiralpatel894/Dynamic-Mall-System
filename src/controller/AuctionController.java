package controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.AuctionMappingVO;
import VO.AuctionVO;
import VO.CategoryVO;
import VO.PostingMappingVO;
import VO.PostingVO;
import VO.SubcategoryVO;
import DAO.AuctionDAO;
import DAO.AuctionMappingDAO;
import DAO.CategoryDAO;
import DAO.PostingDAO;
import DAO.PostingMappingDAO;
import DAO.SubcategoryDAO;

/**
 * Servlet implementation class AuctionController
 */
@WebServlet("/AuctionController")
public class AuctionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		if(flag.equals("load"))
		{
			load(request,response);
		}
		if(flag.equals("search"))
		{
			search(request,response);
		}
	
		if(flag.equals("edit"))
		{
			edit(request,response);
		}
	
	}

	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		int auction_Id = Integer.parseInt(request.getParameter("Id"));
		CategoryDAO categoryDAO = new CategoryDAO();
		List cat = categoryDAO.load();
		HttpSession httpSession3 = request.getSession();
		httpSession3.setAttribute("category", cat);
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List subcat = subcategoryDAO.load();
		HttpSession httpSession4 = request.getSession();
		httpSession4.setAttribute("subcat1", subcat);
		
		AuctionVO auctionVO = new AuctionVO();
		auctionVO.setAuction_Id(auction_Id);
		
		AuctionDAO auctionDAO = new AuctionDAO();
		List list = auctionDAO.getElementByID(auctionVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("set", list);
		
		AuctionMappingVO auctionMappingVO = new AuctionMappingVO();
		auctionMappingVO.setAuctionVO(auctionVO);
		
		AuctionMappingDAO auctionMappingDAO = new AuctionMappingDAO();
		HttpSession httpSession2 = request.getSession();
		List list1 = auctionMappingDAO.getElementByID(auctionMappingVO);
		httpSession2.setAttribute("map",list1);
		
		response.sendRedirect("Admin/editAuction.jsp");

	}

	

	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("11111111111");
		AuctionDAO auctionDAO = new AuctionDAO();
		List list = auctionDAO.showAll();
		HttpSession session1 = request.getSession();
		session1.setAttribute("List",list);	
	
		AuctionMappingDAO auctionMappingDAO = new AuctionMappingDAO();
		List myList = auctionMappingDAO.showAll();
		session1.setAttribute("myList", myList);
		response.sendRedirect("Admin/searchAuction.jsp");	
	}

	private void load(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		CategoryDAO l=new CategoryDAO();
		List ls=l.load();
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List list1 = subcategoryDAO.load();
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("category",ls);
		httpSession.setAttribute("subcategory",list1);
		response.sendRedirect("Admin/addAuction.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flag = request.getParameter("flag");
		if(flag.equals("insert"))
		{
			insert(request,response);
		}
		if(flag.equals("update"))
		{
			update(request,response);
		}
	
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("auction jj");
		
		String product_Name = request.getParameter("product_Name");
		String product_Desc = request.getParameter("product_Desc");
		String product_Brand = request.getParameter("product_Brand");
		String arrival_time = request.getParameter("arrival_time");
		String departure_time = request.getParameter("departure_time");
		int min_bid_amt = Integer.parseInt(request.getParameter("min_bid_amt"));
		
		String auction_Name = request.getParameter("auction_Name");
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_Name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		AuctionVO auctionVO = new AuctionVO();
		auctionVO.setAuction_Id(Integer.parseInt(request.getParameter("Id")));
		auctionVO.setCategoryVO(categoryVO);
		auctionVO.setSubcategoryVO(subcategoryVO);
		auctionVO.setProduct_Name(product_Name);
		auctionVO.setProduct_Desc(product_Desc);
		auctionVO.setProduct_Brand(product_Brand);
		auctionVO.setArrival_time(arrival_time);
		auctionVO.setDeparture_time(departure_time);
		auctionVO.setMin_bid_amt(min_bid_amt);
		
		HttpSession session =request.getSession();
		List myList1=(List)session.getAttribute("fileList1");
 		
		 Iterator itr1 =  myList1.iterator();
         
         System.out.println("Reading for session");
         while (itr1.hasNext()) 
         {
        	auctionVO.setLogo((String)itr1.next());
        	
        }
		
         session.removeAttribute("fileList1");
		
		AuctionDAO auctionDAO = new AuctionDAO();
		auctionDAO.update(auctionVO);
		
		AuctionMappingVO auctionMappingVO = new AuctionMappingVO();	
		auctionMappingVO.setAuctionVO(auctionVO);		
		
		AuctionMappingDAO auctionMappingDAO = new AuctionMappingDAO();
		
		
		//getting file from Session
		
		List myList=(List)session.getAttribute("fileList");
		String url = (String) session.getAttribute("url");
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         
         while (itr.hasNext()) 
         {
        	auctionMappingVO.setAuction_Name((String)itr.next());
        	auctionMappingVO.setPath(url);
        	 
        	auctionMappingDAO.insert(auctionMappingVO);
        	 
        }
		
         session.removeAttribute("fileList");
       //show(request, response);
         
       //getting file from Session
 		
 		
         
         search(request, response);

	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		 
		String product_Name = request.getParameter("product_Name");
		String product_Desc = request.getParameter("product_Desc");
		String product_Brand = request.getParameter("product_Brand");
		String arrival_time = request.getParameter("arrival_time");
		String departure_time = request.getParameter("departure_time");
		int min_bid_amt = Integer.parseInt(request.getParameter("min_bid_amt"));
		
		String auction_Name = request.getParameter("auction_Name");
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_Name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		AuctionVO auctionVO = new AuctionVO();
		auctionVO.setCategoryVO(categoryVO);
		auctionVO.setSubcategoryVO(subcategoryVO);
		auctionVO.setProduct_Name(product_Name);
		auctionVO.setProduct_Desc(product_Desc);
		auctionVO.setProduct_Brand(product_Brand);
		auctionVO.setArrival_time(arrival_time);
		auctionVO.setDeparture_time(departure_time);
		auctionVO.setMin_bid_amt(min_bid_amt);
		
		HttpSession session =request.getSession();
		List myList1=(List)session.getAttribute("fileList1");
 		
		 Iterator itr1 =  myList1.iterator();
         
         System.out.println("Reading for session");
         while (itr1.hasNext()) 
         {
        	auctionVO.setLogo((String)itr1.next());
        	
        }
		
         session.removeAttribute("fileList1");
		
		AuctionDAO auctionDAO = new AuctionDAO();
		auctionDAO.insert(auctionVO);
		
		AuctionMappingVO auctionMappingVO = new AuctionMappingVO();	
		auctionMappingVO.setAuctionVO(auctionVO);		
		
		AuctionMappingDAO auctionMappingDAO = new AuctionMappingDAO();
		
		
		//getting file from Session
		
		List myList=(List)session.getAttribute("fileList");
		String url = (String) session.getAttribute("url");
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         
         while (itr.hasNext()) 
         {
        	auctionMappingVO.setAuction_Name((String)itr.next());
        	auctionMappingVO.setPath(url);
        	 
        	auctionMappingDAO.insert(auctionMappingVO);
        	 
        }
		
         session.removeAttribute("fileList");
       //show(request, response);
         
       //getting file from Session
 		
 		
         response.sendRedirect("Admin/addAuction.jsp");	
	}

}
