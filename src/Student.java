
public class Student {

	String name;
	String city;
	String state;

	
	public Student(String name, String city, String state){
		this.name = name;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return name + "\n" + city + "\n" + state ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
