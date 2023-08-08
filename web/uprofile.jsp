<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("name");
        String add = request.getParameter("add");
        String phno = request.getParameter("phno");
        String email = request.getParameter("email");
        String q = "update users set name='" + pass + "',address='" + add + "',email='" + email + "',phno='" + phno + "' where uname='" + session.getAttribute("uname").toString() + "'";
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Profile Updated Successfully");
        response.sendRedirect("profile.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>