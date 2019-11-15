package lab09;

public class Customer{
	private String name;
	private String dateOfService;
	private double hoursSpent;
	
	public void Set(String uClientName, Double uHoursSpent, String uDateOfService) {
		name = uClientName;
		dateOfService = uDateOfService;
		hoursSpent = uHoursSpent;
	}
	
	public String GetName() {
		return name;
	}
	
	public String GetDate() {
		return dateOfService;
	}
	
	public Double GetHours() {
		return hoursSpent;
	}
}
