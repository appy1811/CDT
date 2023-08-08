<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from flatcancel where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Booking-Cancellation Details Deleted Successfully");
        response.sendRedirect("uvCancel.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>