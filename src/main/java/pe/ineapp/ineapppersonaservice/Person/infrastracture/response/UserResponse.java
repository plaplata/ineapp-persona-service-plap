package pe.ineapp.ineapppersonaservice.Person.infrastracture.response;

import lombok.Builder;
import lombok.Data;
import pe.ineapp.ineapppersonaservice.Person.domain.entity.Person;

import java.util.List;


@Builder
@Data
public class UserResponse {
    private List<Person> personList;
    private BasicResponse basicResponse;



}
