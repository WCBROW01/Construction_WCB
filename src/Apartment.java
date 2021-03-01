/**
 * Class for the Apartment subgroup.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Apartment extends Residential {
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public Apartment() {
		super();
		setNumRentableUnits(0);
		setAvgUnitSize(0.0);
		setParkingAvailable(false);
	}//end constuctor
	
	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentableUnits(0);
		setAvgUnitSize(0.0);
		setParkingAvailable(false);
	}//end constructor
	
	@Override
	public void draw() {
		System.out.println("Drawing code for <<Apartment>>.");
	}//end draw
	
	@Override
	public String displayData() {
		return super.displayData() +
				"\nNumber of Bedrooms: " + numBedrooms +
				"\nNumber of Bathrooms: " + numBathrooms +
				"\nLaundry Room: " + laundryRoom +
				"\nNumber of Rentable Units: " + numRentableUnits +
				"\nAverage Unit Size: " + avgUnitSize +
				"\nParking Available: " + parkingAvailable;
	}//end displayData

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
	}//end setNumRentableUnits

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize < 0.0 ? 0.0 : avgUnitSize;
	}//end setAvgUnitSize

	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
