<%-- 
    Document   : downloadAgreement
    Created on : 11 Aug, 2022, 7:24:43 PM
    Author     :Apurva
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Blob"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
try{
     String id = request.getParameter("id");
        Blob b;
        String fileName = "";
        Connection con = DBCON.getConnection();

        ResultSet rs = con.createStatement().executeQuery("select * from flatagreement where id=" + id);
        while (rs.next()) {
            fileName =rs.getString("id")+"_doc";
            b = rs.getBlob("adoc");
            fileName = fileName + ".pdf";
            //Download resume directly on client side without downloading on server
            
            response.reset();
            response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
            response.getOutputStream().write(b.getBytes(1, (int) b.length()));
            response.getOutputStream().flush();
            response.getOutputStream().close();
        }
}catch(Exception e){System.out.println(e);
}

%>