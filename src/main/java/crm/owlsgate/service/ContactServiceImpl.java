package crm.owlsgate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crm.owlsgate.model.Contact;

@Service("contactService")
public class ContactServiceImpl implements ContactService {
	@Autowired
	private crm.owlsgate.repository.ContactRepository contactRepository;
	
	@Transactional
	public List<Contact> findAll() {
		
		List<Contact> entries = new ArrayList<Contact>();
		
		entries = contactRepository.findAll();
		
		return entries;
	}

	@Transactional
	public Contact Save(Contact contact) {
		return contactRepository.save(contact);
	}
}
