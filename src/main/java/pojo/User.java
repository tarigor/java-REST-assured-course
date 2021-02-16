package pojo;

import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Integer> phones;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Integer> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Integer> phones) {
        this.phones = phones;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String firstName, String lastName, String email, String cityName, String streetName, Integer homeNumber, Integer flatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phones = new ArrayList<Integer>();
        this.address = new Address(cityName,streetName,homeNumber,flatNumber);
    }

    public void addPhones(int... phone) {
        for (int i = 0; i < phone.length; i++) {
            this.phones.add(phone[i]);
        }
    }

}
