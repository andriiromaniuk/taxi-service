package taxi_service.service;

import taxi_service.exception.AuthenticationException;
import taxi_service.model.Driver;

public interface AuthenticationService {
    Driver login(String username, String password) throws AuthenticationException;
}
