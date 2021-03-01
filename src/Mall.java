/**
 * Class for the Mall subgroup.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Mall extends Business {
	
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public Mall() {
		super();
		setNumRentedUnits(0);
		setMedianUnitSize(0.0);
		setNumParkingSpaces(0);
	}//end constructor

	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentedUnits(0);
		setMedianUnitSize(0.0);
		setNumParkingSpaces(0);
	}//end constructor
	
	@Override
	public void draw() {
		System.out.println("Drawing code for <<Mall>>.");
	}//end draw
	
	@Override
	public String displayData() {
		return super.displayData() +
				"\nNumber of Rentable Units: " + numRentableUnits +
				"\nNumber of Rented Units: " + numRentedUnits +
				"\nMedian Unit Size: " + medianUnitSize +
				"\nNumber of Parking Spaces: " + numParkingSpaces;
	}//end displayData

	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits < 0 ? 0 : numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize < 0.0 ? 0.0 : medianUnitSize;
	}//end setMedianUnitSize

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces < 0 ? 0 : numParkingSpaces;
	}//end setNumParkingSpaces

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end setNumParkingSpaces

}
