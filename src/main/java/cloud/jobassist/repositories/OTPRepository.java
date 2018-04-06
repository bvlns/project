package cloud.jobassist.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import cloud.jobassist.model.OTP;
@EnableScan
public interface OTPRepository extends CrudRepository<OTP, String>{

}
