<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {

        String q = "insert into customers(name,email,phno,address) values('" + request.getParameter("name") + "','"
                + request.getParameter("email") + "','" + request.getParameter("phno") + "','" + request.getParameter("add") + "')";
        System.out.println(q);

        ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from customers where email='" + request.getParameter("email") + "'");
        if (rs.next()) {
            session.setAttribute("msg", "EMail-ID already exist.");
            response.sendRedirect("aCustomers.jsp");
        }
        else{
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Customer Added Successfully");
        response.sendRedirect("uCustomers.jsp");
        }
    } catch (Exception e) {
        System.out.println(e);
    }

%>