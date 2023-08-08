<%-- 
    Document   : getImage
    Created on : 11 Aug, 2022, 2:56:31 PM
    Author     :Apurva
--%>

<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Blob"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
response.setContentType("image/jpeg");
        try
        {
            /* TODO output your page here. You may use following sample code. */
            // ServletOutputStream out1 = response.getOutputStream(); 
            
             
                byte[] rawBytes = null;

                ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from gallery where id=" + request.getParameter("id"));
                if (rs.next()) {
                    rawBytes = rs.getBytes("photo");
                    response.getOutputStream().write(rawBytes);
//            out.println("</body>");  
//            out.println("</html>");  
                   // out.flush();
                }
            } catch (Exception e) {
                System.out.println(e);
            
        }

%>