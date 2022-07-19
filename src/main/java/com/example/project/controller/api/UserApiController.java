package com.example.project.controller.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.request.AddressDto;
import com.example.project.dto.request.TempOtp;
import com.example.project.model.Address;
import com.example.project.model.ContactUs;
import com.example.project.model.OTP;
import com.example.project.model.User;
import com.example.project.util.ApplicationURLConstants;
import com.example.project.util.DaoFactory;
import com.example.project.util.GenericMessageResponse;
import com.example.project.util.GenericResponse;
import com.example.project.util.ServiceRegistry;

@RestController
@RequestMapping(ApplicationURLConstants.USER_API)
public class UserApiController {

	@Autowired
	private ServiceRegistry serviceRegistry;

	@Autowired
	private DaoFactory daoFactory;

	/*
	 * @Autowired private CartService cartService;
	 */

	// @Autowired private ConfirmationTokenRepository confirmationTokenRepository;

	/*
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Autowired private OtpRepository otpRepository;
	 */

	@PostMapping(ApplicationURLConstants.CHECK_UNIQUE_EMAIL)
	public ResponseEntity<Object> validateEmail(@RequestBody User user, HttpServletRequest request) {
		try {
			User userData = daoFactory.userRepository.findByEmail(user.getEmail());

			if (userData.getEmail().equals(user.getEmail())) {

				return ResponseEntity.ok(new GenericMessageResponse("501", "Email is already exist..........."));

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Send OTP to verification........"));
	}

	@PostMapping(ApplicationURLConstants.GENERATE_OTP)
	public ResponseEntity<Object> generateOTP(@RequestBody OTP otp) {
		try {
			String otps = serviceRegistry.otpService.generateOTP();
			otp.setOtp_code(otps);
			daoFactory.otpRepository.save(otp);

		//	System.out.println(otps);

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericResponse("200", "OTP Generated", otp));
	}

	@PostMapping(ApplicationURLConstants.VERIFY_OTP)
	public ResponseEntity<Object> verifyOTP(@RequestBody TempOtp tempOtp) {
		try {
			OTP otp = new OTP();

			User user = new User();

			if (tempOtp.getTempotp() == otp.getOtp_code())

			{
				user.setO_T_P(tempOtp.getTempotp());
				daoFactory.userRepository.save(user);

				return ResponseEntity.ok(new GenericMessageResponse("200", "Successfully Verify"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Invalid OTP"));
	}

	@PostMapping(ApplicationURLConstants.REGISTER)
	public ResponseEntity<Object> saveUser(@RequestBody User user, HttpServletRequest request) {
		try {
			daoFactory.userRepository.save(user);
			serviceRegistry.emailSenderService.sendMail(user);

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Successfully Register"));
		/*
		 * ConfirmationToken confirmationToken = new ConfirmationToken(null, null,
		 * user); confirmationTokenRepository.save(confirmationToken);
		 * 
		 * SimpleMailMessage mailMessage=new SimpleMailMessage();
		 * mailMessage.setTo(user.getEmail());
		 * mailMessage.setSubject("Complete Registration"); mailMessage.setFrom("")
		 */

	}


	@RequestMapping(ApplicationURLConstants.GET_PROFILE_PATH)
	public ResponseEntity<Object> getUserDetail(@PathVariable("id") String id) {

		try {
			User userById = daoFactory.userRepository.findById(Long.parseLong(id)).orElse(null);

			return ResponseEntity.ok(new GenericResponse("202", "Success", userById));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "user not found"));
	}

	@PostMapping(ApplicationURLConstants.UPDATE_PROFILE)
	public ResponseEntity<Object> editUserProfile(@RequestBody User user) {
		try {
			User users = daoFactory.userRepository.getById(user.getId());

			if (users.getEmail().equals(user.getEmail())) {
				daoFactory.userRepository.save(user);
				return ResponseEntity.ok(new GenericMessageResponse("201", "Successfully Updated but not email"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		daoFactory.userRepository.save(user);
		serviceRegistry.emailSenderService.sendUpdateMail(user);
		return ResponseEntity.ok(new GenericMessageResponse("201", "Successfully Updated"));

	}
	
	@PostMapping()
	public ResponseEntity<Object> addAddress(@RequestBody AddressDto addressDto){
		
		Address address=new Address();
		try {
			User user=daoFactory.getUserRepository().findById(addressDto.getUserId()).orElse(null);

			if (user == null)
				return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
		
			address.setUser(user);
		
			BeanUtils.copyProperties(addressDto, address);
			
			daoFactory.addressRepository.save(address);
			
			return ResponseEntity.ok(new GenericMessageResponse("200", "Review Added"));

		}catch (Exception e) {
			System.out.println(e);
		}
		
		return ResponseEntity.ok(new GenericMessageResponse("404", "Error"));
	}

	@PostMapping(ApplicationURLConstants.MAIL_TOVERIFY_PASSWORD)
	public ResponseEntity<Object> forgotPasswordMail(@RequestBody User user) {
		try {
			String email = user.getEmail();
			User users = daoFactory.userRepository.findByEmail(email);
			System.out.println(users);

			serviceRegistry.emailSenderService.sendForgotPasswordMail(users);

			/*
			 * users.setPassword(user.getPassword()); userRepository.save(users);
			 */
			return ResponseEntity.ok(new GenericResponse("201", "Redirect Change password", users));
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("404", "Not Found"));
	}

	@PostMapping(ApplicationURLConstants.FORGOT_PASSWORD)
	public ResponseEntity<Object> forgotPassword(@RequestBody User user) {
		try {
			User userData = daoFactory.userRepository.findByEmail(user.getEmail());

			userData.setPassword(user.getPassword());
			daoFactory.userRepository.save(userData);
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Password Updated..........."));

	}

	@PostMapping(ApplicationURLConstants.CHANGE_PASSWORD)
	public ResponseEntity<Object> changingPassword(@RequestBody User user) {
		try {
			User users = daoFactory.userRepository.findByEmail(user.getEmail());

			if (users.getEmail().equals(user.getEmail())) {

				users.setPassword(user.getPassword());
				daoFactory.userRepository.save(users);
				return ResponseEntity.ok(new GenericMessageResponse("201", "Successfully Password Updated"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		daoFactory.userRepository.save(user);

		return ResponseEntity.ok(new GenericMessageResponse("404", "Password not Updated"));

	}

	@PostMapping(ApplicationURLConstants.CONTACT_US)
	public ResponseEntity<Object> contactUs(@RequestBody ContactUs contactUs) {
		try {
			daoFactory.contactUsRepository.save(contactUs);
			

		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("200", "Submitted"));
	

	}


	@PostMapping(ApplicationURLConstants.LOGIN)
	public ResponseEntity<Object> loginUser(@RequestBody User user) {
		try {
			User userData = daoFactory.userRepository.findByEmail(user.getEmail());

			
			
			
		if(userData==null) {
			
			return ResponseEntity.ok(new GenericMessageResponse("404","Email not Registered, Plz Register !!"));
		
		}
		else if(userData.getPassword().equals(user.getPassword()))
		{
			if(user.isActive())
			{
				
				return ResponseEntity.ok(new GenericMessageResponse("200", "Successfully Login"));
			}
		
		}	
		else
		{
			return ResponseEntity.ok(new GenericMessageResponse("200", "Password is not correct"));
		}

		} catch (Exception e) {
			System.out.println(e);
		}

		return ResponseEntity.ok(new GenericMessageResponse("404", "Internal server Error"));

	}

	@PostMapping(ApplicationURLConstants.LOGOUT)
	public ResponseEntity<Object> logoutUser(@RequestBody User user) {
		try {
			User userData = daoFactory.userRepository.findByEmail(user.getEmail());

			if(userData.getEmail().equals(user.getEmail()))
			{
			if (userData.isActive()) 
			{	
			user.setIslogin("false");
			

				return ResponseEntity.ok(new GenericMessageResponse("200", "logout Successfully"));
			}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return ResponseEntity.ok(new GenericMessageResponse("201", "logout Error"));

	}
	


	
	

}
