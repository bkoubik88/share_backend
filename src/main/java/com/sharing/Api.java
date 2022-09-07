package com.sharing;

import java.io.Serializable;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class Api implements Serializable {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private Email mail;

	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
	public String registerUser(@PathVariable String userId) {
		boolean gesendet = false;
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(userId));

		UserMD user = mongoTemplate.findOne(query, UserMD.class);



		try {
			gesendet = mail.sendEmailMime(user.getEmail(),userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return gesendet ? "Email wurde gesendet" : "";
	}

}
