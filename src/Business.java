/**
 * Class for the Business group.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Business extends Building {
	
	protected int numRentableUnits;

	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public Business() {
		super();
		setNumRentableUnits(0);
	}//end constructor

	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numRentableUnits = 0;
	}//end constructor

	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits < 0 ? 0 : numRentableUnits;
	}//end getNumRentableUnits

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
