package crm.owlsgate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crm.owlsgate.model.Entry;

@Repository()
public interface EntryRepository extends JpaRepository<Entry, Long> {

}
