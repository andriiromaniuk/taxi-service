package taxi_service.dao;

import java.util.List;
import taxi_service.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
