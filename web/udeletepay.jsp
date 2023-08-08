<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from flatpayment where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Booking-Payment Details Deleted Successfully");
        response.sendRedirect("uvpayments.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>