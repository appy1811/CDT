<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from flatbooking where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Flat Bookings Details Deleted Successfully");
        response.sendRedirect("uvbookings.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>