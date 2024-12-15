package com.ef.gutierrez.riveros.eddy.santiago.service;

import com.ef.gutierrez.riveros.eddy.santiago.dto.CarDTO;
import com.ef.gutierrez.riveros.eddy.santiago.dto.CarDetailDTO;

import java.util.List;
import java.util.Optional;

public interface MaintenanceService {

    List<CarDTO> getAllCars() throws Exception;

    Optional<CarDTO> getCarDTOById(int id) throws Exception;

    Optional<CarDetailDTO> getCarDetailById(int id) throws Exception;

    Boolean deleteCarById(int id) throws Exception;

    Boolean addCar(CarDetailDTO carDetailDTO) throws Exception;

    Boolean updateCar(CarDetailDTO carDetailDTO) throws Exception;

}
