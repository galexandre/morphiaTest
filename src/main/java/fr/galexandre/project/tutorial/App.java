package fr.galexandre.project.tutorial;

import fr.galexandre.project.tutorial.controller.Controller;
import fr.galexandre.project.tutorial.model.Address;
import fr.galexandre.project.tutorial.model.Person;
import org.apache.commons.lang3.time.DateUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Create a new controller
        Controller ctl = new Controller();
        //Create a new person
        DateUtils date = new DateUtils();
        Address adr = new Address("Test street","Dublin","0007");
        Person p = new Person("Test","TestLastNaùe",date,adr);
        System.out.println(p.toString());
        //Put this person to the database
        ctl.addPerson(p);
        //Display the person (we can know if she is in the database)
        System.out.println(ctl.getAllPeopleInDatabase());
    }
}
