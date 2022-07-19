<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/assets/images/favicon_1.ico">

        <title>Admin Dashboard </title>
        
       <link href="${pageContext.request.contextPath}/resources/assets/plugins/select2/select2.css" rel="stylesheet" type="text/css" />
        
        <!--Morris Chart CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.css">

        <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        
         <script src="${pageContext.request.contextPath}/resources/assets/js/modernizr.min.js"></script>
        <script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/plugins/parsleyjs/dist/parsley.min.js"></script>
        
    

        <script src="${pageContext.request.contextPath}/resources/assets/js/modernizr.min.js"></script>
        	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/jquery-datatables-editable/datatables.css" />
	


				<script
		src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/jquery.dataTables.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/js/modernizr.min.js"></script>
	

        
        
    </head>


    <body class="fixed-left">
      
        <!-- Begin page -->
        <div id="wrapper">

            <!-- Top Bar Start -->
            <div class="topbar">

                <!-- LOGO -->
                <div class="topbar-left">
                    <div class="text-center">
                        <a href="${pageContext.request.contextPath}/admin/dashboard" class="logo"><i class="ti-shopping-cart"></i><span><i class="md  md-functions"></i>-C<i class="md md-album"></i>mmerce</span></a>
                    </div>
                </div>

                <!-- Button mobile view to collapse sidebar menu -->
                <div class="navbar navbar-default" role="navigation">
                    <div class="container">
                        <div class="">
                            <div class="pull-left">
                                <button class="button-menu-mobile open-left">
                                    <i class="ion-navicon"></i>
                                </button>
                                <span class="clearfix"></span>
                            </div>

                            <form role="search" class="navbar-left app-search pull-left hidden-xs">
			                     <input type="text" placeholder="Search..." class="form-control">
			                     <a href=""><i class="fa fa-search"></i></a>
			                </form>


                            <ul class="nav navbar-nav navbar-right pull-right">
                                <li class="dropdown hidden-xs">
                                    <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="true">
                                        <i class="icon-bell"></i> <span class="badge badge-xs badge-danger">3</span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-menu-lg">
                                        <li class="notifi-title"><span class="label label-default pull-right">New 3</span>Notification</li>
                                        <li class="list-group nicescroll notification-list">
                                          <!--  list item -->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-diamond fa-2x text-primary"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                          <!--  list item -->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-cog fa-2x text-custom"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">New settings</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                    <!--        list item -->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-bell-o fa-2x text-danger"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">Updates</h5>
                                                    <p class="m-0">
                                                        <small>There are <span class="text-primary font-600">2</span> new updates available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item -->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-user-plus fa-2x text-info"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">New user registered</h5>
                                                    <p class="m-0">
                                                        <small>You have 10 unread messages</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                          <!--  list item -->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-diamond fa-2x text-primary"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

