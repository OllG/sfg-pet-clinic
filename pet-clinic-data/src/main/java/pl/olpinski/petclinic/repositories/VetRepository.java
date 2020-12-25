package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
