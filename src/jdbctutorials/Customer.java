/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctutorials;

import java.util.Date;

public class Customer {
    private String _id;
    private String _firstName;
    private String _lastName;
    private String _phoneNumber;
    private String _address;
    private String _email;
    private Date _birthday;
    private String _gender;

    public String getId() {
        return _id;
    }
    public void setId(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return _firstName;
    }
    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String getLastName() {
        return _lastName;
    }
    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }
    public void setPhoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String getAddress() {
        return _address;
    }
    public void setAddress(String _address) {
        this._address = _address;
    }

    public String getEmail() {
        return _email;
    }
    public void setEmail(String _email) {
        this._email = _email;
    }

    public Date getBirthday() {
        return _birthday;
    }
    public void setBirthday(Date _birthday) {
        this._birthday = _birthday;
    }

    public String getGender() {
        return _gender;
    }
    public void setGender(String _gender) {
        this._gender = _gender;
    }


    public void display() {
        System.out.println();
        System.out.println("CUSTOMER DETAILS:");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-15s: %s\n", "Id", this.getId());
        System.out.format("%-15s: %s\n", "First name", this.getFirstName());
        System.out.format("%-15s: %s\n", "Last name", this.getLastName());
        System.out.format("%-15s: %s\n", "Phone number", this.getPhoneNumber());
        System.out.format("%-15s: %s\n", "Address", this.getAddress());
        System.out.format("%-15s: %s\n", "Email", this.getEmail());
        System.out.format("%-15s: %s\n", "Birthday", this.getBirthday());
        System.out.format("%-15s: %s\n", "Gender", this.getGender());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
