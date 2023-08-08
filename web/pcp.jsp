<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("pass");
        String q = "update admin set password='" + pass + "' where uname='" + session.getAttribute("uname").toString() + "'";
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Password Change Successfully");
        response.sendRedirect("acp.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>