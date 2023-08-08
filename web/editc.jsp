<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"%>

<%
try{
    
    String q="update customers set name='"+ request.getParameter("name") +"',email='"+ request.getParameter("email") +"',phno='"+ request.getParameter("phno") +"',address='"+ request.getParameter("add") +"' where id="+ request.getParameter("id") ;
 
    
    DBCON.getConnection().createStatement().executeUpdate(q);
 
    session.setAttribute("msg", "Customer Updated Successfully");
     response.sendRedirect("aCustomers.jsp");

}
catch(Exception e){
System.out.println(e);
}

%>