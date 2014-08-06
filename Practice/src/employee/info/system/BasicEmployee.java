package employee.info.system;

public abstract class BasicEmployee implements Employee {
	
	private int sickDays;
	private String country;
	private int vacationDays;
	
	public BasicEmployee(){
		
		this.country = "USA";
	}
	
	public BasicEmployee(int sickDay, String cont){
		
		this.sickDays= sickDay;
	}
	/**
	 * @return the vacationDays
	 */
	public int getVacationDays() {
		return vacationDays;
	}
	/**
	 * @param vacationDays the vacationDays to set
	 */
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}
	/**
	 * @return the sickDays
	 */
	public int getSickDays() {
		return sickDays;
	}
	/**
	 * @param sickDays the sickDays to set
	 */
	public void setSickDays(int sickDays) {
		this.sickDays = sickDays;
	}
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param cuntry the country to set
	 */
	public void setCountry(String cuntry) {
		country = cuntry;
	}
	
	public abstract String jobTitle();
	
}
	
	
	