<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
             <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/assets/images/favicon_1.ico">

        <title>List of User </title>
        <!-- sweet alert -->
        <link href="${pageContext.request.contextPath}/resources/assets/plugins/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">
             <link href="${pageContext.request.contextPath}/resources/assets/plugins/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">
        <!--Morris Chart CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.min.js">
				<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.js">
		
        <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/jquery-datatables-editable/datatables.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/jquery-datatables-editable/jquery.dataTables.js" />
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/plugins/morris/morris.css">

  
        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

        <script src="${pageContext.request.contextPath}/resources/assets/js/modernizr.min.js"></script>
   <%--       <script src="${pageContext.request.contextPath}/resources/assets/js"></script>    --%>       
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
                                           <!-- list item-->
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

                                           <!-- list item-->
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

                                           <!-- list item-->
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

                                           <!-- list item-->
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

                                           <!-- list item-->
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

                                           <!-- list item-->
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

                            <li>
                                <a href="${pageContext.request.contextPath}/admin/dashboard" class="waves-effect"><i class="ti-home"></i> <span> Dashboard </span> </a>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="ti-dropbox"></i> <span> Manage Product </span> </a>
                                <ul class="list-unstyled">
                                    <li><a href="${pageContext.request.contextPath}/product/addproduct"><i class="fa fa-plus-square"></i>Add Product</a></li>
                     				<li><a href="${pageContext.request.contextPath}/product/listproduct"><i class="glyphicon glyphicon-list"></i>List Product</a></li>
                                   
                     			</ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="md-shopping-basket"></i><!-- <span class="label label-primary pull-right"></span> --><span> Manage Orders </span> </a>
                                <ul class="list-unstyled">
                                    <li><a href="${pageContext.request.contextPath}/orders/listorders"><i class="glyphicon glyphicon-list"></i>Orders List</a></li>
                                    

                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect active"><i class="icon-people"></i> <span> Manage Users </span> </a>
                                <ul >
                                	<li class="active"><a href="${pageContext.request.contextPath}/users/userlist"><i class="glyphicon glyphicon-list"></i>User List</a></li>
                              
                                </ul>
                            </li>
                                <li class="has_sub">
                                <a href="#" class="waves-effect"><i class=" md-people-outline"></i> <span> ContactUs </span> </a>
                                <ul >
                                	<li><a href="${pageContext.request.contextPath}/admin/contactuslist"><i class="glyphicon glyphicon-list"></i>List Contact Us</a></li>
                              
                                </ul>
                            </li>
                            
                                 <li class="has_sub">
                                <a href="#" class="waves-effect"><i class="ti-files"></i> <span> Page Content </span> </a>
                                <ul >
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
                                <h4 class="page-title">Manage Users | User List</h4>
                                <p class="text-muted page-title-alt">Welcome to  admin panel !</p>
                            </div>
                        </div>

                      

                        
                        <!-- end row -->
                        
                        
                       <div class="row">
                        	<div class="col-lg-12">
                        		<div class="card-box">
                        			<!-- <div class="row m-t-10 m-b-10">
			                        	<div class="col-sm-6 col-lg-8">
			                        		<form role="form">
			                                    <div class="form-group contact-search m-b-30">
			                                    	<input type="text" id="search" class="form-control" placeholder="Search...">
			                                        <button type="submit" class="btn btn-white"><i class="fa fa-search"></i></button>
			                                    </div> form-group
			                                </form>
			                        	</div>

                                        <div class="col-sm-6 col-lg-4">
                                            <div class="h5 m-0">
                                                <span class="vertical-middle">Sort By:</span>
                                                <div class="btn-group vertical-middle" data-toggle="buttons">
                                                     <label class="btn btn-white btn-md waves-effect active">
                                                        <input type="radio" autocomplete="off" checked=""> Status
                                                     </label>
                                                     <label class="btn btn-white btn-md waves-effect">
                                                        <input type="radio" autocomplete="off"> Type
                                                     </label>
                                                     <label class="btn btn-white btn-md waves-effect">
                                                        <input type="radio" autocomplete="off"> Name
                                                     </label>
                                                </div>
                                            </div>
                                        </div>
			                        </div> -->

                        			<div class="table-responsive">
                        
                                        <table id="userlist" class="table table-actions-bar">
                                            <thead>
                                                <tr>
                                                	<th>email</th>
                                                    <th>firstname</th>
                                                    <th>lastname</th>
                                                    <th>gender</th>
                                                    <th>mobile</th>
                                       
                                                    <th>Status</th>
                                                    
                                                    
                                                    <th style="min-width: 80px;">Block/Unblock</th>
                                                    <th style="min-width: 80px;">Action</th>
                                                </tr>
                                            </thead>

                        <!--                     <tbody>
                                                <tr>
                                                    <td>daff </td>
                                                    <td>fswf</td>
                                                    <td>wsdfgwref</td>
                                                    <td>efewf</td>
                                                    <td>adas</td>
                                                    <td>true</td>
                                                   
                                                    <td>
                                                    	Block/Unblock
                                                    </td>
                                                </tr>

    											  <tr>
                                                    <td>daff </td>
                                                    <td>fswf</td>
                                                    <td>wsdfgwref</td>
                                                    <td>efewf</td>
                                                    <td>dasd</td>
                                                    <td>true</td>
                                                   
                                                    <td>
                                                    	Block/Unblock
                                                    </td>
                                                </tr>
   												   <tr>
                                                    <td>daff </td>
                                                    <td>fswf</td>
                                                    <td>wsdfgwref</td>
                                                    <td>efewf</td>
                                                    <td>dswd</td>
                                                    <td>true</td>
                                                   
                                                    <td>
                                                    	Block/Unblock
                                                    </td>
                                                </tr>
                                            </tbody> -->
                                        </table>
                                    </div>
                        		</div>
                               
                            </div> <!-- end col -->

                            
                        </div>
                          
                               
                </div> <!-- content -->

                <footer class="footer text-right">
                    2022 Â© E-Commerce.
                </footer>

            </div>
            
            
            <!-- ============================================================== -->
            <!-- End Right content here -->
            <!-- ============================================================== -->


            <!-- Right Sidebar -->
            <div class="side-bar right-bar nicescroll">
                <h4 class="text-center">Chat</h4>
                <div class="contact-list nicescroll">
                    <ul class="list-group contacts-list">
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-1.jpg" alt="">
                                </div>
                                <span class="name">Chadengle</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-2.jpg" alt="">
                                </div>
                                <span class="name">Tomaslau</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-3.jpg" alt="">
                                </div>
                                <span class="name">Stillnotdavid</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-4.jpg" alt="">
                                </div>
                                <span class="name">Kurafire</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-5.jpg" alt="">
                                </div>
                                <span class="name">Shahedk</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-6.jpg" alt="">
                                </div>
                                <span class="name">Adhamdannaway</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-7.jpg" alt="">
                                </div>
                                <span class="name">Ok</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-8.jpg" alt="">
                                </div>
                                <span class="name">Arashasghari</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-9.jpg" alt="">
                                </div>
                                <span class="name">Joshaustin</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="${pageContext.request.contextPath}/resources/assets/images/users/avatar-10.jpg" alt="">
                                </div>
                                <span class="name">Sortino</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                    </ul>  
                </div>
            </div>
            <!-- /Right-bar -->

        </div>
        <!-- END wrapper -->


    
         <script>
            var resizefunc = [];
        </script>

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
       <%--  
         <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.min.js"></script> --%>
        
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/raphael/raphael-min.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/plugins/parsleyjs/dist/parsley.min.js"></script>
		
		
         <script type="text/javascript">
			$(document).ready(function() {
				$('form').parsley();
			});
		</script>
		
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.spring-friendly.js"></script>
		
		<script src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/jquery.dataTables.min.js"></script>
	
		<script src="${pageContext.request.contextPath }/resources/assets/plugins/datatables/dataTables.bootstrap.js"></script>
		<!-- ---------------------------------------------------------------------Ajax se data aaraha he-------------------------------		
		 --> 
		 
		 
		 	<!-- <--------------------------------------------------------/Order List Function START---------------------------------------------->  -->
	
	
	
	 	<script>
	var editor;
	$(document).ready(
				function() {
			
				var ref =	$('#userlist')
						.DataTable(
							{
								"processing" : true,
								"serverSide" : true,
								"language": {
								    "infoFiltered": ""
								  },
							    "ajax": "${pageContext.request.contextPath}/users/users/userlist",
								"type" : "GET",
								"columns" : [
									
									
									
									/* 
									<th>email</th>
                                    <th>firstname</th>
                                    <th>lastname</th>
                                    <th>gender</th>
                                    <th>mobile</th>
                                   
                                    <th>active</th> */
									 {
										"data" : "email",
									},  
								 {
									"data" : "firstname",
								},
								
								{
									"data" : "lastname",
								}, 
								{
									"data" : "gender",
								},
								{
									"data" : "mobile_no",
								},
							
								{
									"data" : "block_unblock",
									"render" : function(data, type, row, meta){
									if(row.block_unblock == 'unblock'){
									
									return "<i class='glyphicon glyphicon-ok-circle text-success'></i>"
									
									}
									
									
									else{
										return " <i class='glyphicon  glyphicon-ban-circle text-danger'></i>"
										}
									}
								
								},
								 {
									data : "id",
									"render" : function(data, type, row, meta){
										 return " <button onclick='UnblockBtn(" +row.id+")' type='button' class='btn btn-success style='float: center' id='unblock' >Unblock</button> <button onclick='BlockBtn(" +row.id+")'  type='button' class='btn btn-danger' style='float: center' id='block' >Block</button>"; 
									} 
									
								},
								
 							 	 {
									data : "id",
									"render" : function(data, type, row, meta){
										return "<a href='${pageContext.request.contextPath}/users/userdetail/" + row.id + "' class='glyphicon glyphicon-eye-open'></a> ";
										
									},
									
									
 								 }],
							});
            });					
	</script>
		<!-- <--------------------------------------------------------/Order List Function END---------------------------------------------->  -->
		
		
		
			<script type="text/javascript">
            $(document).ready(function() {
                $('#datatable').dataTable();
            } );
        </script>
		
		 <script>
