<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from users where uname='" + pass + "'";
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "User Deleted Successfully");
        response.sendRedirect("aUsers.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>