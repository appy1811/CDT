<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from gallery where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Flat Gallery Deleted Successfully");
        response.sendRedirect("UGallery.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>