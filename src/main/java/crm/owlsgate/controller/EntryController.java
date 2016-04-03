package crm.owlsgate.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import crm.owlsgate.model.Entry;
import crm.owlsgate.service.EntryService;

@Controller
@SessionAttributes("entry")
public class EntryController {

	@Autowired
	private EntryService entryService;
	
	@RequestMapping(value = "newEntry", method = RequestMethod.GET)
	public String addNewEntry(Model model)
	{
		Entry entry = new Entry();
		entry.setCompany("COPFS");
		entry.setJobTitle("Java Developer");
		entry.setDatePosted(new Date());
		model.addAttribute("entry", entry);
		
		return "newEntry";
	}
	
	@RequestMapping(value = "newEntry", method = RequestMethod.POST)
	public String updateNewEntry(@ModelAttribute("entry") Entry entry, BindingResult result) {
		
		System.out.println("Entry added: " + entry.getJobTitle());
		
		if (result.hasErrors())
		{
			return "newEntry";
		}
		else {
			entryService.Save(entry);
		}
		return "redirect:home.html";
	}
}