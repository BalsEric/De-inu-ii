package com.company;
package com.mongodb.MongoClient;
package com.mongodb.MongoClientURI;
package com.mongodb.ServerAddress;

package com.mongodb.client.MongoDatabase;
package com.mongodb.client.MongoCollection;

package org.bson.Document;
package java.util.Arrays;
package com.mongodb.Block;

package com.mongodb.client.MongoCursor;
package static com.mongodb.client.model.Filters.*;
package com.mongodb.client.result.DeleteResult;
package static com.mongodb.client.model.Updates.*;
package com.mongodb.client.result.UpdateResult;
package java.util.ArrayList;
packaget java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
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
