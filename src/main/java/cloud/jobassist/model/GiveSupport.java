package cloud.jobassist.model;

import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="support_giver")
public class GiveSupport {
	private String phoneNumber;
	private String name;
	private String password;
	private String email;
	private String timeZone;
	private Set<String> availableSlots;
	private String expereince;
	private Set<String> skills;
	private String location;
	
	@DynamoDBHashKey(attributeName="phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@DynamoDBAttribute(attributeName="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBAttribute(attributeName="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@DynamoDBAttribute(attributeName="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@DynamoDBAttribute(attributeName="time_zone")
	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	@DynamoDBAttribute(attributeName="available_slots")
	public Set<String> getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(Set<String> availableSlots) {
		this.availableSlots = availableSlots;
	}
	@DynamoDBAttribute(attributeName="experience")
	public String getExpereince() {
		return expereince;
	}

	public void setExpereince(String expereince) {
		this.expereince = expereince;
	}
	@DynamoDBAttribute(attributeName="skills")
	public Set<String> getSkills() {
		return skills;
	}

	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	@DynamoDBAttribute(attributeName="location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
