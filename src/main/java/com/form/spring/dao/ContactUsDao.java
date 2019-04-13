package com.form.spring.dao;

import org.mongodb.morphia.Datastore;

import com.form.spring.mongo.ConnectionFactory;
import com.form.spring.model.ContactUs;


public class ContactUsDao {
	
	public static void persist(ContactUs contactUs) {
		Datastore datastore = ConnectionFactory.getInstance().getDatastore();
		datastore.save(contactUs);
	}

}