<!--                                            list item -->
                                            <a href="javascript:void(0);" class="list-group-item">
                                                <div class="media">
                                                    <div class="pull-left p-r-10">
                                                     <em class="fa fa-cog fa-2x text-custom"></em>
                                                    </div>
                                                    <div class="media-body">
                                                      <h5 class="media-heading">New settings</h5>
                                                      <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                    </div>
                                              </div>
                                           </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);" class="list-group-item text-right">
                                                <small class="font-600">See all notifications</small>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="hidden-xs">
                                    <a href="#" id="btn-fullscreen" class="waves-effect waves-light"><i class="icon-size-fullscreen"></i></a>
                                </li>
                               
                                <li class="dropdown">
                                    <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-1.jpg" alt="user-img" class="img-circle"> </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="${pageContext.request.contextPath}/admin/profile"><i class="ti-user m-r-5"></i> Profile</a></li>
                                        <li><a href="javascript:void(0)"><i class="ti-settings m-r-5"></i> Settings</a></li>
                                        <li><a href="javascript:void(0)"><i class="ti-lock m-r-5"></i> Lock screen</a></li>
                                        <li><a href="${pageContext.request.contextPath}/logout"><i class="ti-power-off m-r-5"></i> Logout</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!--/.nav-collapse -->
                    </div>
                </div>
            </div>
            <!-- Top Bar End -->


            <!-- ========== Left Sidebar Start ========== -->

            <div class="left side-menu">
                <div class="sidebar-inner slimscrollleft">
                
                    <!--- Divider -->
                    <div id="sidebar-menu">
                        <ul>

                        	<li class="text-muted menu-title">Navigation</li>

                            <li  class="waves-effect active">
                                <a href="${pageContext.request.contextPath}/admin/dashboard"><i class="ti-home"></i> <span> Dashboard </span> </a>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="ti-dropbox"></i> <span> Manage Product </span> </a>
                                <ul class="list-unstyled">
                                    <li><a href="${pageContext.request.contextPath}/product/addproduct"><i class="fa fa-plus-square"></i>Add Product</a></li>
                     				<li><a href="${pageContext.request.contextPath}/product/listproduct"><i class="glyphicon glyphicon-list"></i>List Product</a></li>
                                   
                     			</ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect"><i class=" md-shopping-basket"></i><!-- <span class="label label-primary pull-right"></span> --><span> Manage Orders </span> </a>
                                <ul class="list-unstyled" >
                                    <li><a href="${pageContext.request.contextPath}/orders/listorders"><i class="glyphicon glyphicon-list"></i>Orders List</a></li>
                                    

                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="icon-people"></i> <span> Manage Users </span> </a>
                                <ul  class="list-unstyled" >
                                	<li><a href="${pageContext.request.contextPath}/users/userlist"><i class="glyphicon glyphicon-list"></i>User List</a></li>
                              
                                </ul>
                            </li>
                                <li class="has_sub">
                                <a href="#" class="waves-effect"><i class=" md-people-outline"></i> <span> ContactUs </span> </a>
                                <ul  class="list-unstyled">
                                	<li><a href="${pageContext.request.contextPath}/admin/contactuslist"><i class="glyphicon glyphicon-list"></i>List Contact Us</a></li>
                              
                                </ul>
                            </li>
                            
                                 <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="ti-files"></i> <span> Page Content </span> </a>
                                <ul  class="list-unstyled">
                                <li>
                                <a href="${pageContext.request.contextPath}/pagecontent/aboutus" class="waves-effect"><i class="glyphicon glyphicon-edit"></i> <span> About us </span> </a>
                            </li>
                                <li>
                                <a href="${pageContext.request.contextPath}/pagecontent/privacypolicy" class="waves-effect"><i class="glyphicon glyphicon-edit"></i> <span> Privacy Policy</span> </a>
                            </li>
                                <li>
                                <a href="${pageContext.request.contextPath}/pagecontent/term&condition" class="waves-effect"><i class="glyphicon glyphicon-edit"></i> <span> Terms-Condition  </span> </a>
                            </li>
                            
                                	<li>
                                <a href="${pageContext.request.contextPath}/pagecontent/Faqslist" class="waves-effect"><i class="glyphicon glyphicon-edit"></i> <span> FAQs </span> </a>
                            </li>
                                </ul>
                            </li>
                           

                     
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <!-- Left Sidebar End --> 



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->                      
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <!-- Page-Title -->
                        <div class="row">
                            <div class="col-sm-12">
                                <h4 class="page-title">Dashboard</h4>
                                <p class="text-muted page-title-alt">Welcome to admin panel !</p>
                            </div>
                        </div>

                        <div class="row">
                        <div class="counter">
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                    <a href="${pageContext.request.contextPath}/product/listproduct">
                                    <i class="ti-dropbox text-pink"></i>
                                    <h2 class="m-0 text-dark counter font-600">${totalProductAvailable}</h2>
                                    <div class="text-muted m-t-5">Available Products</div>
                                    </a>
                                </div> 
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                <a href="${pageContext.request.contextPath}/orders/pendingorderlist">
                                    <i class="md md-warning text-warning"></i>
                                    <h2 class="m-0 text-dark counter font-600">${pendingOrder}</h2>
                                    <div class="text-muted m-t-5">Pending Orders</div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                   <a href="${pageContext.request.contextPath}/orders/shippedorderlist">
                                    <i class="md md-done-all text-custom"></i>
                                    <h2 class="m-0 text-dark counter font-600">${shippedOrder}</h2>
                                    <div class="text-muted m-t-5">Shipped Orders</div>
                                    </a>
                                </div>
                            </div>
                             <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                  <a href="${pageContext.request.contextPath}/orders/cancelledorderlist">
                                    <i class="md md-cancel text-danger"></i>
                                    <h2 class="m-0 text-dark counter font-600">${CancelledOrder}</h2>
                                    <div class="text-muted m-t-5">Cancelled Orders</div>
                                    </a>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                    <i class="md md-rate-review text-info"></i>
                                    <h2 class="m-0 text-dark counter font-600" >${totalReviewedProduct}</h2>
                                    <div class="text-muted m-t-5">Reviewed Product</div>
                                   
                                </div>
                            </div>
                             <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                    <i class="md  md-favorite-outline text-pink"></i>
                                    <h2 class="m-0 text-dark counter font-600">${totalLikedProduct}</h2>
                                    <div class="text-muted m-t-5">Liked Product</div>
                                </div>
                            </div>
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                <a href="${pageContext.request.contextPath}/users/userlist">
                                    <i class="md md-account-child text-info"></i>
                                    <h2 class="m-0 text-dark counter font-600">${totalUser}</h2>
                                    <div class="text-muted m-t-5">Users</div>
                                    </a>
                                </div>
                            </div>
               
                            <div class="col-lg-3 col-sm-6">
                                <div class="widget-panel widget-style-2 bg-white">
                                <a href="${pageContext.request.contextPath}/admin/contactuslist">
                                    <i class="md md-account-child text-success"></i>
                                    <h2 class="m-0 text-dark counter font-600">${totalContactUsUser}</h2>
                                    <div class="text-muted m-t-5">Contact Us Users</div>
                                    </a>
                                </div>
                            </div>
                        </div>
						</div>


