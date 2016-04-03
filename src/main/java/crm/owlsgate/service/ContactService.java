package crm.owlsgate.service;

import java.util.List;

import crm.owlsgate.model.Contact;


public interface ContactService {
	List<Contact> findAll();

	Contact Save(Contact contact);
}
