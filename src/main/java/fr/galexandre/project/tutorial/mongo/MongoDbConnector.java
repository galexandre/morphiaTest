package fr.galexandre.project.tutorial.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import fr.galexandre.project.tutorial.model.Address;
import fr.galexandre.project.tutorial.model.Person;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.List;

/**
 * Created by galexandre on 01/10/15.
 */
public class MongoDbConnector {

    /* Design pattern Singleton only one instance
     *  of this connector can be active.
     */


    //Define a private static final instance
    private static final MongoDbConnector MONGO_DB_CLIENT_INSTANCE = new MongoDbConnector();
    //important variable
    private MongoClient myClient;
    private MongoDatabase myDatabase;
    private Morphia morphia;
    private Datastore ds;

    /**
     * Constructor
     */
    private MongoDbConnector(){
        //create a new client
        myClient = new MongoClient("localhost");
        //get the database
        myDatabase = myClient.getDatabase("dbExample");
        //Morphia
        morphia = new Morphia();
        //We map the class
        morphia.map(Person.class);
        morphia.map(Address.class);
        //create the datastore
        ds = this.morphia.createDatastore(myClient,"dbExample");
        ds.ensureIndexes();
        ds.ensureCaps();
    }

    /**
     * Return the instance of the MongoClient
     * @return the instance of the mongo client
     */
    public static MongoDbConnector getMongoDBConnectorInstance(){
        return MONGO_DB_CLIENT_INSTANCE;
    }

    /**
     * Return the datastore declare in the
     * @return
     */
    public Datastore getDatastore(){
        return this.ds;
    }

    public MongoClient getMongoClient(){
        return this.myClient;
    }

    public Morphia getMorphia(){
        return this.morphia;
    }
}
