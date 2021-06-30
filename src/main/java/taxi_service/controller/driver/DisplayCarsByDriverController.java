package taxi_service.controller.driver;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxi_service.lib.Injector;
import taxi_service.model.Car;
import taxi_service.service.CarService;

@WebServlet(urlPatterns = "/drivers/cars")
public class DisplayCarsByDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi_service");
    private final CarService carService = (CarService) injector
            .getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long userId = (Long) req.getSession().getAttribute("user_id");
        List<Car> cars = carService.getAllByDriver(userId);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp").forward(req, resp);
    }
}