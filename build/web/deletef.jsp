<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from flatdetails where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Flat Details Deleted Successfully");
        response.sendRedirect("FlatDetails.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>