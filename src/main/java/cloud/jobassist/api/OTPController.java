package cloud.jobassist.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cloud.jobassist.model.OTP;
import cloud.jobassist.service.SNSService;

@RestController
public class OTPController {
	@Autowired
	private SNSService snsService;
	@RequestMapping(value="/generateOTP",method=RequestMethod.POST)
	public ResponseEntity<String> sendOPT(@RequestParam("phoneNumber") String phoneNumber) {
		ResponseEntity<String> response = null;
		try {
			snsService.sendOTP(phoneNumber);
			response =  new ResponseEntity<>("OTP generated",HttpStatus.OK);
		} catch (Exception e) {
			response =  new ResponseEntity<>("OTP Generation faild, "+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
	
	@RequestMapping(value="/validateOTP",method=RequestMethod.POST)
	public ResponseEntity<String> validateOTP(@RequestBody OTP otpUI) {
		ResponseEntity<String> response = null;
		try {
			snsService.validateOTP(otpUI);
			response = new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}

}
