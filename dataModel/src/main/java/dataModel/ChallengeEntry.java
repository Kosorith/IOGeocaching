package dataModel;

public class ChallengeEntry {
	private String name;
	private boolean publicAccess;
	private COORD location;
	private String description;
	
	public ChallengeEntry(String name, boolean publicAccess, COORD location, String description) {
		this.name = name;
		this.publicAccess = publicAccess;
		this.location = location;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPublicAccess() {
		return publicAccess;
	}
	public void setPublicAccess(boolean publicAccess) {
		this.publicAccess = publicAccess;
	}
	public COORD getLocation() {
		return location;
	}
	public void setLocation(COORD location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
