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





import DAO.CategoryDAO;
import DAO.ProductDAO;


import DAO.ProductMappingDAO;
import DAO.SubcategoryDAO;

import VO.ProductMappingVO;
import VO.ProductVO;
import VO.CategoryVO;
import VO.SubcategoryVO;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
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
		int product_Id = Integer.parseInt(request.getParameter("Id"));
		CategoryDAO categoryDAO = new CategoryDAO();
		List cat = categoryDAO.load();
		HttpSession httpSession3 = request.getSession();
		httpSession3.setAttribute("category", cat);
		
		SubcategoryDAO subcategoryDAO = new SubcategoryDAO();
		List subcat = subcategoryDAO.load();
		HttpSession httpSession4 = request.getSession();
		httpSession4.setAttribute("subcat1", subcat);
		
		ProductVO productVO = new ProductVO();
		productVO.setProduct_Id(product_Id);
		
		ProductDAO productDAO = new ProductDAO();
		List list = productDAO.getElementByID(productVO);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("set", list);
		
		ProductMappingVO productMappingVO = new ProductMappingVO();
		productMappingVO.setProductVO(productVO);
		
		ProductMappingDAO productMappingDAO = new ProductMappingDAO();
		HttpSession httpSession2 = request.getSession();
		List list1 = productMappingDAO.getElementByID(productMappingVO);
		httpSession2.setAttribute("map",list1);
		
		response.sendRedirect("Admin/editproducts.jsp");
	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("11111111111");
		ProductDAO productDAO = new ProductDAO();
		List list = productDAO.showAll();
		HttpSession session1 = request.getSession();
		session1.setAttribute("List",list);	
	
		ProductMappingDAO productMappingDAO = new ProductMappingDAO();
		List myList = productMappingDAO.showAll();
		session1.setAttribute("myList", myList);
		response.sendRedirect("Admin/searchproducts.jsp");	

		
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
		response.sendRedirect("Admin/addproducts.jsp");	
		
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
		
		
System.out.println("product jj");
		
		String product_Name = request.getParameter("product_Name");
		String product_Desc = request.getParameter("product_Desc");
		String product_Brand = request.getParameter("product_Brand");
		
		
		
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_Name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		ProductVO productVO = new ProductVO();
		productVO.setProduct_Id(Integer.parseInt(request.getParameter("Id")));
		productVO.setCategoryVO(categoryVO);
		productVO.setSubcategoryVO(subcategoryVO);
		productVO.setProduct_Name(product_Name);
		productVO.setProduct_Desc(product_Desc);
		productVO.setProduct_Brand(product_Brand);
		
		
		HttpSession session =request.getSession();
		List myList1=(List)session.getAttribute("fileList1");
 		
		 Iterator itr1 =  myList1.iterator();
         
         System.out.println("Reading for session");
         while (itr1.hasNext()) 
         {
        	 productVO.setLogo((String)itr1.next());
        	
        }
		
         session.removeAttribute("fileList1");
		
         ProductDAO productDAO = new ProductDAO();
         productDAO.update(productVO);
		
         ProductMappingVO productMappingVO = new  ProductMappingVO();	
		productMappingVO.setProductVO(productVO);		
		
		 ProductMappingDAO productMappingDAO = new  ProductMappingDAO();
		
		
		//getting file from Session
		
		List myList=(List)session.getAttribute("fileList");
		String url = (String) session.getAttribute("url");
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         
         while (itr.hasNext()) 
         {
        	 productMappingVO.setProduct_Name((String)itr.next());
        	 productMappingVO.setPath(url);
        	 
        	 productMappingDAO.insert(productMappingVO);
        	 
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
	
	
		
		int k = Integer.parseInt(request.getParameter("cat_Id"));
		int j = Integer.parseInt(request.getParameter("subcat_Name"));
		
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCat_Id(k);
		
		SubcategoryVO subcategoryVO = new SubcategoryVO();
		subcategoryVO.setSubcat_Id(j);
		
		ProductVO productVO = new ProductVO();
		productVO.setCategoryVO(categoryVO);
		productVO.setSubcategoryVO(subcategoryVO);
		productVO.setProduct_Name(product_Name);
		productVO.setProduct_Desc(product_Desc);
		productVO.setProduct_Brand(product_Brand);
		
		
		HttpSession session =request.getSession();
		List myList1=(List)session.getAttribute("fileList1");
 		
		 Iterator itr1 =  myList1.iterator();
         
         System.out.println("Reading for session");
         while (itr1.hasNext()) 
         {
        	 productVO.setLogo((String)itr1.next());
        	
        }
		
         session.removeAttribute("fileList1");
		
		ProductDAO productDAO = new ProductDAO();
		productDAO.insert(productVO);
		
		ProductMappingVO productMappingVO = new ProductMappingVO();	
		productMappingVO.setProductVO(productVO);		
		
		ProductMappingDAO productMappingDAO = new ProductMappingDAO();
		
		
		//getting file from Session
		
		List myList=(List)session.getAttribute("fileList");
		String url = (String) session.getAttribute("url");
		 Iterator itr =  myList.iterator();
         
         System.out.println("Reading for session");
         
         while (itr.hasNext()) 
         {
        	productMappingVO.setProduct_Name((String)itr.next());
        	productMappingVO.setPath(url);
        	 
        	productMappingDAO.insert(productMappingVO);
        	 
        }
		
         session.removeAttribute("fileList");
       //show(request, response);
         
       //getting file from Session
 		
 		
         response.sendRedirect("Admin/addproducts.jsp");	
		
	}

}
