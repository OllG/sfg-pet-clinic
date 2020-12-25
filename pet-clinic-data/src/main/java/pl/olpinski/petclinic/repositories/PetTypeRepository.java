package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
