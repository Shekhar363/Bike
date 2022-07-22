package college;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College 
{
	@Id
	private int sid;
	private String sname;
	private String branch;
	private String section;
	private String sadd;
	private int sdob;
	private String email;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public int getSdob() {
		return sdob;
	}
	public void setSdob(int sdob) {
		this.sdob = sdob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
