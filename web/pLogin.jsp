<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
try{
    String un,pass;
    un=request.getParameter("un");
    pass=request.getParameter("pass");
ResultSet rs=DBCON.getConnection().createStatement().executeQuery("select * from admin where uname='"+un+"' and password='"+pass+"'");
if(rs.next())
{
    session.setAttribute("uname", un);
    session.setAttribute("name", rs.getString("fname"));
    response.sendRedirect("dashboard.jsp");
}
else
{
    session.setAttribute("msg", "Invalid Username and Password");
     response.sendRedirect("adminLogin.jsp");
}
}
catch(Exception e){
System.out.println(e);
}

%>