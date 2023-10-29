package assignment.collection;

import java.util.Objects;

public class Contact {

	private long PhoneNumber;
	private String Name;
	private String Email;
	private Gender gender;

	public Contact(long phoneNumber, String name, String email, Gender gender) {
		this.PhoneNumber = phoneNumber;
		this.Name = name;
		this.Email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", gender=" + gender
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Email, Name, PhoneNumber, gender);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Contact other = (Contact) obj;

		return Objects.equals(Email, other.Email) && Objects.equals(Name, other.Name)
				&& PhoneNumber == other.PhoneNumber && gender == other.gender;
	}

}