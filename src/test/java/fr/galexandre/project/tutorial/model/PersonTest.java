package fr.galexandre.project.tutorial.model;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * Created by galexandre on 30/09/15.
 */
public class PersonTest {

    Person p = new Person();

    @Test
    public void testGetFirstName() throws Exception {
        p.setFirstName("test");
        assertTrue(StringUtils.equals(p.getFirstName(),"test"));
    }

    @Test
    public void testSetFirstName() throws Exception {
        p.setFirstName("test");
        assertTrue(StringUtils.equals(p.getFirstName(),"test"));
    }

    @Test
    public void testGetLastName() throws Exception {
        p.setLastName("test");
        assertTrue(StringUtils.equals(p.getLastName(),"test"));
    }

    @Test
    public void testSetLastName() throws Exception {
        p.setLastName("test");
        assertTrue(StringUtils.equals(p.getLastName(),"test"));
    }

    @Test
    public void testGetDateOfBirthday() throws Exception {
        Date date = new Date();
        p.setDateOfBirthday(date);
        assertTrue(date.equals(p.getDateOfBirthday()));
    }

    @Test
    public void testSetDateOfBirthday() throws Exception {
        Date date = new Date();
        p.setDateOfBirthday(date);
        assertTrue(date.equals(p.getDateOfBirthday()));
    }

    @Test
    public void testGetAdress() throws Exception {
        Address address = new Address("test","testCity","0007");
        p.setAdress(address);
        assertTrue(StringUtils.equals(p.getAdress().getCity(),"testCity"));
    }

    @Test
    public void testSetAdress() throws Exception {
        Address address = new Address("test","testCity","0007");
        p.setAdress(address);
        assertTrue(StringUtils.equals(p.getAdress().getCity(),"testCity"));
    }

    @Test
    public void testPersonCreation(){
        Date d = new Date();
        Address address = new Address("Street unitTesting","TestCity","0001");
        Person p = new Person("Test","Test",d,address);
        assertTrue(StringUtils.equals(p.getLastName(),"Test"));
        assertTrue(StringUtils.equals(p.getFirstName(),"Test"));
        assertTrue(d.equals(p.getDateOfBirthday()));
    }


    @Test
    public void testGetId() throws Exception {
        ObjectId objectId = new ObjectId();
        p.setId(objectId);
        assertTrue(p.getId().equals(objectId));
    }

    @Test
    public void testToString() throws Exception {
        Address address = new Address("Street unitTesting","TestCity","0001");
        p.setAdress(address);
        String res= "id: "+p.getId()+"; address:"+
                p.getAdress().toString()+"; firstname:"+p.getFirstName()+"; lastname:"+
                p.getLastName();
        assertTrue(StringUtils.equals(res,p.toString()));
    }
}