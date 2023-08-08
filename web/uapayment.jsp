<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.*"  %>

<%
    try {
         
            int amt = Integer.parseInt(request.getParameter("amt"));
            if (amt > Integer.parseInt(request.getParameter("ramt"))) {
                session.setAttribute("msg", "Amount is more than Remaining Amount.");
                
                response.sendRedirect("addpayment.jsp?id="+request.getParameter("bid"));
            }
            else{

        String q = "INSERT INTO flatpayment( fid, cid, pdate, pamt, bid) VALUES (" + request.getParameter("fid") + ","
                + request.getParameter("cid") + ",'" + request.getParameter("pdate") + "','" + request.getParameter("amt") + "'," 
                + request.getParameter("bid") + ")";
        System.out.println(q);

        DBCON.getConnection().createStatement().executeUpdate(q);

        

        session.setAttribute("msg", "Booking-payment Details Added Successfully");
        response.sendRedirect("uvpayments.jsp");
            }
    } catch (Exception e) {
        System.out.println(e);
    }

%>