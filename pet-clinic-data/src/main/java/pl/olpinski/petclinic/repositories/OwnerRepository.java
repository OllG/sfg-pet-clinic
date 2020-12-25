package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
