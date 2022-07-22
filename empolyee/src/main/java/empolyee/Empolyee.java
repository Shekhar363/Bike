package empolyee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public  class Empolyee 
{
	@Id
	private int eid;
	private String ename;
	private double sal;
	private String desegnation;
	private int age;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesegnation() {
		return desegnation;
	}
	public void setDesegnation(String desegnation) {
		this.desegnation = desegnation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
