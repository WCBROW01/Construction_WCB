/**
 * Building class. Superclass for all occupancy groups. 
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Building {

	protected String projectName; // name of the building project
	protected String completeAddress; // complete address of the project
	protected double totalSquareFeet; // square footage of the building
	protected String occupancyGroup; // group code
	protected String subgroup; // subgroup code
	
	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public Building() {
		setProjectName("");
		setCompleteAddress("");
		setTotalSquareFeet(0.0);
		setOccupancyGroup("");
		setSubgroup("");
	}//end constructor

	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
	}//end constructor
	
	/**
	 * Placeholder drawing code.
	 */
	public void draw() {
		System.out.println("Drawing code for <<Building>>.");
	}//end draw
	
	/**
	 * @return a formatted String displaying info about all visible fields.
	 */
	public String displayData() {
		return "Project Name: " + projectName + 
				"\nAddress: " + completeAddress + 
				"\nSquare Feet: " + totalSquareFeet + 
				"\nOccupancy Group: " + occupancyGroup + 
				"\nOccupancy Subgroup: " + subgroup;
	}//end displayData

	/**
	 * @return the project name
	 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	/**
	 * @param projectName the project name to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	/**
	 * @return the complete address of the project
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	/**
	 * @param completeAddress the complete address to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	/**
	 * @return the square footage of the building
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	/**
	 * @param totalSquareFeet the square footage of the building to set (must be positive)
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet < 0.0 ? 0.0 : totalSquareFeet;
	}//end setTotalSquareFeet

	/**
	 * @return the group code
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	/**
	 * @param occupancyGroup the group code to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	/**
	 * @return the subgroup code
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	/**
	 * @param subgroup the subgroup code to set
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
