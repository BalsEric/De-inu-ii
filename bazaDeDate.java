import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class program {
    public static void Connect(){
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://eric:ventilator1@cluster0.kcufg.mongodb.net/Detinuti?retryWrites=true&w=majority"));
        DB database = mongoClient.getDB("Detinuti");
    }
    public static DBObject CreateDBObject(){
        DBCollection collection = database.getCollection("prizonieri");
        BasicDBObject prizonier = new BasicDBObject();
        prizonier.put("name", "Shubham");
        prizonier.put("company", "Baeldung");
        collection.insert(prizonier);
    }

    /*
    public static final DBObject toDBObject(Person person) {
        return new BasicDBObject("_id", person.getId())
                        .append("name", person.getName())
                        .append("address", new BasicDBObject("street", person.getAddress().getStreet())
                                                    .append("city", person.getAddress().getTown())
                                                    .append("phone", person.getAddress().getPhone()))
                        .append("books", person.getBookIds());


    }
    public static insertToDB(){
        collection.insert(PersonAdaptor.toDBObject(myPerson));
    }
    */
}