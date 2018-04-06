package cloud.jobassist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.jobassist.model.Location;
import cloud.jobassist.repositories.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getLocations() {
		List<Location> locations = new ArrayList<>();
		Iterable<Location> findAll = locationRepository.findAll();
		for (Location location : findAll) {
			Location locationModel = new Location();
			locationModel.setCountry(location.getCountry());
			locationModel.setIsdCodes(location.getIsdCodes());
			locationModel.setTimeZones(location.getTimeZones());
			locations.add(locationModel);
		}
		return locations;

	}
}
