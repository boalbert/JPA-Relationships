package model;

import javax.persistence.*;

@Entity
@Table(name = "Kunder")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name ="Förnamn")
	private String firstName;
	@Column(name ="Efternamn")
	private String lastName;
	@Column(name ="Adress")
	private String adress;
	@Column(name ="Postnummer")
	private int zipCode;
	@Column(name ="Stad")
	private String city;
	@Column(name ="Telefonnummer")
	private String phoneNumber;
	@Column(name ="Email")
	private String email;

//	@OneToOne
//	@JoinColumn(name = "id")
//	private Order order;

	public Customer(int id, String firstName, String lastName, String adress, int zipCode, String city, String phoneNumber, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.zipCode = zipCode;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}

	public Customer() {
	}
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
