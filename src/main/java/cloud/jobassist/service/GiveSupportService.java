package cloud.jobassist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.jobassist.model.GiveSupport;
import cloud.jobassist.repositories.GiveSupportRepository;

@Service
public class GiveSupportService {
	@Autowired
	private GiveSupportRepository repository;
	public void register(GiveSupport sg) {
		repository.save(sg);
	}
}
