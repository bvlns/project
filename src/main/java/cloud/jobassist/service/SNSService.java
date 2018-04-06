package cloud.jobassist.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SetSMSAttributesRequest;

import cloud.jobassist.model.OTP;
import cloud.jobassist.repositories.OTPRepository;
import cloud.jobassist.util.GenerateOTP;
@Service
public class SNSService {
	@Autowired
	private OTPRepository optRepo;
	private final AmazonSNS snsClient = AmazonSNSClientBuilder.standard().withRegion(Regions.US_WEST_2).build();
	private final Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
	
	
	private final String message = "OTP for you jobassist registration ";
	public void sendOTP(String phoneNumber) {
		int otpPin=GenerateOTP.getOTP();
		SetSMSAttributesRequest setRequest = new SetSMSAttributesRequest()
//				.addAttributesEntry("DefaultSenderID", "mySenderID")
//				.addAttributesEntry("MonthlySpendLimit", "1")
//				.addAttributesEntry("DeliveryStatusIAMRole", "arn:aws:iam::123456789012:role/mySnsRole")
//				.addAttributesEntry("DeliveryStatusSuccessSamplingRate", "÷ß10")
				.addAttributesEntry("DefaultSMSType", "Transactional");
		snsClient.setSMSAttributes(setRequest);
		snsClient.publish(new PublishRequest().withMessage(message+otpPin).withPhoneNumber(phoneNumber).withMessageAttributes(smsAttributes));
		OTP otp = new OTP();
		otp.setOtp(otpPin+"");
		otp.setPhoneNumber(phoneNumber);
		persistOTP(otp);
	}
	
	private void persistOTP(OTP otp) {
		optRepo.save(otp);
	}
	
	public void validateOTP(OTP otpUI) {
		OTP otpDB = optRepo.findOne(otpUI.getPhoneNumber());
		if(otpDB == null || !otpUI.getOtp().equals(otpDB.getOtp())) {
			throw new RuntimeException("OTP not valid");
		}
	}
}
