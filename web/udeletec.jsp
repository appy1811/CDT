<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("id");
        String q = "delete from customers where id=" + pass ;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Customer Details Deleted Successfully");
        response.sendRedirect("uCustomers.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>