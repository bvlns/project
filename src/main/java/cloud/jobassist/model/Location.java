package cloud.jobassist.model;

import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "location")
public class Location {
	@DynamoDBHashKey(attributeName = "country")
	private String country;
	private String isdCodes;
	private Set<String> timeZones;
	@DynamoDBAttribute(attributeName="country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@DynamoDBAttribute(attributeName="isd_code")
	public String getIsdCodes() {
		return isdCodes;
	}
	public void setIsdCodes(String isdCodes) {
		this.isdCodes = isdCodes;
	}
	@DynamoDBAttribute(attributeName="time_zones")
	public Set<String> getTimeZones() {
		return timeZones;
	}
	public void setTimeZones(Set<String> timeZones) {
		this.timeZones = timeZones;
	}

}