function UnblockBtn(id){

console.log("Called");
swal({   
    title: "Are you sure?",   
     text: "You want to UnBlock this User..!",   
    type: "warning",   
    showCancelButton: true,   
    confirmButtonColor: '#EEB422',
    confirmButtonText: "Unblock Successfully",   
    closeOnConfirm: false 
}, function(){
	swal({title:"Accepting...", text:"Unblocked ...", type:"info",showCancelButton:false,showConfirmButton:false,closeOnClickOutside:false});

$.ajax({
url:'${pageContext.request.contextPath}/user/active/UNBLOCK/ ' +id ,
type: 'POST',
dataType:'json',

success: function (event) {
    
    
    swal(
        {
            title: "Approved",
            text: "User Unblock successfully",
            type: "success"
        },
        (function refreshTable() {
       	 $('#userlist').DataTable().clear();
 		$('#userlist').DataTable().ajax.reload();
        })
        );
}

});
});

}


</script>

 
    <script>
function BlockBtn(id){

console.log("Called");
swal({   
    title: "Are you sure?",   
     text: "You want to  Block  this User..!",   
    type: "warning",   
    showCancelButton: true,   
    confirmButtonColor: '#EEB422',
    confirmButtonText: "Block Successfully",   
    closeOnConfirm: false 
}, function(){
	swal({title:"Rejecting...", text:"Blocked...", type:"info",showCancelButton:false,showConfirmButton:false,closeOnClickOutside:false});

$.ajax({
url:'${pageContext.request.contextPath}/user/active/BLOCK/ ' +id,
type: 'POST',
dataType:'json',

success: function (event) {
    
    
    swal(
        {
            title: "Approved",
            text: "User Block successfully",
            type: "success"
        },
        (function refreshTable() {
        	 $('#userlist').DataTable().clear();
      		$('#userlist').DataTable().ajax.reload();
        }));
}

});
});

}
		
	</script>
	
	

	
	
	
<!-- 	---------------------------------------------------------------------------------------------- -->	
        <!-- Sweet-Alert  -->
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/sweetalert/dist/sweetalert.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/pages/jquery.sweet-alert.init.js"></script>
		

    </body>
</html>