package model.vo;

public class StudentVO {
	private String no;
	private String name;
	private String address;
	
	private DepartmentVO department;
	
	
	public StudentVO() {
		
	}
	
	public StudentVO(String no, String name, String address) {
		
		this.no = no;
		this.name = name;
		this.address = address;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentVO [no=" + no + ", name=" + name + ", address=" + address + "]";
	}
}
