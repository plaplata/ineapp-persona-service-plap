package pe.ineapp.ineapppersonaservice.Person.application.service;

import pe.ineapp.ineapppersonaservice.Person.domain.entity.Person;
import pe.ineapp.ineapppersonaservice.Person.infrastracture.request.UserRequest;
import pe.ineapp.ineapppersonaservice.Person.infrastracture.response.BasicResponse;
import pe.ineapp.ineapppersonaservice.Person.infrastracture.response.UserResponse;

import java.util.List;

public interface PersonService {
    public BasicResponse addUser(UserRequest request);

    public UserResponse getAll();

    public UserResponse getByDni(String dni);

    public BasicResponse updateUser(UserRequest request, String dni);

    public BasicResponse deleteUser(String dni);

}
