package web.dao;

import org.springframework.stereotype.Repository;
import web.model.CarModel;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<CarModel> cars;

    {
        cars = new ArrayList<>();
        cars.add(new CarModel("Mercedes-Benz", "A-Class", 2010));
        cars.add(new CarModel("Mercedes-Benz", "B-Class", 2011));
        cars.add(new CarModel("Mercedes-Benz", "C-Class", 2012));
        cars.add(new CarModel("Mercedes-Benz", "E-Class", 2013));
        cars.add(new CarModel("Mercedes-Benz", "S-Class", 2014));
    }

    @Override
    public List<CarModel> getCarModelsList() {
        return cars;
    }
}
