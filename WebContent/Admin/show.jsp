<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<form action="<%=request.getContextPath() %>/YourController" method="post" >
<input type="hidden" name="mode" value="6" />
<table border="1" width="1000" >

<th>S.No.</th>
<th>Attachment Type </th>
<th>Attachment Name </th>
<th>File Name</th>
<th>Image </th>
<th>Action </th>



<c:forEach items="${sessionScope.myList }" var="record">
<tr>
<td align="center" > <input type="checkbox" name="list" value="${record.attachmentMappingID}" /> </td>
<td>${record.attachmentID.attachmentType }

<a href="<%=request.getContextPath() %>/YourController?mode=3&id=${record.attachmentID.attachmentID}" > Delete All File related to me </a>

</td>
<td  >${record.attachmentName }</td>
<td> ${record.path } </td>
<td> <img src="<%=request.getContextPath() %>/doc/${record.path }" width="100" height="100" alt="Image not Found" />  </td>
<td>  <a href="<%=request.getContextPath() %>/YourController?mode=4&id=${record.attachmentMappingID}" > Delete File </a> </td>
</tr>

</c:forEach>

<tr><td align="center" ><input type="submit" value="Delete Selected" />  </td></tr>
</table>


</form>

<a href="<%=request.getContextPath() %>/index.jsp" > Add More File </a><br>



</center>


<p>
Required file(s) for this demo
<ol>
<li> List of JAR's Required
		<ul>
			<li>commons-fileupload-1.2.2.jar</li>
			<li>commons-io-2.1.jar</li>
			<li>commons-io-2.1-javadoc.jar</li>
			<li>commons-io-2.1-sources.jar</li>
 		</ul>
 </li>
 
 <li> Controller,DAO,and VO's required : 
 		<ul>
			<li>YourController.java</li>
			<li>UploadServlet.java</li>
			<li>-----</li>
			<li>AttachmentDAO.java</li>
			<li>AttachmentMappingDAO.java</li>
			<li>-----</li>
			<li>attachmentMappingVO.hbm.xml</li>
			<li>attachmentVO.hbm.xml</li>
			<li>AttachmentMappingVO.java</li>
			<li>AttachmentVO.java</li>
		</ul>
 </li>
 
</ol>
</p>
</body>
</html>