package com.form.spring.common;

import org.springframework.stereotype.Component;

import com.form.spring.model.ContactUs;
import com.form.spring.common.GenericBackendResponse;
import com.form.spring.common.Utils;
import com.form.spring.dao.ContactUsDao;

@Component
public class ContactUsService {
	
	public GenericBackendResponse contactUsSave(ContactUs contactUs) {
		GenericBackendResponse response = new GenericBackendResponse();
		if (Utils.isNotEmpty(contactUs.getEmail()) && Utils.isNotEmpty(contactUs.getName()) && Utils.isNotEmpty(contactUs.getPassword()) 
				&& Utils.isNotEmpty(contactUs.getRePassword())) {
			ContactUsDao.persist(contactUs);
			response.setMsg("your form has been submitted successfully");
			response.setS(true);
		} else {
			response.setEd("Fields are missing");
		}
		return response;
		
	}
	
		
	
}
