package lab09;

public class Employee {
	private String name;
	private double hourlyRate;
	
	public void SetName(String uName){
		name = uName;
	}
	//aar
	public void SetRate(Double uHourlyRate) {
		hourlyRate = uHourlyRate;
	}
	
	public String GetName() {
		return name;
	}
	
	public Double GetHourlyRate() {
		return hourlyRate;
	}
}
