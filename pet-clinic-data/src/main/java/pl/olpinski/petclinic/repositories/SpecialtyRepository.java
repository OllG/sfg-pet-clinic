package pl.olpinski.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.olpinski.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
