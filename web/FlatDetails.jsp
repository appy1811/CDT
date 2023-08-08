<%-- 
    Document   : dashboard
    Created on : 6 Aug, 2022, 4:48:40 PM
    Author     :Apurva
--%>

<%@page import="me.java.app.DBCON"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <!-- Basic Page Info -->
        <meta charset="utf-8" />
        <title>CDT</title>

        <!-- Site favicon -->
        <link
            rel="apple-touch-icon"
            sizes="180x180"
            href="vendors/images/apple-touch-icon.png"
            />
        <link
            rel="icon"
            type="image/png"
            sizes="32x32"
            href="vendors/images/favicon-32x32.png"
            />
        <link
            rel="icon"
            type="image/png"
            sizes="16x16"
            href="vendors/images/favicon-16x16.png"
            />

        <!-- Mobile Specific Metas -->
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, maximum-scale=1"
            />

        <!-- Google Font -->
        <link
            href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap"
            rel="stylesheet"
            />
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="vendors/styles/core.css" />
        <link
            rel="stylesheet"
            type="text/css"
            href="vendors/styles/icon-font.min.css"
            />
        <link rel="stylesheet" type="text/css" href="vendors/styles/style.css" />

        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script
            async
            src="https://www.googletagmanager.com/gtag/js?id=G-GBZ3SGGX85"
        ></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag("js", new Date());

            gtag("config", "G-GBZ3SGGX85");
        </script>
        <!-- Google Tag Manager -->
        <script>
            (function (w, d, s, l, i) {
                w[l] = w[l] || [];
                w[l].push({"gtm.start": new Date().getTime(), event: "gtm.js"});
                var f = d.getElementsByTagName(s)[0],
                        j = d.createElement(s),
                        dl = l != "dataLayer" ? "&l=" + l : "";
                j.async = true;
                j.src = "https://www.googletagmanager.com/gtm.js?id=" + i + dl;
                f.parentNode.insertBefore(j, f);
            })(window, document, "script", "dataLayer", "GTM-NXZMQSS");
        </script>
        <script>
            function matchPassword() {
                var pw1 = document.getElementById("pass").value;
                var pw2 = document.getElementById("rpass").value;
                if (pw1 != pw2)
                {
                    alert("Passwords did not match");
                    return false;
                }
                 if(pw1=="" || pw2=="")
  {
       alert("Please fill Passwords");  
    return false;
  }  
                return true;
            }
        </script>  
        <!-- End Google Tag Manager -->
    </head>
    <body>


        <jsp:include page="navbar.jsp"/>

        <div class="main-container">
            <div class="pd-ltr-20 xs-pd-20-10">
                <h2>Manage Flat Details</h2>
                <br>    
                <form  method="post" action="addflats.jsp">
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Project Name</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Project Name" id="rpass" name="pno" type="text">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Building Name</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Building Name/No" id="rpass" name="bno" type="text">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Room Number</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Room Number" id="rpass" name="fno" type="number">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Area</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Area" id="rpass" name="area" type="number">
                        </div>
                    </div>
                  
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Amount</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" type="text" placeholder="Amount" required="" name="amount" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Description</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Details Flat Description" id="pass" name="desc" type="text">
                        </div>
                    </div>
                   
                    <div class="form-group row">
                       
                        <div class="col-sm-12 col-md-10">
                            <input type="submit" value="Add" class="btn btn-primary">
                        </div>
                    </div>
                        <div class="form-group row">
                        <label class="col-sm-12 col-md-12 col-form-label"><%
                            try{String msg=session.getAttribute("msg").toString();
                            if(!msg.equals(""))
                            {
                                out.println(msg);
                                session.setAttribute("msg","");
                            }
                                }catch(Exception e){System.out.println(e);}
                            %></label>
                         
                    </div>
                </form>
                            <hr><h3>View Flat Details</h3><hr>
                            <table class="table table-responsive-lg pagination-sm">
                                <thead>
                                <th>ID</th>
                                <th>Project Name</th> <th>Building Name/No.</th> <th>Room No</th> <th>Area</th> <th>Amount</th> <th>Description</th>
                               <th></th>  </thead>
                                <tbody>
                                  <%
                                                    try{
                                                    ResultSet rs=DBCON.getConnection().createStatement().executeQuery("select * from flatdetails");
                                                    for(int i=1;rs.next();i++)
                                                    {
                                                        %>
                                                     <tr>
                                                        <td><%=i%></td>
                                                        <td><%=rs.getString("projectno")%></td>
                                                        <td><%=rs.getString("buildingno")%></td>
                                                        <td><%=rs.getString("roomno")%></td>
                                                        <td><%=rs.getString("area")%></td> 
                                                        <td><%=rs.getString("amount")%></td>
                                                        <td><%=rs.getString("description")%></td>
                                                        <td><a href="Editf.jsp?id=<%=rs.getString("id")%>">Edit</a> <a href="deletef.jsp?id=<%=rs.getString("id")%>">Delete</a> </td>
                                                    </tr>
                                                    
                                                    <%
                                                    }
                                                    
                                                    }
                                                    catch(Exception e){System.err.println(e);}
                                                    %>
                                </tbody>
                            </table>
            </div>
        </div>
        <!-- welcome modal start -->


        <!-- welcome modal end -->
        <!-- js -->
        <script src="vendors/scripts/core.js"></script>
        <script src="vendors/scripts/script.min.js"></script>
        <script src="vendors/scripts/process.js"></script>
        <script src="vendors/scripts/layout-settings.js"></script>
        <!-- Google Tag Manager (noscript) -->
        <noscript
            ><iframe
            src="https://www.googletagmanager.com/ns.html?id=GTM-NXZMQSS"
            height="0"
            width="0"
            style="display: none; visibility: hidden"
            ></iframe
        ></noscript>
        <!-- End Google Tag Manager (noscript) -->
    </body>
</html>
