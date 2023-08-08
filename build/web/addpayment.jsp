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
                var pw1 = document.getElementById("famt").value;
                var pw2 = document.getElementById("bamt").value;
                if (pw2 > pw1)
                {
                    alert("Booking Amount is large than actual cost of flat");
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
                <h2>Add Flat-Payment Details</h2>
                <br>    
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
                
                <form method="post"  action="uapayment.jsp">
                    <b>Select Flat Details</b><hr>
                    <table class="data-table table stripe hover nowrap">
                        <thead>
                        <th>Select</th> <th>ID</th>
                        <th>Project Name</th> <th>Building No</th> <th>Room No</th> <th>Area</th> <th>Amount</th> 
                        <th>Customer Name</th>  
                        </thead>
                        <tbody>
                            <%
                                try {
                                    ResultSet rs = DBCON.getConnection().createStatement().executeQuery("SELECT * FROM `flatdetails`,customers,flatbooking where flatbooking.fid=flatdetails.id and flatbooking.cid=customers.id and flatbooking.id=" + request.getParameter("id"));
                                    int i = 1;
                                    if (rs.next()) {
                            %>
                            <tr>
                                <td><input type="radio" required="" checked=""  name="bid" value="<%=rs.getString("flatbooking.id")%>" >
                                    <input type="hidden" required="" checked=""  name="cid" value="<%=rs.getString("customers.id")%>" >
                                    <input type="hidden" required="" checked=""  name="fid" value="<%=rs.getString("flatdetails.id")%>" ></td> 
                                <td><%=i%></td>
                                <td><%=rs.getString(4)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(6)%></td> 
                                <td><%=rs.getString(7)%></td>
                                <td><%=rs.getString(9)%></td>



                            </tr>


                        </tbody>
                    </table>
                    <table class="data-table table stripe hover nowrap">
                        <thead>
                        <th>Total Amount</th> <th>Paid Amount Till date</th> 
                        <th>Remaining Amount</th>  
                        </thead>
                        <tbody>
                            <%

                                ResultSet rs1 = DBCON.getConnection().createStatement().executeQuery("SELECT flatdetails.amount,sum(flatpayment.pamt),(flatdetails.amount-sum(flatpayment.pamt)) FROM flatpayment,flatdetails where flatpayment.fid=flatdetails.id and flatdetails.id=" + rs.getString("flatdetails.id"));
                                for (i = 1; rs1.next(); i++) {
                            %>
                            <tr>

                                <td><%=""+rs1.getString(1)%></td>
                                <td><%=""+rs1.getString(2)%></td>
                                <td><%=""+rs1.getString(3)%>
                                  <input type="hidden" required="" checked=""  name="ramt" value="<%=rs1.getString(3)%>" >
                                </td>




                            </tr>

                            <%
                                        }

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
                            <input class="form-control" required="" placeholder="Payment date" id="rpass" name="pdate" type="date">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label"> Amount</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" id="bamt" placeholder=" Amount"  name="amt" type="number">
                        </div>
                    </div>

                    <div class="col-sm-12 col-md-10">
                        <input type="submit" value="Add payment Details" class="btn btn-primary">
                    </div>
            </div>

            <div class="form-group row">
                <label class="col-sm-12 col-md-12 col-form-label"><%
                    try {
                        String msg = session.getAttribute("msg").toString();
                        if (!msg.equals("")) {
                            out.println(msg);
                            session.setAttribute("msg", "");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    %></label>

            </div>
        </div>
    </div>
    <!-- welcome modal start -->


    <!-- welcome modal end -->
    <!-- js -->
    <script src="vendors/scripts/core.js"></script>
    <script src="vendors/scripts/script.min.js"></script>
    <script src="vendors/scripts/process.js"></script>
    <script src="vendors/scripts/layout-settings.js"></script>
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
