package web.service;

import web.model.CarModel;

import java.util.List;

public interface CarService {

    List<CarModel> getCarsList(int count);
}
