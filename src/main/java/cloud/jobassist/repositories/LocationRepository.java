package cloud.jobassist.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import cloud.jobassist.model.Location;
@EnableScan
public interface LocationRepository extends CrudRepository<Location, String>{

	
}
