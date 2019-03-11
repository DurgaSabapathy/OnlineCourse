package chainsys.com.model;

import java.time.LocalDate;

public class Course {

	private String id,name;
	private float fees;
	private Department department;
	private Staff staff;
	private LocalDate start_Date;
	private LocalDate end_Date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public LocalDate getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(LocalDate start_Date) {
		this.start_Date = start_Date;
	}
	public LocalDate getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(LocalDate end_Date) {
		this.end_Date = end_Date;
	}
	
}
