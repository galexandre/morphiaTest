package fr.galexandre.project.tutorial.dao;

import com.mongodb.MongoClient;
import fr.galexandre.project.tutorial.model.Person;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by galexandre on 16/10/15.
 */
public class PersonDAO extends BasicDAO<Person,ObjectId> {

    private Datastore ds;

    /**
     * Constructor
     * @param entityClass : an entity of the person class
     * @param mongoClient : the mongo client
     * @param morphia : a morphia instance
     * @param dbName : the name of the databse
     */
    public PersonDAO(Class<Person> entityClass, MongoClient mongoClient, Morphia morphia, String dbName) {
        super(entityClass, mongoClient, morphia, dbName);
    }

    /**
     * Return a list of person
     * @return a list of person
     */
    public List<Person> getPersons(){
        List<Person> lst;
        try{
            lst = this.ds.find(Person.class).asList();
        }catch (Exception e){
            System.err.println("No person in the database " +e);
            lst = new ArrayList<Person>();
        }
        return lst;
    }

    /**
     * Set a datastore to persit data
     * @param ds
     */
    public void setDatastore(Datastore ds){
        this.ds=ds;
    }

    /**
     * Store a person to the database
     * @param p a person
     */
    public void store(Person p){
        this.ds.save(p);
        System.out.println("id:"+p.getId());
    }
}