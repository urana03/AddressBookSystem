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
	Scanner scan = new Scanner(System.in);
	AddressBook(){}

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
	
	public void add() {
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
	
	public void editData() {
		System.out.println("\nEnter first name to edit :- ");
		int ans;
		String name = scan.next();
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).getFirstName().equals(name)) {
				do {
					System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
					int ch = scan.nextInt();
					switch(ch) {
					case 1:
						System.out.print("Enter new first name :- ");
						list.get(i).setFirstName(scan.next());
						System.out.println("First name is updated.");
						break;
					case 2:
						System.out.print("Enter new last name :- ");
						list.get(i).setLastName(scan.next());
						System.out.println("Last name is updated.");
						break;
					case 3:
						System.out.print("Enter new address :- ");
						list.get(i).setAddress(scan.next());
						System.out.println("Address is updated.");
						break;
					case 4:
						System.out.print("Enter new city :- ");
						list.get(i).setCity(scan.next());
						System.out.println("City is updated.");
						break;
					case 5:
						System.out.print("Enter new state :- ");
						list.get(i).setState(scan.next());
						System.out.println("State is updated.");
						break;
					case 6:
						System.out.print("Enter new zip code :- ");
						list.get(i).setZip(scan.nextInt());
						System.out.println("Zip code is updated.");
						break;
					case 7:
						System.out.print("Enter new phone number :- ");
						list.get(i).setPhoneNo(scan.nextLong());
						System.out.println("Phone number is updated.");
						break;
					case 8:
						System.out.print("Enter new email :- ");
						list.get(i).setEmail(scan.next());
						System.out.println("Email is updated.");
						break;
					}
					System.out.println("Enter 1 if you want to continue");
					ans = scan.nextInt();
				}while(ans == 1);
			}
			else
				System.out.println("Please enter the correct first name");
		}

	}
	
	public static void DisplayContacts() {
		System.out.println("\nContacts in Address Book:");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
			}
		}

	public static void main(String[] args) {
		AddressBook object = new AddressBook();
		object.add();
		object.editData();
		DisplayContacts();
	}
}