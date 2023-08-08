<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"%>

<%
try{
    
    String q="update flatdetails set roomno='"+ request.getParameter("fno") +"',buildingno='"+
            request.getParameter("bno") +"',projectno='"+ request.getParameter("pno") +"',area='"+ 
            request.getParameter("area") +"',amount='"+ request.getParameter("amount") +"',description='"+ request.getParameter("desc") +"' where id="+ request.getParameter("id") ;
 
    
    DBCON.getConnection().createStatement().executeUpdate(q);
 
    session.setAttribute("msg", "Flat  Updated Successfully");
     response.sendRedirect("FlatDetails.jsp");

}
catch(Exception e){
System.out.println(e);
}

%>