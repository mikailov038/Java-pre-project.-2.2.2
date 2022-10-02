package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.CarModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<CarModel> getCarsList(int count) {
        if (count >= 5) {
            return carDao.getCarModelsList();
        } else {
            return carDao.getCarModelsList().stream().limit(count).collect(Collectors.toList());
        }
    }
}
