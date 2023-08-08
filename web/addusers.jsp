<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {

        String q = "insert into users(uname,name,email,pass,phno,address) values('"
                + request.getParameter("uname") + "','" + request.getParameter("name") + "','"
                + request.getParameter("email") + "','" + request.getParameter("pass") + "','" + request.getParameter("phno") + "','" + request.getParameter("add") + "')";
        System.out.println(q);

        ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from users where email='" + request.getParameter("email") + "' or uname='" + request.getParameter("uname") + "'");
        if (rs.next()) {
            session.setAttribute("msg", "User Name or EMail-ID already exist.");
            response.sendRedirect("aUsers.jsp");
        }
        else{
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "User Added Successfully");
        response.sendRedirect("aUsers.jsp");
        }
    } catch (Exception e) {
        System.out.println(e);
    }

%>