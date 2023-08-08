<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {

        String q = "INSERT INTO flatbooking( fid, cid, bdate, bamt) VALUES (" + request.getParameter("id") + ","
                + request.getParameter("cid") + ",'" + request.getParameter("bdate") + "','" + request.getParameter("amt") + "')";
        System.out.println(q);

       
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Booking Added Successfully");
        response.sendRedirect("uvbookings.jsp");
        
    } catch (Exception e) {
        System.out.println(e);
    }

%>