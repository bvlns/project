package cloud.jobassist.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import cloud.jobassist.model.GiveSupport;

@EnableScan
public interface GiveSupportRepository extends CrudRepository<GiveSupport, String> {
	public GiveSupport findByPhoneNumber(String id);
}
