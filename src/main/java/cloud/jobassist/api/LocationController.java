package cloud.jobassist.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.jobassist.model.GiveSupport;
import cloud.jobassist.model.Location;
import cloud.jobassist.repositories.LocationRepository;
import cloud.jobassist.service.GiveSupportService;
import cloud.jobassist.service.LocationService;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;

	@RequestMapping(value = "/getLocations", method = RequestMethod.GET)
	public ResponseEntity<List<Location>> getLocations() {
		ResponseEntity<List<Location>> response = null;
		try {
			response = new ResponseEntity<>(locationService.getLocations(), HttpStatus.OK);
		} catch (Exception e) {
			response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

}
