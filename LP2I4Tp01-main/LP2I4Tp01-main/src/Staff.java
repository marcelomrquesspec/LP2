//Marcelo Marques Araujo CB3005631

public class Staff extends Person{
	public String school;
	public double pay;
	Person person;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool()
	{
		return school;
	}
	public void setProgram(String school)
	{
		this.school = school;
	}
	public double getPay()
	{
		return pay;
	}
	public void setPay(double pay)
	{
		this.pay = pay;
	}
	public String toString() {
		return "Student[" + super.toString() + ", school= " + school + ", getpay= " + pay + "]";
	 }
}
