<%-- 
    Document   : dashboard
    Created on : 6 Aug, 2022, 4:48:40 PM
    Author     :Apurva
--%>

<%@page contentType="text/html" import="java.sql.*,me.java.app.DBCON" pageEncoding="UTF-8"%>
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
				w[l].push({ "gtm.start": new Date().getTime(), event: "gtm.js" });
				var f = d.getElementsByTagName(s)[0],
					j = d.createElement(s),
					dl = l != "dataLayer" ? "&l=" + l : "";
				j.async = true;
				j.src = "https://www.googletagmanager.com/gtm.js?id=" + i + dl;
				f.parentNode.insertBefore(j, f);
			})(window, document, "script", "dataLayer", "GTM-NXZMQSS");
		</script>
		<!-- End Google Tag Manager -->
	</head>
	<body>
		 

            <jsp:include page="navbar.jsp"/>

				<div class="main-container">
			<div class="xs-pd-20-10 pd-ltr-20">
				<div class="card-box pd-20 height-100-p mb-30">
					<div class="row align-items-center">
						<div class="col-md-4">
							<img src="vendors/images/banner-img.png" alt="" />
						</div>
						<div class="col-md-8">
							<h4 class="font-20 weight-500 mb-10 text-capitalize">
								Welcome back
								 
							</h4>
							 
						</div>
					</div>
				</div>
				<div class="title pb-20">
					<h2 class="h3 mb-0">Overview</h2>
				</div>
 <%
                     String d="0";
                     try{
                 ResultSet rs=DBCON.getConnection().createStatement().executeQuery("select count(*) from users");
                 if(rs.next())
                 {
                      d=rs.getString(1);
                 }
                       
                 %>
				<div class="row pb-10">
					<div class="col-xl-3 col-lg-3 col-md-6 mb-20">
						<div class="card-box height-100-p widget-style3">
							<div class="d-flex flex-wrap">
								<div class="widget-data">
									<div class="weight-700 font-24 text-dark"><%= d %></div>
									<div class="font-14 text-secondary weight-500">
										No. Of Users
									</div>
								</div>
								<div class="widget-icon">
									<div class="icon" data-color="#00eccf">
										<i class="icon-copy dw dw-user1"></i>
									</div>
								</div>
							</div>
						</div>
					</div>
                                                                         <%
                     
                    
                  rs=DBCON.getConnection().createStatement().executeQuery("select count(*) from customers");
                 if(rs.next())
                 {
                      d=rs.getString(1);
                 }
                       
                 %>
					<div class="col-xl-3 col-lg-3 col-md-6 mb-20">
						<div class="card-box height-100-p widget-style3">
							<div class="d-flex flex-wrap">
								<div class="widget-data">
									<div class="weight-700 font-24 text-dark"><%= d %></div>
									<div class="font-14 text-secondary weight-500">
										No. of Customers
									</div>
								</div>
								<div class="widget-icon">
									<div class="icon" data-color="#ff5b5b">
										<span class="icon-copy ti-user"></span>
									</div>
								</div>
							</div>
						</div>
					</div>
                                                                          <%
                     
                    
                  rs=DBCON.getConnection().createStatement().executeQuery("select count(*) from flatdetails");
                 if(rs.next())
                 {
                      d=rs.getString(1);
                 }
                       
                 %>
					<div class="col-xl-3 col-lg-3 col-md-6 mb-20">
						<div class="card-box height-100-p widget-style3">
							<div class="d-flex flex-wrap">
								<div class="widget-data">
									<div class="weight-700 font-24 text-dark"><%= d %></div>
									<div class="font-14 text-secondary weight-500">
										No of Flats
									</div>
								</div>
								<div class="widget-icon">
									<div class="icon">
										<i
											class="icon-copy fa fa-building"
											aria-hidden="true"
										></i>
									</div>
								</div>
							</div>
						</div>
					</div>
                                                                          <%
                     
                    
                  rs=DBCON.getConnection().createStatement().executeQuery("select count(*) from flatbooking");
                 if(rs.next())
                 {
                      d=rs.getString(1);
                 }
                       
                 %>
					<div class="col-xl-3 col-lg-3 col-md-6 mb-20">
						<div class="card-box height-100-p widget-style3">
							<div class="d-flex flex-wrap">
								<div class="widget-data">
									<div class="weight-700 font-24 text-dark"><%= d %></div>
									<div class="font-14 text-secondary weight-500">Bookings </div>
								</div>
								<div class="widget-icon">
									<div class="icon" data-color="#09cc06">
										<i class="icon-copy fa fa-bookmark" aria-hidden="true"></i>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
<%
  }catch(Exception e){System.out.println(e);}
%>
				<div class="row pb-10">
					<div class="col-md-8 mb-20">
						
					</div>
					<div class="col-md-4 mb-20">
						
					</div>
				</div>

				<div class="row">
					<div class="col-lg-4 col-md-6 mb-20">
						
					</div>
					<div class="col-lg-4 col-md-6 mb-20">
						
					</div>
					<div class="col-lg-4 col-md-12 mb-20">
						
					</div>
				</div>

				

				<div class="title pb-20 pt-20">
					
				</div>

				<div class="row">
					<div class="col-md-4 mb-20">
						
					</div>
					<div class="col-md-4 mb-20">
						
					</div>
					<div class="col-md-4 mb-20">
						
					</div>
				</div>

				<!-- <div class="footer-wrap pd-20 mb-20 card-box">
					
				</div> -->
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
