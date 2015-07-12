package human;

public class Person {

	private String name;
	private String lastname;
	
	private double height;
	private double weight;
	private String gender;
	
	public Person(String name, String lastname, double height, double weight, String gender) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void sleep(){
		
	}
	
	public void wakeUp(){
		
	}
	
	public void eat(){
		
	}
	
	public void ride(){
		
	}
}
