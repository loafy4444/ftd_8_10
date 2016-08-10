
public class Student {

	String firstName;
	String lastName;
	String fullName;
	String age;
	String dob;
	String address;
	String city;
	String state;

	public Student(String firstName, String lastName, String dob, String age, String address, String city, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return " ----  Student ----" +
				"\n" + getFullName() + 
				"\n" + address +
				"\n" + city + ", " + state +
				"\nDoB: " + dob + "\tAge: " + age;
	}

	public String getFullName(){
		return fullName = firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
