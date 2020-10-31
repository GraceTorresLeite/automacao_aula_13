package Utils;

import com.github.javafaker.Faker;
import com.github.javafaker.University;

public class FakerGeneration {
	
	Faker faker = new Faker();

	String name; // Miss Samanta Schmidt
	String firstName; // Emory
	String lastName; // Barton
	String email;
	String gender;
	String age;

	String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449S

	public String getFirstName() {
		//name = faker.name().fullName();
		firstName = faker.name().firstName();
		return firstName;	
	}
	
	public String getLastName() {
		lastName = faker.name().lastName();
		return lastName;
		
	}
	
	public String getEmail() {
		email = faker.internet().emailAddress();
		return email;
	}
	
	public String getGender() {
		gender = faker.demographic().sex();
		    return gender;
		}
	
	public String getAge() {
		age = faker.number().digit();
		    return age;
		}
}
