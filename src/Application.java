/**
 * Test application for all building groups and subgroups.
 * @author Will Brown
 * @version 1.0
 * Spring 2021
 */
public class Application {

	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting tests for Building...");
		
		if(testBuildingConstructor()) System.out.println("Empty argument constructor test passed");
		else System.out.println("Empty argument constructor test failed");
		
		if(testBuildingConstructor("Test Project", "Test Address", 8.0, "Test group", "Test subgroup")) System.out.println("Preferred constructor test passed");
		else System.out.println("Preferred constructor test failed");
			
	}
	
	/**
	 * Tests empty argument constructor for Building
	 * @return whether the test passed
	 */
	private static boolean testBuildingConstructor() {
		Building building = new Building();
		return building.getProjectName().equals("") &&
				building.getCompleteAddress().equals("") &&
				building.getTotalSquareFeet() == 0.0 && 
				building.getOccupancyGroup().equals("") &&
				building.getSubgroup().equals("");
	}
	
	/**
	 * Tests preferred constructor for Building
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @return whether the test passed
	 */
	private static boolean testBuildingConstructor(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		Building building = new Building(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		return building.getProjectName().equals(projectName) &&
				building.getCompleteAddress().equals(completeAddress) &&
				building.getTotalSquareFeet() == totalSquareFeet && 
				building.getOccupancyGroup().equals(occupancyGroup) &&
				building.getSubgroup().equals(subgroup);
	}

}
