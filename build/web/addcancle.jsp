<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
        String pass;

        pass = request.getParameter("bid");
        ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from flatbooking where id=" + pass);
        if (rs.next()) {
            int amt = Integer.parseInt(request.getParameter("amt"));
            if (amt > Integer.parseInt(rs.getString("bamt"))) {
                session.setAttribute("msg", "Cancellation Amount is more than Booking Amount.");
                response.sendRedirect("uvCancel.jsp");
            }
        }

        String q = "INSERT INTO flatcancel( fid, cid, cdate, camt, bid) VALUES (" + request.getParameter("fid") + ","
                + request.getParameter("cid") + ",'" + request.getParameter("bdate") + "','" + request.getParameter("amt") + "'," + request.getParameter("bid") + ")";
        System.out.println(q);

        DBCON.getConnection().createStatement().executeUpdate(q);

        q = "delete from flatbooking where id=" + pass;
        DBCON.getConnection().createStatement().executeUpdate(q);

        session.setAttribute("msg", "Booking-Cancellation Added Successfully");
        response.sendRedirect("uvCancel.jsp");

    } catch (Exception e) {
        System.out.println(e);
    }

%>