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

        <title>Admin Dashboard </title>
        
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

                            <li >
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
                                <a href="#" class="waves-effect"><i class="icon-people"></i> <span> Manage Users </span> </a>
                                <ul >
                                	<li><a href="${pageContext.request.contextPath}/users/userlist"><i class="glyphicon glyphicon-list"></i>User List</a></li>
                              
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
                <!-- Start content Panel -->
                <div class="content">
                    <div class="container">
                        <!-- Content-Page-Area-Title -->
                        <div class="row">
                            <div class="col-sm-12">
                                <h4 class="page-title">Show Order Details</h4>
                                <ol class="breadcrumb">
                                   
                                    
                                </ol>
                            </div>
                        </div>
                        <br>
                       
                        
      
                                        <form   action="${pageContext.request.contextPath}/admin/viewUser" method="post"  >
                                            
                                            <a href="${pageContext.request.contextPath }/admin/contactus">
                        <button type="button" class="btn btn-danger" style="float: right" id="back" >Back</button>
                        </a> 
                         <%-- <a href="${pageContext.request.contextPath }/admin/boat/details/${boat.id}">
                        <button type="button" class="btn btn-danger" style="float: right;margin-right: 5px"  id="cancel" >Cancel</button>
                        </a>  --%>
                        
                                            <!-- <button type="submit" class="btn btn-success" style="float: right;margin-right: 5px" id="save">Update</button> -->
                                            <!-- <button type="button" class="btn btn-primary" style="float: right;margin-right: 5px" id="update">Update</button> -->
                                           <%-- <a href="${pageContext.request.contextPath }/admin/boat/delete/${boat.id}">
                        <button type="button" class="btn btn-danger" style="float: right;margin-right: 5px" id="delete" >Delete Boat</button>
                        </a>  --%>
                        
                        
                        <%-- <a href="#" class="on-default remove-row"
					                          onclick="delete_boat('Boat Removed!', '${boat.model}', '${pageContext.request.contextPath }/admin/boat/delete/${boat.id}');"> <button class="btn btn-danger" style="float: right;margin-right: 5px">Delete Boat</button><i class="fa fa-trash-o"></i></a>        --%>
                        
                        
                        
                        
                        
                        
                        
                        
                                           <br>
                                           <br>
                                           
                                           <div class="row">
                            <!-- ADD NEW COURSE DETAILS Start-->
                           
                                <div class="card-box" style="width: auto">
                                    <h4 class="m-t-0 header-title"><b></b></h4>

                                    <div class="row">
                                            
                                            
                                            <%--  <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                            ID<span class="text-danger">*</span>
                                                        </label>
                                                        <div>
                                                            <input type="text" name="id" value="${user.id}"  class="form-control" placeholder="" required="" data-parsley-type="text"  data-parsley-required-message="Please enter Name"/>
                                                        </div>    
                                                    </div> --%>
<b style="font-size: 20px">User ID :  ${User.id } </b>
                                                   <br>
                                                   <br>
                                                   <br> 
                                                   
                                                   </div>
<!-- ---------------------------------------------------------------- Connected User Details -----------------------------------------------------------
					


                                           --><b style="font-size: 15px">User Details </b>          
                                                  
                                                    <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                           First Name <span class="text-danger"></span>
                                                        </label>
                                                        <div>
                                          <input data-parsley-type="text" name=length value=""
										class="form-control" required="" placeholder="" data-parsley-validate="parsley" readonly  >                                                   
										  </div>    
                                                    </div>
                                                    
                                                    
                                                     <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                            Last Name<span class="text-danger"></span>
                                                        </label>
                                                        <div>
                                          <input data-parsley-type="text" name="make" value=""
										class="form-control" required="" placeholder="" data-parsley-validate="parsley" readonly >                                                   
										  </div>    
                                                    </div>
                                                    
                                                    
                                                    <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                            Email<span class="text-danger"></span>
                                                        </label>
                                                        <div>
                                          <input data-parsley-type="text" name=model value=""
										class="form-control" required="" placeholder="" data-parsley-validate="parsley" readonly >                                                    
										 </div>    
                                                    </div>
                                                    
                                                    
                                                    <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                          Gender<span class="text-danger"></span>
                                                        </label>
                                                        <div>
                                                            <input type="text" name="wifi" value=""  class="form-control" placeholder="" required="" readonly />
                                                        </div>    
                                                    </div>
                                                    
                                                    
                                                    
                                                    <div class="form-group">
                                                        <label class="text-muted m-b-15 m-t-20 font-13" >
                                                           Mobile no:<span class="text-danger"></span>
                                                        </label>
                                                        <div>
                                                            <input type="text" name="zipCode" value=""  class="form-control" placeholder="" required="" readonly />
                                                        </div>    
                                                    </div>
                                      
                                                    
                                              
                                                    <%-- 
                                                    <input type="text" name="id" value="${boat.id}" hidden="true">
                                                   
                                                     <input type="text" name="active" value="${boat.active}" hidden="true">
                                                     <input type="text" name="user" value="${boat.user.id}" hidden="true">
                                                     <input type="text" name="password" value="${boat.password}" hidden="true">
                                                      
                                                    --%>  
                                            
                                                  
                                                   
                                                        
                                                      

                                                    
                                                        </div> 
                                                         </div>
                                                         
                                                        
                                                       </form>     
                                                         
                                            
                                            <!-- CMS Add-fees-panel-2 End -->
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
           
            
          
              <footer class="footer text-right">
                    2022 © E-Commerce
                </footer>
            
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
        <script src="${pageContext.request.contextPath}/resources/assets/plugins/raphael/raphael-min.js"></script>
		
		
		<script src="${pageContext.request.contextPath}/resources/assets/pages/jquery.dashboard_ecommerce.js"></script>
		
        

</body>
</html>