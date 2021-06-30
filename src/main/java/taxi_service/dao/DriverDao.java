package taxi_service.dao;

import java.util.Optional;
import taxi_service.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String username);
}
