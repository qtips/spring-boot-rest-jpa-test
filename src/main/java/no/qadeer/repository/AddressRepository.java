package no.qadeer.repository;

import no.qadeer.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// From spring-boot-starter-data-rest - creates a rest controller automatically

//@RepositoryRestResource(path = "/address", )  // optional. to set the path.
@Repository //default rest path is /addresses
public interface AddressRepository extends CrudRepository<Address, Long> {
}
