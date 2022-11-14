package pe.ineapp.ineapppersonaservice.Person.infrastracture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ineapp.ineapppersonaservice.Person.domain.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

    public Person findByDni(String dni);


}
