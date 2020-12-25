package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
