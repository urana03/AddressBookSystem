package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBook {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;
	static List <AddressBook> list = new ArrayList<>();

	public AddressBook(String first, String last, String add, String city, String state,
			int zip, long phone, String email) {
		this.firstName = first;
		this.lastName = last;
		this.address = add;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phone;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNo() {
		return phoneNumber;
	}

	public void setPhoneNo(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return	"\n First name : " + firstName + 
				"\n Last name : " + lastName +
				"\n Address : " + address +
				"\n City : " + city +
				"\n State : " + state +
				"\n Zip code : " + zip +
				"\n Phone Number : " + phoneNumber +
				"\n Email : " + email ;
	}
	
	public static void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String first = scan.next();
		System.out.println("Enter your last name:");
		String last = scan.next();
		System.out.println("Enter your address:");
		String address = scan.next();
	    System.out.println("Enter your city name:");
		String city = scan.next();
		System.out.println("Enter your state name:");
		String state = scan.next();
		System.out.println("Enter your zip:");
		int zip = scan.nextInt();
		System.out.println("Enter your phone number:");
		long phone = scan.nextLong();
		System.out.println("Enter your email:");
		String email = scan.next();
		AddressBook contact = new AddressBook(first,last,address,city,state,zip,phone,email);
		list.add(contact);
	}
	
	public static void DisplayContacts() {
		System.out.println("\nContacts in Address Book:");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
			}
		}

	public static void main(String[] args) {
		add();
		DisplayContacts();
	}
}