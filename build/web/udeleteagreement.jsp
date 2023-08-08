<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from flatagreement where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Flat Agreement Details Deleted Successfully");
        response.sendRedirect("uvAgreement.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>