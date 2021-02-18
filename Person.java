package HW3;
public class Person implements Comparable<Person>{

	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}

	@Override
	public int compareTo(Person person1) {
		if(this.lastName.compareToIgnoreCase(person1.lastName)<0) {
			return -1;
		}else if(this.lastName.compareToIgnoreCase(person1.lastName)>0) {
			return 1;
		}else {
			if (this.firstName.compareToIgnoreCase(person1.firstName)<0) {
				return -1;
			}else if(this.firstName.compareToIgnoreCase(person1.firstName)>0){
				return 1;
			}else {
				return Integer.compare(this.id, person1.id);
				}
			}
		}
	}
	
	

