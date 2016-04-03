package crm.owlsgate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import crm.owlsgate.model.Contact;
import crm.owlsgate.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping(value = "/contacts", method = RequestMethod.GET)
	public String addNewEntry(Model model)
	{
		Contact contact = new Contact();
		contact.setForename("Brad");
		contact.setMobilePhoneNumber("1234");
		model.addAttribute("contact", contact);
		return "contacts";
	}
	
	@RequestMapping(value = "/contacts", method = RequestMethod.POST)
	public String updateNewEntry(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
		
		System.out.println("Contact added: " + contact.getSurname());
		
		if (result.hasErrors())
		{
			return "updateNewContact";
		}
		else {
			contactService.Save(contact);
		}
		return "contacts";
	}
	
//	@RequestMapping(value = "getContacts", method = RequestMethod.GET)
//	public String getContacts(Model model) 
//	{
//		List<Contact> contacts = contactService.findAll();
//		model.addAttribute("contacts", contacts);
//		return "contacts";
//	}
}
