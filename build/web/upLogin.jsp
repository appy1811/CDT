<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String un, pass;
        un = request.getParameter("un");
        pass = request.getParameter("pass");
        ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from users where uname='" + un + "' and pass='" + pass + "'");
        if (rs.next()) {
            session.setAttribute("uname", un);
            session.setAttribute("name", rs.getString("name"));
            response.sendRedirect("udashboard.jsp");
        } else {
            session.setAttribute("msg", "Invalid Username and Password");
            response.sendRedirect("UserLogin.jsp");
        }
    } catch (Exception e) {
        System.out.println(e);
    }

%>