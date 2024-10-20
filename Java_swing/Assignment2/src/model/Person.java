/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nidhinair
 */
public class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int age;
    private Address homeAddress;
    private Address workAddress;
    /*
    private String streetAddress;
    private String unitNumber;
    private String city;
    private char[] state;         // Primitive type: char[] for two-letter state code
    private int zipCode;          // Primitive type: int for zip code
    private long phoneNumber;
    private String streetAddressW;
    private String unitNumberW;
    private String cityW;
    private char[] stateW;         // Primitive type: char[] for two-letter state code
    private int zipCodeW;          // Primitive type: int for zip code
    private long phoneNumberW;*/

    // Constructor
    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        
        /*this.streetAddress = streetAddress;
        this.unitNumber = unitNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.streetAddressW = streetAddressW;
        this.unitNumberW = unitNumberW;
        this.cityW = cityW;
        this.stateW = stateW;
        this.zipCodeW = zipCodeW;
        this.phoneNumberW = phoneNumberW;*/
        
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Address getHomeAddress(){
        return homeAddress;
    }
    public void setHomeAddress(Address homeAddress){
        this.homeAddress = homeAddress;
    }
    
    public Address getWorkAddress(){
        return workAddress;
    }
    
    public void setWorkAddress(Address workAddress){
        this.workAddress = workAddress;
    }
    /*public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char[] getState() {
        return state;
    }

    public void setState(char[] state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
   public String getStreetAddressW() {
        return streetAddressW;
    }

    public void setStreetAddressW(String streetAddressW) {
        this.streetAddressW = streetAddressW;
    }

    public String getUnitNumberW() {
        return unitNumberW;
    }

    public void setUnitNumberW(String unitNumberW) {
        this.unitNumberW = unitNumberW;
    }

    public String getCityW() {
        return cityW;
    }

    public void setCityW(String cityW) {
        this.cityW = cityW;
    }

    public char[] getStateW() {
        return stateW;
    }

    public void setStateW(char[] stateW) {
        this.stateW = stateW;
    }

    public int getZipCodeW() {
        return zipCodeW;
    }

    public void setZipCodeW(int zipCodeW) {
        this.zipCodeW = zipCodeW;
    }

    public long getPhoneNumberW() {
        return phoneNumberW;
    }

    public void setPhoneNumberW(long phoneNumberW) {
        this.phoneNumberW = phoneNumberW;
    } */
}
