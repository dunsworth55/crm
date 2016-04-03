package crm.owlsgate.service;

import java.util.List;

import crm.owlsgate.model.Entry;

public interface EntryService {

	List<Entry> findAllEntries();

	Entry Save(Entry entry);
}
