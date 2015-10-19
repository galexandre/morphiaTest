package fr.galexandre.project.tutorial.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import static org.junit.Assert.*;

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
        DateUtils date = new DateUtils();
        p.setDateOfBirthday(date);
        assertTrue(date.equals(p.getDateOfBirthday()));
    }

    @Test
    public void testSetDateOfBirthday() throws Exception {
        DateUtils date = new DateUtils();
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
}