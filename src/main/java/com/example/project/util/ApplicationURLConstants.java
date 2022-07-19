package com.example.project.util;

public class ApplicationURLConstants {
	

	
	//Admin
	//public static final String ADMIN_WEB="/admin";
	public static final String ADMIN_API="/api/eCommerce/admin";
	//public static final String ROOT="/";
	//public static final String ADMIN_LOGIN="/adminlogin";
	//public static final String ADMIN_DASHBOARD="/dashboard";
	public static final String ADMIN_ADD_PRODUCT="/add-products";
	
	//User
	public static final String USER_API="/api/eCommerce/user";
	public static final String CHECK_UNIQUE_EMAIL="/check-unique-email";
	public static final String GENERATE_OTP="/generate-otp";
	public static final String VERIFY_OTP="/verify-otp";
	public static final String REGISTER="/register";
	public static final String REGISTERTHYMLIF="/registerThymlif";
	public static final String LOGIN="/login";
	public static final String LOGOUT="/logout";
	public static final String GET_PROFILE_PATH="/get-profile/{id}";
	public static final String UPDATE_PROFILE="/update-profile";
	public static final String MAIL_TOVERIFY_PASSWORD="/mail-toverify-password"; 
	public static final String FORGOT_PASSWORD="/forgot-password"; 
	public static final String CHANGE_PASSWORD="/change-password";
	
	//Product
	public static final String PRODUCT_API="/api/eCommerce/product";
	public static final String GET_PRODUCT_LIST_PATH="/get-product-list/{pageNo}";
	public static final String GET_PRODUCT_DETAIL_PATH="/get-product-detail/{id}";
	public static final String LIKE_SPECIFIC_PRODUCT="/like-specific-product";
	public static final String GET_LIKED_PRODUCT_LIST="/get-liked-product-list";
	public static final String ADD_TO_CART="/add-to-cart";
	public static final String GET_CART_LIST_PATH="/get-cart-list/{pageNo}";
	public static final String ADD_REMOVE_QUANTITY="/add-remove-quantity";
	
	//Order API
	public static final String ORDER_API="/api/eCommerce/order";
	public static final String ORDER_PLACED="/order-placed";
	public static final String ORDER_ITEMS="/order-items";
	public static final String GET_ORDER_LIST_PATH="/get-order-list/{orderstatus}";
	public static final String GET_ORDER_STATUS_PATH="/get-order-status/{id}";
	public static final String PAYMENT_VERIFICATION="/payment-verification";
	public static final String REVIEW_PRODUCT="/review-product";
	public static final String GET_REVIEW_LIST="/get-review-list";
	public static final String CONTACT_US="/contact-us";
	public static final String GET_LIST_REVIEW_RATING_PATH="/get-list-review-rating/{pageNo}";
	public static final String GET_PRODUCT_BY_ORDER_PATH="/get-product-by-order/{id}";
	
	
	
	//Admin WEB
	public static final String ADMIN="/admin";
	public static final String Login="/login";
	public static final String ADMIN_PROFILE="/admin/profile";
	public static final String ADMIN_UPDATEPROFILE="/admin/updateprofile";
	public static final String ADMIN_DASHBOARD="/admin/dashboard";
	public static final String ADMIN_VIEWUSER="/admin/viewUser";
	public static final String Logout="/logout";
	
	
	
	//Order WEB
	public static final String ORDER_LISTORDER1="/orders/orders/listorders";
	public static final String ORDER_LISTORDER2="/orders/listorders";
	public static final String DELETE_ORDER_PATH="/orders/deleteorder/{id}";
	public static final String ORDER_DETAILS_PATH="/orders/orderdetails/{id}";
	public static final String ORDERS_ORDERS_PENDINGLISTORDER="/orders/orders/pendingorderlist";
	public static final String ORDERS_PENDINGORDERLIST="/orders/pendingorderlist";
	public static final String ORDERS_ORDERS_SHIPPEDLISTORDER="/orders/orders/shippedorderlist";
	public static final String ORDERS_SHIPPEDORDERLIST="/orders/shippedorderlist";
	public static final String ORDERS_ORDERS_CANCELLEDLISTORDER="/orders/orders/cancelledorderlist";
	public static final String ORDERS_CANCELLEDORDERLIST="/orders/cancelledorderlist";
	
	//User Web
	public static final String USER_USERLIST1="/users/users/userlist";
	public static final String USER_USERLIST="/users/userlist";
	public static final String USER_USERDETAIL_PATH="/users/userdetail/{id}";
	public static final String USER_UNBLOCK ="user/active/UNBLOCK/{id}";
	public static final String USER_BLOCK ="user/active/BLOCK/{id}";
	
	
	
	
	//Contact Us Web
	public static final String ADMIN_ADMIN_LISTCONTACTUS="/admin/admin/contactuslist";
	public static final String ADMIN_LISTCONTACTUS="/admin/contactuslist";
	public static final String ADMIN_CONTACTUSDETAILS_PATH="/admin/contactusdetails/{id}";
	public static final String DASHBOARD_LISTPRODUCT="/admin/dashboard";
	
	
	//PageCOntent Web
	public static final String PAGECONTENT_ABOUTUS="/pagecontent/aboutus";
	public static final String PAGECONTENT_PRIVACYPOLICY="/pagecontent/privacypolicy";
	public static final String PAGECONTENT_TERMSCONDITION="/pagecontent/term&condition";
	public static final String PAGECONTENT_ADDFAQS="/pagecontent/addfaqs";
	public static final String PAGECONTENT_UPDATEFAQS_PATH="/pagecontent/updatefaqs/{id}";
	public static final String PAGECONTENT_UPDATEFAQS="/pagecontent/updatefaqs";
	public static final String PAGECONTENT_FAQSLIST="/pagecontent/Faqslist";
	public static final String PAGECONTENT_PAGECONTENT_FAQSLIST="/pagecontent/pagecontent/Faqslist";
	public static final String PAGECONTENT_DELETEFAQS_PATH="/pagecontent/deletefaqs/{id}";
	
	
	
	//Product UI WEB
	public static final String PRODUCT_ADDPRODUCT="/product/addproduct";
	public static final String PRODUCT_UPDATEPRODUCT="/product/updateproduct";
	public static final String PRODUCT_UPDATEPRODUCT_PATH="/product/updateproduct/{id}";
	public static final String PRODUCT_LISTPRODUCT="/product/listproduct";
	public static final String PRODUCT_DELETEPRODUCT_PATH="/product/deleteproduct/{id}";
	
	
	
	

	
}