<div class="card-box">
							

							<div class="table-responsive">
								<table id="mytable" class="table table-actions-bar" >
								
									<thead>
										<tr>
											<th>Product Id</th>
											<th>Product Name</th>
											<th>Available Quantity</th>
											<th>Cart Quantity</th>
											<th>Ordered Quantity</th>
											<th>Reviewed Product</th>
											<th>Liked Product</th>
											<th>Status</th>

											<th>Price</th>
											<th style="min-width: 80px;">Action</th>
										</tr>
									</thead>

									<tbody>

										<c:forEach items="${products}" var="products">
											<c:set var="productQty" value="0" />
											<c:set var="producQty" value="0" />
											<c:set var="productReview" value="0" />
											<c:set var="productLiked" value="0" />
											<tr>
												<td>${products.id}</td>
												<td>${products.product_name}</td>
												<td>${products.quantity}</td>

												<!--  ----------------------------------------------------------------------Carts is if notNull condition start-----------------------------------   -->
												
													<c:if test="${cart ne null }">
														<c:forEach items="${cart}" var="carts">

															<!--  --------------------------------------------------------In Cart product is null condition---------------------------------------------- -->

															<c:if test="${products.id == carts.product.id}">
																<c:set var="productQty"
																	value="${productQty + carts.quantity }" />
															
															</c:if>

														</c:forEach>

													</c:if>


												<td>${ productQty}</td>
												
												<!--  ----------------------------------------------------------------------Carts is Null condition End-----------------------------------   -->


<!-- --------------------------------------------------------------------Ordered Product Quantity---------------------------------------------------------------- -->
 	
													<c:if test="${orderItems ne null }">
														<c:forEach items="${orderItems}" var="orderItem">

<!--  --------------------------------------------------------In OrderItems product is null condition---------------------------------------------- -->

															<c:if test="${products.id == orderItem.product.id}">
																<c:set var="producQty"
																	value="${producQty + orderItem.quantity }" />
															</c:if>

														</c:forEach>

													</c:if>

												<td>${ producQty}</td>

												
<!-- -------------------------------------------------------------------------END--------------------------------------------------------------------- -->

