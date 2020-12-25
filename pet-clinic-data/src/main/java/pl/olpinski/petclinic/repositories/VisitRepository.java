package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
