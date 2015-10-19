package fr.galexandre.project.tutorial.model;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


/**
 * Created by galexandre on 30/09/15.
 */
public class AddressTest {

    private Address address = new Address();

    @Test
    public void testGetStreet() throws Exception {
        address.setStreet("9 Test Case Street");
        assertTrue(StringUtils.equals(address.getStreet(), "9 Test Case Street"));
    }

    @Test
    public void testSetStreet() throws Exception {
        address.setStreet("10 Test Case Street");
        assertTrue(StringUtils.equals(address.getStreet(), "10 Test Case Street"));
    }

    @Test
    public void testGetCity() throws Exception {
        address.setCity("Dublin");
        assertTrue(StringUtils.equals(address.getCity(),"Dublin"));
    }

    @Test
    public void testSetCity() throws Exception {
        address.setCity("Dublin");
        assertTrue(StringUtils.equals(address.getCity(),"Dublin"));
    }

    @Test
    public void testGetPostalCode() throws Exception {
        address.setPostalCode("00005");
        assertTrue(StringUtils.equals(address.getPostalCode(),"00005"));
    }

    @Test
    public void testSetPostalCode() throws Exception {
        address.setPostalCode("00005");
        assertTrue(StringUtils.equals(address.getPostalCode(),"00005"));
    }
}