package crm.owlsgate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crm.owlsgate.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {


}
