package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;


@Service
public class ContactServiceImpl implements ContactService {
	
	List<Contact> list = List.of(
			new Contact(10,"jack@gmail.com","Jack Ryan",1),
			new Contact(11,"Ammy@gmail.com","Ammy T",1),
			new Contact(12,"Michel@hotmail.com","Clark Michel",1),
			new Contact(20,"Justin@Yahoo.com","Justin Biber",2),
			new Contact(21,"Bisoi@gmail.com","Abhishek Bisoi",3)
			);
	

	@Override
	public List<Contact> getContactOfUser(int id) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId() == id).collect(Collectors.toList());
	}
	
	

}
