package fr.galexandre.project.tutorial.model;

import org.mongodb.morphia.annotations.Embedded;

/**
 * Created by galexandre on 30/09/15.
 */
@Embedded
public class Address {

    private String street;//like 8 Road Of Sun
    private String city;
    private String postalCode;

    /**
     * Constructor
     * @param street : the name and the number in the stree
     * @param city : the name of the city
     * @param postalCode : the postal code of the city
     */
    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Empty constructor
     */
    public Address() {
    }

    /**
     * Return the name of the street with the number in the street.
     * @return the number and name of the street (String)
     */
    public String getStreet() {
        return street;
    }

    /**
     * Give a number and a name of street of the address
     * @param street : a street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Return the name of the city
     * @return the name of the city (String)
     */
    public String getCity() {
        return city;
    }

    /**
     * Set a name of city to the address
     * @param city : a name of city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Return the postal code of the city
     * @return : the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set a postal code to the address
     * @param postalCode : a postal code (String)
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Method which return in a String format all the information
     * from the current object (city, street, address, postal code)
     * @return a String which contains all the information
     */
    public String toString(){
        String res = "city: "+city+"street: "+street+"postal code:"+postalCode;
        return res;
    }
}
