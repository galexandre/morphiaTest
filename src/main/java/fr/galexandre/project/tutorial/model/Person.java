package fr.galexandre.project.tutorial.model;

import org.apache.commons.lang3.time.DateUtils;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by galexandre on 30/09/15.
 */
@Entity
public class Person {

    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private DateUtils dateOfBirthday;
    @Embedded
    private Address adress;

    /**
     * Empty constructor
     */
    public Person() {
    }

    /**
     * Constructor for a new person
     * @param firstName : first name of the person
     * @param lastName : last name of the person
     * @param dateOfBirthday : date of birth of the person
     * @param adress : address of the person
     */
    public Person(String firstName, String lastName, DateUtils dateOfBirthday, Address adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
        this.adress = adress;
    }

    /**
     * Return the first name of the person
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Give a first name to the person
     * @param firstName : the first name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Return the last name of the person
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Give a last name to the person
     * @param lastName : the last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Return the date of birth of the person
     * @return : the date of birth
     */
    public DateUtils getDateOfBirthday() {
        return dateOfBirthday;
    }

    /**
     * Give a date of birth to the person
     * @param dateOfBirthday : the date of birth (DateUtils)
     */
    public void setDateOfBirthday(DateUtils dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    /**
     * Return the address of the person
     * @return the address
     */
    public Address getAdress() {
        return adress;
    }

    /**
     * Set the address of the person
     * @param adress : an address
     */
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public ObjectId getId(){
        return this.id;
    }

    public void setId(ObjectId id){
        this.id=id;
    }

    public String toString(){

        String res= "id: "+this.id+"; address:"+
                this.adress.toString()+"; firstname:"+this.firstName+"; lastname:"+
                this.lastName;
        return  res;
    }
}
