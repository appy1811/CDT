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
                if (pw1 == "" || pw2 == "")
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
                <h2>Edit Flat Details</h2>
                <br>    
                <%
                    String un = request.getParameter("id").toString();
                    ResultSet rs = DBCON.getConnection().createStatement().executeQuery("select * from flatdetails where id=" + un);
                    if (rs.next()) {
                %>
                <form  method="post" action="fedit.jsp">
                    <div class="form-group row">
                        
                        <label class="col-sm-12 col-md-2 col-form-label">Project Name</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Project Name"  value="<%=rs.getString("projectno")%>" id="rpass" name="pno" type="text">
                        </div><input class="form-control" required="" placeholder="Full Name" value="<%=un%>" name="id" type="hidden">
                         
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Building Name</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" value="<%=rs.getString("buildingno")%>" placeholder="Building Name/No" id="rpass" name="bno" type="text">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Room Number</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" value="<%=rs.getString("roomno")%>" placeholder="Room Number" id="rpass" name="fno" type="number">
                        </div>
                    </div>
                     <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Area</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Area" value="<%=rs.getString("area")%>" id="rpass" name="area" type="number">
                        </div>
                    </div>
                  
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Amount</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" type="number" placeholder="Amount" value="<%=rs.getString("amount")%>" required="" name="amount" >
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-sm-12 col-md-2 col-form-label">Description</label>
                        <div class="col-sm-12 col-md-10">
                            <input class="form-control" required="" placeholder="Details Flat Description" id="pass" value="<%=rs.getString("description")%>" name="desc" type="text">
                        </div>
                    </div>
                   

                    <%

                        }


                    %>
                    
                    <div class="form-group row">

                        <div class="col-sm-12 col-md-10">
                            <input type="submit" value="Save" class="btn btn-primary"
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
