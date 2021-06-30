package taxi_service.service;

import java.util.Optional;
import taxi_service.exception.AuthenticationException;
import taxi_service.lib.Injector;
import taxi_service.lib.Service;
import taxi_service.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("taxi_service");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public Driver login(String username, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(username);
        if (driver.isEmpty()) {
            throw new AuthenticationException("Username or password was incorrect");
        }
        if (driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Username or password was incorrect");
    }
}
