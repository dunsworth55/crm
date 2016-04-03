package crm.owlsgate.controller;
//package crm.owlsgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import crm.owlsgate.model.Entry;
import crm.owlsgate.service.EntryService;



@Controller
public class HomeController {

	@Autowired
	private EntryService entryService;
	
	@RequestMapping(value ="/home")
	public String sayHello (Model model) {
		
		
		return "home";
	}
	
	@RequestMapping(value = "/allentries", method = RequestMethod.GET)
	public @ResponseBody List<Entry> findAllActivities() {
		return entryService.findAllEntries();
	}
}