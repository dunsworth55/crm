package crm.owlsgate.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crm.owlsgate.model.Entry;


@Service("entryService")
@Transactional
public class EntryServiceImpl implements EntryService {

	@Autowired
	private crm.owlsgate.repository.EntryRepository entryRepository;
	
	@Transactional
	public List<Entry> findAllEntries() {
		
		List<Entry> entries = new ArrayList<Entry>();
		
		entries = entryRepository.findAll();
		
		return entries;
	}

	@Transactional
	public Entry Save(Entry entry) {
		return entryRepository.save(entry);
	}
	
}