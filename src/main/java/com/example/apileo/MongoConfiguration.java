package com.example.apileo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {


    @Override
    protected String getDatabaseName() {
        return "heroku_lr58z8b1";
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017/?replicaSet=rs0&w=majority");
    }
}
