<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {

        String q = "INSERT INTO flatdetails( roomno, buildingno, projectno, description, area, amount) VALUES ('" + request.getParameter("fno") + "','"
                + request.getParameter("bno") + "','" + request.getParameter("pno") + "','" + request.getParameter("desc") + "','" + request.getParameter("area") + "','" + request.getParameter("amount") + "')";
        System.out.println(q);

        
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Flat Details Added Successfully");
        response.sendRedirect("FlatDetails.jsp");
         
    } catch (Exception e) {
        System.out.println(e);
    }

%>