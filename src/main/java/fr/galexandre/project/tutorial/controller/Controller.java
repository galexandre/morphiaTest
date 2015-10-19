package fr.galexandre.project.tutorial.controller;

import fr.galexandre.project.tutorial.dao.PersonDAO;
import fr.galexandre.project.tutorial.model.Person;
import fr.galexandre.project.tutorial.mongo.MongoDbConnector;

/**
 * Created by galexandre on 13/10/15.
 */
public class Controller {

    private MongoDbConnector dbConnector = MongoDbConnector.getMongoDBConnectorInstance();
    private PersonDAO pDAO;
    /**
     * Empty Constructor
     */
    public Controller(){
        pDAO = new PersonDAO(Person.class,dbConnector.getMongoClient(),dbConnector.getMorphia(),"dbExample");
        pDAO.setDatastore(dbConnector.getDatastore());
    }

    /**
     * Add a person to the database
     * @param p a person (see Person.java)
     */
    public void addPerson(Person p){

        try{
            if(p!=null){
                System.out.println("Insert data");
                pDAO.store(p);
            }
        }catch (Exception e){
            System.err.println("the object:"+p+" is null");
        }

    }

    public String getAllPeopleInDatabase(){
        return  pDAO.getPersons().toString();
    }

}
