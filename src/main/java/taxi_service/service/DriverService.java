package taxi_service.service;

import java.util.Optional;
import taxi_service.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String username);
}
