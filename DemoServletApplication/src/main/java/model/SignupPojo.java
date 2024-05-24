package model;

public class SignupPojo {

	String name;
	String tel;

	String mail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
	
	
	public SignupPojo(String name, String tel, String mail) {
		super();
		this.name = name;
		this.tel = tel;
		this.mail = mail;
	}
}
