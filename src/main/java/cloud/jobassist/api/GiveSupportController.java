package cloud.jobassist.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.jobassist.model.GiveSupport;
import cloud.jobassist.service.GiveSupportService;

@RestController(value="/support")
public class GiveSupportController {
	@Autowired
	private GiveSupportService sgService;
	
	@RequestMapping(value="/get-support",method=RequestMethod.GET)
	public GiveSupport getSupportGiver() {
		GiveSupport sg = new GiveSupport();
		sg.setName("Kashvi");
		return sg;
	}
	@RequestMapping(name="/register",method=RequestMethod.POST)
	public String register(@RequestBody GiveSupport sg) {
		sgService.register(sg);
		return "Success";
	}
	
	
}