<!-- --------------------------------------------------------------------reviewed of product---------------------------------------------------------------- -->
 	
													<c:if test="${reviews ne null }">
														<c:forEach items="${reviews}" var="review" >
															<%-- <c:set var="count" value="0" /> --%>
<!--  --------------------------------------------------------In reviewed of product is null condition---------------------------------------------- -->
																			
															<c:if test="${products.id == review.product.id}">
															
																<c:set var="productReview"
																	value="${ productReview +1}" />
															
															
															</c:if>

														</c:forEach>

													</c:if>

												<td>${ productReview}</td>

												
<!-- -------------------------------------------------------------------------END--------------------------------------------------------------------- -->
<!-- --------------------------------------------------------------------reviewed of product---------------------------------------------------------------- -->
 	
													<c:if test="${product_likeds ne null }">
														<c:forEach items="${product_likeds}" var="product_liked" >
															<%-- <c:set var="count" value="0" /> --%>
<!--  --------------------------------------------------------In reviewed of product is null condition---------------------------------------------- -->
																			
															<c:if test="${products.id == product_liked.product.id}">
															
																<c:set var="productLiked"
																	value="${ productLiked +1}" />
															
															
															</c:if>

														</c:forEach>

													</c:if>

												<td>${ productLiked}</td>
												
											
										<td>${products.status }</td>
										
										
												
<!-- -------------------------------------------------------------------------END--------------------------------------------------------------------- -->
												<td>${products.price}</td>
												<td><a
													href="${pageContext.request.contextPath}/product/updateproduct/${products.id}"
													class="table-action-btn">
													<i class="md md-edit"></i></a> <a
													href="${pageContext.request.contextPath}/product/deleteproduct/${products.id}"
													class="table-action-btn"><i
														class=" glyphicon glyphicon-trash"></i></a></td>
											</tr>

										</c:forEach>
										
										


									</tbody>
								</table>
							</div>
						</div>
                        

                        
                        
                        	
                        
                        

                    </div> <!-- container -->
                               
                </div> <!-- content -->

                  <footer class="footer text-right">
                    2022 © E-Commerce
                </footer>
				</div>
           
            
            
            <!-- ============================================================== -->
            <!-- End Right content here -->
            <!-- ============================================================== -->


            <!-- Right Sidebar -->
       
            <!-- /Right-bar -->

        
        <!-- END wrapper -->


    
        <script>
            var resizefunc = [];
        </script>
<script>
            var resizefunc = [];
        </script>

<%--         <!-- jQuery  -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/detect.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/fastclick.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.slimscroll.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.blockUI.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/waves.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/wow.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.nicescroll.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.scrollTo.min.js"></script>
        <!-- jQuery  -->
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/moment/moment.js"></script>


        <script src="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/raphael/raphael-min.js"></script>

         <script src="${pageContext.request.contextPath}/resources/assets/plugins/sweetalert/dist/sweetalert.min.js"></script> --%>
        <!-- jQuery  -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/detect.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/fastclick.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.slimscroll.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.blockUI.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/waves.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/wow.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.nicescroll.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.scrollTo.min.js"></script>


        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.core.js"></script>
        
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.app.js"></script>

        <script src="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/raphael/raphael-min.js"></script>
		
		<script src="${pageContext.request.contextPath}/resources/assets/plugins/select2/select2.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/pages/jquery.dashboard_ecommerce.js"></script>
		
		
		
						<script
		src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/dataTables.bootstrap.js"></script>
<script
		src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/jquery.dataTables.min.js"></script>

	

<!-- 	<script type="text/javascript">
		$(document).ready(function() {
			$('form').parsley();
		});
		
	</script> -->
	
		<script type="text/javascript">
		$(document).ready(function() {
			$('#mytable').dataTable();
		});
	</script>
		     <script>
            jQuery(document).ready(function() {
                // Select2
                $(".select2").select2();
            });
        </script>
        
        
             <script type="text/javascript">
            jQuery(document).ready(function($) {
                $('.counter').counterUp({
                    delay: 100,
                    time: 1200
                });

                $(".knob").knob();

            });
        </script>
        
        

    </body>
</html>