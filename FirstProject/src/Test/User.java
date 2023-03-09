package Test;

public class User {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String phone;	
	public User() {  }
	public String getId() {
		return id;
	}
	public User(String id, String pwd, String name, int age, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return id  +"\t" + pwd +  "\t" +name + "\t" + age + "\t" + phone;
	}	
}


