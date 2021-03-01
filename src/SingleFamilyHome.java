/**
 * Class for the Single Family Home subgroup.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class SingleFamilyHome extends Residential {
	
	private boolean garage;

	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public SingleFamilyHome() {
		super();
		setGarage(false);
	}//end constructor

	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setGarage(false);
	}//end constructor
	
	@Override
	public void draw() {
		System.out.println("Drawing code for <<SingleFamilyHome>>.");
	}//end draw
	
	@Override
	public String displayData() {
		return super.displayData() +
				"\nNumber of Bedrooms: " + numBedrooms +
				"\nNumber of Bathrooms: " + numBathrooms +
				"\nLaundry Room: " + laundryRoom +
				"\nGarage: " + garage;
	}//end displayData

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
