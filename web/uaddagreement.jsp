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
                var pw1 = document.getElementById("amt").value;
                var pw2 = document.getElementById("bamt").value;
                if (pw1 > pw2)
                {
                    alert("Return Amount is large than Booking Amount of flat");
                    return false;
                }
                 
                return true;
            }
        </script>  
        <!-- End Google Tag Manager -->
    </head>
    <body>


        <jsp:include page="unavbar.jsp"/>

        <div class="main-container">
            <div class="pd-ltr-20 xs-pd-20-10">
                <div class="form-group row">

                    <div class="col-sm-12 col-md-10">

                    </div>
                 </div>
                <div class="row">
                    <label class="col-sm-12 col-md-12 col-form-label"><%
                        try {
                            String msg = session.getAttribute("msg").toString();
                            if (!msg.equals("")) {
                              %>
                        <%=msg  %>
                        <%
                                session.setAttribute("msg", "");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        %></label>

                </div>

                <hr><h3>Select Bookings For Cancellation</h3><hr>
                <form method="post" action="addagree" enctype="multipart/form-data">
                <table class="table hover nowrap">
                    <thead>
                    <th>Select</th><th>ID</th>
                    <th>Project Name</th> <th>Building No</th> <th>Room No</th> <th>Area</th> <th>Amount</th> 
                    <th>Customer Name</th> <th>Booking Date</th> <th>Booking Amount</th> 
                    </thead>
                    <tbody>
                        <%
                            try {
                                ResultSet rs = DBCON.getConnection().createStatement().executeQuery("SELECT * FROM `flatdetails`,customers,flatbooking where flatbooking.fid=flatdetails.id and flatbooking.cid=customers.id");
                               if(!rs.next())
                               {
                                   session.setAttribute("msg", "No Bookings are available For Agreement.");
                                   response.sendRedirect("uvAgreement.jsp");
                               }
                                rs.beforeFirst();
                                for (int i = 1; rs.next(); i++) {
                        %>
                        <tr>
                            <td><input type="radio" required="" name="bid" value="<%=rs.getString("flatbooking.id") %>" >
                                <input type="hidden" required="" name="fid" value="<%=rs.getString("flatdetails.id") %>" >
                                <input type="hidden" required="" name="cid" value="<%=rs.getString("customers.id") %>" >
                            
                            </td><td><%=i%></td>
                            <td><%=rs.getString(4)%></td>
                            <td><%=rs.getString(3)%></td>
                            <td><%=rs.getString(2)%></td>
                            <td><%=rs.getString(6)%></td> 
                            <td><%=rs.getString(7)%></td>
                            <td><%=rs.getString(9)%></td>
                            <td><%=rs.getString(16)%></td> 
                            <td><%=rs.getString(17)%>
                                <input type="hidden" required="" name="bamt" id="bamt" value="<%=rs.getString(17) %>" >
                            </td>
                           
                        </tr>

                        <%
                                }

                            } catch (Exception e) {
                                System.err.println(e);
                            }
                        %>
                    </tbody>
                </table>
                      <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Date</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Agreement date" id="rpass" name="adate" type="date">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label"> Amount</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" id="amt" placeholder="Return Amount"  name="amt" type="number">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Agreement Document</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" id="amt" placeholder="Agreement Document"  name="photo" type="file">
                        </div>
                    </div>
                    <div class="form-group row">

                        <div class="col-sm-12 col-md-10">
                            <input type="submit" value="Add" class="btn btn-primary">
                        </div>
                    </div>
            </form>
                    
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
        <script src="src/plugins/datatables/js/jquery.dataTables.min.js"></script>
        <script src="src/plugins/datatables/js/dataTables.bootstrap4.min.js"></script>
        <script src="src/plugins/datatables/js/dataTables.responsive.min.js"></script>
        <script src="src/plugins/datatables/js/responsive.bootstrap4.min.js"></script>
        <!-- buttons for Export datatable -->
        <script src="src/plugins/datatables/js/dataTables.buttons.min.js"></script>
        <script src="src/plugins/datatables/js/buttons.bootstrap4.min.js"></script>
        <script src="src/plugins/datatables/js/buttons.print.min.js"></script>
        <script src="src/plugins/datatables/js/buttons.html5.min.js"></script>
        <script src="src/plugins/datatables/js/buttons.flash.min.js"></script>
        <script src="src/plugins/datatables/js/pdfmake.min.js"></script>
        <script src="src/plugins/datatables/js/vfs_fonts.js"></script>
        <!-- Datatable Setting js -->
        <script src="vendors/scripts/datatable-setting.js"></script>
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
