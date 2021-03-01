/**
 * Class for the Residential group.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Residential extends Building {
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	/**
	 * Empty-argument constructor. Sets all fields to default values.
	 */
	public Residential() {
		super();
		setNumBedrooms(0);
		setNumBathrooms(0);
		setLaundryRoom(false);
	}//end constructor

	/**
	 * Preferred constructor. Sets fields based on input parameters.
	 * @param projectName name of the building project
	 * @param completeAddress complete address of the project
	 * @param totalSquareFeet square footage of the building
	 * @param occupancyGroup group code
	 * @param subgroup subgroup code
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumBedrooms(0);
		setNumBathrooms(0);
		setLaundryRoom(false);
	}//end constructor

	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms =  numBedrooms < 0 ? 0 : numBedrooms;
	}//end setNumBedrooms

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms < 0 ? 0 : numBathrooms;
	}//end setNumBathrooms

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString

}//end class
